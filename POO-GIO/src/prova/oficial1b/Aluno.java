package prova.oficial1b;

public class Aluno extends Pessoa{
	private double[] nota = new double[3];
	private double media;
	
	public Aluno(int codigo, Sexo sexo, String nome, double[] nota) {
		super(codigo, sexo, nome);
		this.nota = nota;
		
	}
	
	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	@Override
	public String toString() {
		return "Aluno [codigo=" + codigo + ", nome=" + nome + "]";
	}

}