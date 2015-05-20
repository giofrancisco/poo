package mercado;

public class Testador {

	public static void main(String[] args) {

		Categoria c = new Categoria("monitor");
		ProdutoAnalogico analogico = new ProdutoAnalogico(1,"monitor LCD", 500, c, 15, 10);
		
	System.out.println(analogico);
	
		Categoria a = new Categoria ("Jogos Xbox 360");
		ProdutoDigital digital = new ProdutoDigital(2, "FarCry 4", 200, a, Formato.jogo, 700000);
	
	System.out.println(digital);
	}
}
