package petshop;

public class Reptil extends Animal{
	private final String corEscamas;
	
	public Reptil(String nome, Raca raca, double peso, String corEscamas, String doenca) {
		super(nome, raca, peso, doenca);
		
		this.corEscamas = corEscamas;
		
	}

	public String getCorEscamas() {
		return corEscamas;
	}

	public String toString() {
	       return "Animal{" + "nome=" + nome + ", cor=" + corEscamas + ", diagnostico=" + diagnostico + '}';
}
     
	
	
	
}

	
	
	
	


