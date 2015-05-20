package exerciciointefacegio;

public abstract class Funcionario {

	protected String cadastro;
	protected String nome;
	protected String cargo;
	protected double salario;

	public Funcionario(String cadastro, String nome, String cargo,
			double salario) {
		super();
		this.cadastro = cadastro;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCadastro() {
		return cadastro;
	}
}