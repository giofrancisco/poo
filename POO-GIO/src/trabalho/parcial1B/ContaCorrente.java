package trabalho.parcial1B;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class ContaCorrente {
	
	protected int numeroConta;
	protected int agencia;
	protected Correntista correntista;
	protected double saldo; 
	protected FileWriter criarTxt;
	protected int logs;
	
	public ContaCorrente(int numeroConta, int agencia, Correntista correntista, double saldo) throws IOException {
		super();
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.correntista = correntista;
		this.saldo = saldo;
		this.criarTxt = new FileWriter ("C:/Users/Nina e Bi/Documents/LogsContaCorrente/" + numeroConta + ".txt");
		logs = 0;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Correntista getCorrentista() {
		return correntista;
	}
	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}
	
	protected abstract void sacar(double valor) throws IOException;
	protected abstract void depositar(double valor) throws IOException;
	protected abstract void transferir(double valor, ContaCorrente destinatario) throws IOException;
	protected abstract void emitirSaldo();
	
	protected String getHoraData(){
		
		Calendar calendarData = new GregorianCalendar();
		SimpleDateFormat sdtData = new SimpleDateFormat("dd/mm/yyyy");
		Date dateData = new Date();
		calendarData.setTime(dateData);
		
		Calendar calendarHora = new GregorianCalendar();
		SimpleDateFormat sdtHora = new SimpleDateFormat("hh:mm:ss");
		Date dateHora = new Date();
		calendarData.setTime(dateHora);
		
		String HoraData = sdtData.format(calendarData.getTime()) + "  " + sdtHora.format(calendarHora.getTime());
				
		return HoraData;
	}
	
	protected void criarLog(String descricao) throws IOException{
		PrintWriter gravarTxt = new PrintWriter(this.criarTxt);
		
		if (logs == 0){
			gravarTxt.print(getHoraData() + " | " + descricao);
			gravarTxt.close();
		
		} else {
			FileWriter fw = new FileWriter("C:/Users/Nina e Bi/Documents/LogsContaCorrente/" + numeroConta + ".txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.newLine();		
			bw.write(getHoraData() + " | " + descricao);
				
			bw.close();
			fw.close();

		}
		
		logs++;
		
	}
	
	protected String[] extrato(){
		String[] log = new String[logs];
		int i = 0;
		
		try {
			FileReader fileReadArq = new FileReader("C:/Users/Nina e Bi/Documents/LogsContaCorrente/" + numeroConta + ".txt");
			BufferedReader bufferReadArq = new BufferedReader(fileReadArq);
			
			String linha = bufferReadArq.readLine();

			while (linha != null){
				log[i] = linha;
				i++;
				linha = bufferReadArq.readLine();					
				
			}
			
			fileReadArq.close();
			
		} catch(IOException e){
			System.err.printf("Erro ao abrir o arquivo %s \n", e.getMessage());
		}
		
		return log;
	}
	
	public String imprimirExtrato(){
		String extrato = "Extrato conta nº: " + numeroConta + "\n";
		
		for(int i = 0; i < logs; i++){
			extrato += extrato()[i] + "\n";
		}
		extrato += "Saldo da conta: " + saldo + "\n";
		
		return extrato;

	}
	
	@Override
	public String toString() {
		return "ContaCorrente [numeroConta=" + numeroConta + ", agencia="
				+ agencia + ", correntista=" + correntista + ", saldo=" + saldo
				+ "]";
	}
}