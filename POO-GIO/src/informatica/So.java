package informatica;

public class So {
	protected String fabricante;
	protected String versao;
	protected String arquitetura;
	
	public So(String fabricante, String versao, String arquitetura) {
		
		this.fabricante = fabricante;
		this.versao = versao;
		this.arquitetura = arquitetura;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getVersao() {
		return versao;
	}

	public String getArquitetura() {
		return arquitetura;
	}

	@Override
	public String toString() {
		return "So [fabricante=" + this.fabricante + ", versao=" + this.versao+ ", arquitetura=" + this.arquitetura + "]";
	}
	
	
	
	
}
