package videogame;

public class PlayStation extends VideoGame{
	
	private String descricao;
	private Move move;
	
	public PlayStation(String processador, double hd, Midia midia, String descricao, Move move) {
		super(processador, hd, midia);
		this.descricao = descricao;
		this.move = move;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Move getMove() {
		return move;
	}

	public void setMove(Move move) {
		this.move = move;
	}
	
	public String toString() {
		return "Xbox "+move+ " "+ super.toString();
		
		// super.toString() para pegar atributos da super classe
	}
	
	

}
