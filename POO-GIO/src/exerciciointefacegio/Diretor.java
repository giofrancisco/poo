package exerciciointefacegio;

public class Diretor extends Lider{

	public Diretor(String cadastro, String nome, String cargo, double salario,
			String login, String senha) {
		super(cadastro, nome, cargo, salario, login, senha);
		
	}

	@Override
	public void logarSistema() {
		System.out.println(nome + "login efetuado com sucesso");
		
	}
	

}
