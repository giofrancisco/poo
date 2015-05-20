package informatica;

public class Linux extends So{
	
	private String sistemaArquivos;
	public Linux(String fabricante, String versao, String arquitetura, String sistemaArquivos) {
		super(fabricante, versao, arquitetura);
		this.sistemaArquivos = sistemaArquivos;
	}
	public String getSistemaArquivos() {
		return sistemaArquivos;
	}
	@Override
	public String toString() {
		return "Linux [sistemaArquivos=" + sistemaArquivos + super.toString();
	}
	
}
