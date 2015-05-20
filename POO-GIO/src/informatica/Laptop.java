package informatica;

public class Laptop extends Dispositivo{
	
	private String modelo;
	
	public Laptop(String processador, String hd, String memoria, So sistema, String modelo) {
		super(processador, hd, memoria, sistema);
		this.modelo = modelo;
		
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Laptop [modelo=" + modelo + super.toString();
	}
	
	

}
