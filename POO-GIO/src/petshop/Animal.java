package petshop;

public class Animal {
	
	protected String nome;
	protected Raca raca; 
	protected double peso;
	protected String doenca;
	protected String diagnostico;
	
	
	public Animal(String nome, Raca raca, double peso, String doenca) {
		
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
		this.doenca = doenca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getDoenca() {
		return doenca;
	}
	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}
	public String getDiagonostico() {
		return diagnostico;
	}
	public void setDiagonostico(String diagonostico) {
		this.diagnostico = diagonostico;
	}
	public Raca getRaca() {
		return raca;
	}
	
	public String toString() {
		return "Animal [nome=" + nome + ", raca=" + raca + ", peso=" + peso	+ ", doenca=" + doenca + ", diagonostico=" + diagnostico + "]";
	
    }
	
	
	
	

}
