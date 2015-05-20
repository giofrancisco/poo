package informatica;

public class Ios extends So{
	
	private String sistemaArquivos;
	
	public Ios(String fabricante, String versao, String arquitetura, String sistemaArquivos) {
		super(fabricante, versao, arquitetura);
		this.sistemaArquivos = sistemaArquivos;
	}
	public String getSistemaArquivos() {
		return sistemaArquivos;
	}
	@Override
	public String toString() {
		return "Ios [sistemaArquivos=" + sistemaArquivos + super.toString();
	}
}
