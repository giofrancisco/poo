package videogame;

public abstract class VideoGame {
	
	protected String processador;
	protected double hd;
	protected Midia midia;
		
	public VideoGame(String processador, double hd, Midia midia) {
		this.processador = processador;
		this.hd = hd;
		this.midia = midia;
	}
	public double getHd() {
		return hd;
	}
	public void setHd(double hd) {
		this.hd = hd;
	}
	public Midia getMidia() {
		return midia;
	}
	public void setMidia(Midia midia) {
		this.midia = midia;
	}
	public String getProcessador() {
		return processador;
	}
	
	public String toString() {
		return "Videogame [processador=" + this.processador + ", midia=" + this.midia+ "]";
	}
	
	

}
