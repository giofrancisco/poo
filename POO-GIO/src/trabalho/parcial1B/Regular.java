package trabalho.parcial1B;

import java.io.IOException;

public class Regular extends ContaCorrente{

	public Regular(int numeroConta, int agencia, Correntista correntista, double saldo) throws IOException {
		super(numeroConta, agencia, correntista, saldo);
		
	}

	@Override
	public void sacar(double valor) throws IOException {
		
		if (this.saldo >= valor){
			this.saldo -= valor;
			String descricao = "Conta: " + numeroConta + " Saque de: R$" + valor;
			criarLog(descricao);
		} else 
			System.out.println("Saldo Insuficiente");
	}

	@Override
	public void depositar(double valor) throws IOException {
		this.saldo += valor;
		String descricao = "Conta: " + numeroConta + " Deposito de: R$" + valor;
		criarLog(descricao);
	}

	@Override
	public void transferir(double valor, ContaCorrente destinatario) throws IOException {
		if (this.saldo >= valor){
			this.sacar(valor);
			destinatario.depositar(valor);
			String descricao = "Conta: " + numeroConta + " Transferência de: R$" + valor + " para " + destinatario.numeroConta;
			criarLog(descricao);
		} else
			System.out.println("Saldo insuficiente para transferir");
		
	}

	@Override
	public void emitirSaldo() {
			System.out.println("Saldo da conta nº:" + this.getNumeroConta() + " é " + this.saldo + "\n");
		}
	
	}