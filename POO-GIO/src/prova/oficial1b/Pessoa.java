package prova.oficial1b;

public abstract class Pessoa {
	
	protected int codigo;
	protected Sexo sexo;
	protected String nome;
	protected Aluno aluno;
	
	public Pessoa(int codigo, Sexo sexo, String nome) {
		super();
		this.codigo = codigo;
		this.sexo = sexo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}