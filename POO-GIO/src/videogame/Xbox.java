package videogame;

public class Xbox extends VideoGame{
	
	private String descricao;
	private Kinect kinect;
	
	public Xbox(String processador, double hd, Midia midia, String descricao,Kinect kinect) {
		super(processador, hd, midia);
		this.setDescricao(descricao);
		this.kinect = kinect;
	}

	public Kinect getKinect() {
		return kinect;
	}

	public void setKinect(Kinect kinect) {
		this.kinect = kinect;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString() {
		return "Xbox "+kinect+ " "+ super.toString();
		
		// super.toString() para pegar atributos da super classe
	}
	
	
	
	
	

}
