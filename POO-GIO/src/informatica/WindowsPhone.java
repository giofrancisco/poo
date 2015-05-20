package informatica;

public class WindowsPhone extends Windows{
	private String licenca;
	
	public WindowsPhone(String fabricante, String versao, String arquitetura,String sistemaArquivos, String licenca) {
		super(fabricante, versao, arquitetura, sistemaArquivos);
		this.licenca = licenca;
	}
	public String getLicenca() {
		return licenca;
	}
	@Override
	public String toString() {
		return "WindowsPhone [licenca=" + licenca + super.toString();
	}
}
