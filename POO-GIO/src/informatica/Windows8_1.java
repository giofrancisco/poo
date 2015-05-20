package informatica;

public class Windows8_1 extends Windows{
	
	private String licenca;
	
	public Windows8_1(String fabricante, String versao, String arquitetura,	String sistemaArquivos, String licenca) {
		super(fabricante, versao, arquitetura, sistemaArquivos);
		this.licenca = licenca;
	}

	public String getLicenca() {
		return licenca;
	}

	@Override
	public String toString() {
		return "Windows8_1 [licenca=" + licenca + super.toString();
	}
}
