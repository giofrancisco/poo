package informatica;

public class Dispositivo {
	
	protected String processador;
	protected String hd;
	protected String memoria;
	protected So sistema;
	
	public Dispositivo(String processador, String hd, String memoria, So sistema) {
	
		this.processador = processador; 
		this.hd = hd;
		this.memoria = memoria;
		this.sistema = sistema;
	}

	public String getHd() {
		return hd;
	}

	public void setHd(String hd) {
		this.hd = hd;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public So getSistema() {
		return sistema;
	}

	public void setSistema(So sistema) {
		this.sistema = sistema;
	}

	public String getProcessador() {
		return processador;
	}

	@Override
	public String toString() {
		return "Dispositivo [processador=" + this.processador + ", hd=" + this.hd	+ ", memoria=" + this.memoria + ", sistema=" + this.sistema + "]";
	}
}
