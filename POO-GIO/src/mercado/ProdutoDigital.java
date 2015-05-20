package mercado;

public class ProdutoDigital extends Produto{
	private Formato formato;
	private double tamanhoEmkb;
	
	public ProdutoDigital(int id, String descricao, double preco,Categoria produto, Formato formato, double tamanhoEmkb) {
		super(id, descricao, preco, produto);
		this.setFormato(formato);
		this.setTamanhoEmkb(tamanhoEmkb);
	}
	public Formato getFormato() {
		return formato;
	}
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	public double getTamanhoEmkb() {
		return tamanhoEmkb;
	}
	public void setTamanhoEmkb(double tamanhoEmkb) {
		this.tamanhoEmkb = tamanhoEmkb;
	}
	@Override
	public String toString() {
		return "ProdutoDigital [formato=" + formato + ", tamanhoEmkb="+ tamanhoEmkb + super.toString();
	}
}