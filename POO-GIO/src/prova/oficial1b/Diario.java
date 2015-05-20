package prova.oficial1b;

public class Diario extends Aluno{
	private String turma;
	private Aluno[] lista = new Aluno[30];
	
	public Diario(int codigo, Sexo sexo, String nome, double[] nota,
			double media) {
		super(codigo, sexo, nome, nota);
	}
	
	public void adicionarAluno(Aluno aluno){
		for (int i = 0; i < 30; i++){
			if (lista[i] == null){
				lista[i] = aluno;
				break;
			}
		}
	}
	
	public double calcularMedia(Aluno aluno){
		double media = 0;
		for (int i = 0; i < 30; i++){
			if (lista[i] == aluno){
			media = (this.getNota()[0] + this.getNota()[1] + this.getNota()[2])/3;
			this.setMedia(media);	
			}
		}
		return media;
		
	}
	
	public Aluno[] verificarReprovados(){
		
		for(int i = 0; i<30; i++){
			if(lista[i].getMedia() <= 7){
				 
			}
				
		}
		return lista;
		
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public Aluno[] getLista() {
		return lista;
	}

	public void setLista(Aluno[] lista) {
		this.lista = lista;
	}
}