package exerciciointefacegio;

public class Consultor implements  Login{
	
	protected String login;
	protected String senha;
	
	public Consultor(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public void logarSistema() {
	System.out.println("Consultor logado com sucesso");
	
}
	

}
