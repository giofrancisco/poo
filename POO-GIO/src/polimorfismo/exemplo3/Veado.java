package polimorfismo.exemplo3;

public class Veado extends Animal {

	@Override
	public String emitirSom() {
		return "qualquer outra coisa";
	}

	public void serCacado() {

		System.out.println("Socorro...socorro, um leão quer me pegar!!!");

	}
}
