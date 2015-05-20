package exerciciointefacegio;

public abstract class Lider extends Funcionario implements Login {

	protected String login;
	protected String senha;

	public Lider(String cadastro, String nome, String cargo, double salario,
			String login, String senha) {
		super(cadastro, nome, cargo, salario);
		this.login = login;
		this.senha = senha;

	}

}
