package mercado;

public class Produto {
	
	protected int id;
	protected String descricao;
	protected double preco;
	protected Categoria produto;
	
	public Produto(int id, String descricao, double preco, Categoria produto) {
		
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.produto = produto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Categoria getProduto() {
		return produto;
	}
	public void setProduto(Categoria produto) {
		this.produto = produto;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Produto [id=" + this.id + ", descricao=" + this.descricao + ", preco="+ this.preco + ", produto=" + this.produto + "]";
	}
}