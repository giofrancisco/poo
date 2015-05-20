package petshop;

public class Dono {
	
	private String nome;
	private String cpf;
	private String endereco;
	private Animal animal;
	
	public Dono(String nome, String cpf, String endereco, Animal animal) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.animal = animal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	
	public String toString() {
		return "Dono [nome=" + nome + ", cpf=" + cpf + ", Endereco=" + endereco	+ ", animal=" + animal + "]";
	}
	
	
	
	
	

}
