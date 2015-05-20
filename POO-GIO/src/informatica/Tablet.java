package informatica;

public class Tablet extends Dispositivo{

	private String modelo;
	
	public Tablet(String processador, String hd, String memoria, So sistema, String modelo) {
		super(processador, hd, memoria, sistema);
		this.setModelo(modelo);
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Tablet [modelo=" + modelo + super.toString();
	}
}
