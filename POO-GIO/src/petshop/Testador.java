package petshop;

public class Testador {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Bug",Raca.Yorkshireterrier,2, null);
		cachorro.doenca = "virose";
		cachorro.diagnostico = "repouso";
		
		Dono dono = new Dono ("Giofrancisco Pires", "046.583.489-26", null, cachorro);
		
		System.out.println(dono);

	}

}
