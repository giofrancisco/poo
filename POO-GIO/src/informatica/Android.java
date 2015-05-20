package informatica;

public class Android extends So{

	private String sistemaArquivos;
	
	public Android(String fabricante, String versao, String arquitetura, String sistemaArquivos) {
		super(fabricante, versao, arquitetura);
		this.sistemaArquivos = sistemaArquivos;
	}
	public String getSistemaArquivos() {
		return sistemaArquivos;
	}
	@Override
	public String toString() {
		return "Android [sistemaArquivos=" + sistemaArquivos + super.toString();
	}
}
