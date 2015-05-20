package trabalho.parcial1B;

import java.io.IOException;

public class Gold extends ContaCorrente{

	private double limite;
	private double limiteUtilizado = 0;
	
	public Gold(int numeroConta, int agencia, Correntista correntista, double saldo, double limite) throws IOException {
		super(numeroConta, agencia, correntista, saldo);
		this.limite = limite;
	}
	
	@Override
	public void sacar(double valor) throws IOException {
		double temp = 0;
		
		if (this.saldo >= valor){
			this.saldo -= valor;
			String descricao = "Conta: " + numeroConta + " Saque de: R$" + valor;
			criarLog(descricao);
		}
		
		else if (this.saldo + this.limite >= valor){
			this.saldo -= valor;
			temp = this.saldo;
			this.saldo = 0;
			temp *= (-1);
			limiteUtilizado += temp;
			this.limite -= temp;
			String descricao = "Conta: " + numeroConta + " Saque de: R$" + valor;
			criarLog(descricao);
		}
		
		else{
			System.out.println("Saldo e limite insuficiente.");
		}
	}

	@Override
	public void depositar(double valor) throws IOException {

		if(limiteUtilizado >= 0){

			if(limiteUtilizado < valor){
				this.limite += limiteUtilizado;
				limiteUtilizado -= valor;
				limiteUtilizado *= (-1);
				this.saldo += limiteUtilizado;
				limiteUtilizado = 0;
				String descricao = "Conta: " + numeroConta + " Deposito de: R$" + valor;
				criarLog(descricao);
			} else{
				limiteUtilizado -= valor;
				this.limite += valor;
				String descricao = "Conta: " + numeroConta + " Deposito de: R$" + valor;
				criarLog(descricao);
			}
		} else{
			this.saldo += valor;
			String descricao = "Conta: " + numeroConta + " Deposito de: R$" + valor;
			criarLog(descricao);
		}
		
	}

	@Override
	public void transferir(double valor, ContaCorrente destinatario) throws IOException {
		if (this.saldo >= valor){
			sacar(valor);
			destinatario.depositar(valor);
			String descricao = "Conta: " + numeroConta + " Transferência de: R$" + valor + " para " + destinatario.numeroConta;
			criarLog(descricao);
		} else if (this.limite + this.saldo >= valor){
				sacar(valor);
				destinatario.depositar(valor);
				String descricao = "Conta: " + numeroConta + " Transferência de: R$" + valor + " para " + destinatario.numeroConta;
				criarLog(descricao);
		}else
			System.out.println("Saldo e limites insuficientes para transferir.");
		
	}

	@Override
	public void emitirSaldo() {
		System.out.println("Saldo da conta nº:" + this.getNumeroConta()+ " é " + this.saldo);
		System.out.println("Limite da conta:" + this.limite + "\n");
		
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getLimiteUtilizado() {
		return limiteUtilizado;
	}

}