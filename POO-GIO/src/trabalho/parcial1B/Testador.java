package trabalho.parcial1B;

import java.io.IOException;

public class Testador {

	public static void main(String[] args) throws IOException {

		Correntista c1 = new Correntista("Kakaroto", "123.456.789-10");
		Gold g1 = new Gold(123, 0123, c1, 800, 1000);
		
		Correntista c2 = new Correntista("Kuririn", "109.876.543-21");
		Regular r1 = new Regular(321, 3210, c2, 2000);

		
		g1.sacar(1200);
		g1.depositar(100);
		g1.transferir(200, r1);
		
		r1.sacar(50);
		r1.depositar(600);
		r1.transferir(700, g1);
		
		g1.emitirSaldo();
		r1.emitirSaldo();
		
		g1.extrato();
		r1.extrato();
		
		System.out.println(g1.imprimirExtrato());
		System.out.println(r1.imprimirExtrato());
		
	}

}
