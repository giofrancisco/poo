package informatica;

public class Windows extends So{
	
	protected String sistemaArquivos;
	
	public Windows(String fabricante, String versao, String arquitetura, String sistemaArquivos) {
		super(fabricante, versao, arquitetura);
		this.sistemaArquivos = sistemaArquivos;		
	}
	public String getSistemaArquivos() {
		return sistemaArquivos;
	}
	public void setSistemaArquivos(String sistemaArquivos) {
		this.sistemaArquivos = sistemaArquivos;
	}
	@Override
	public String toString() {
		return "Windows [sistemaArquivos=" + sistemaArquivos + super.toString();
	}
}
