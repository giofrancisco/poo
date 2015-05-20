package mercado;

public class ProdutoAnalogico extends Produto{
	
	private double peso;
	private double dimensoes;
	
	public ProdutoAnalogico(int id, String descricao, double preco,	Categoria produto, double peso, double dimensoes) {
		super(id, descricao, preco, produto);
		this.setPeso(peso);
		this.setDimensoes(dimensoes);
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getDimensoes() {
		return dimensoes;
	}
	public void setDimensoes(double dimensoes) {
		this.dimensoes = dimensoes;
	}
	@Override
	public String toString() {
		return "produtoAnalogico [peso=" + peso + ", dimensoes=" + dimensoes+ super.toString();
	}
}