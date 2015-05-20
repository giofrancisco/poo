package videogame;

public class Testador {

	public static void main(String[] args) {
		
		Wii wii = new Wii ( " IBM 720", 512, Midia.DVD);
		
		System.out.println(wii);
	
	
		Xbox xbox = new Xbox( " core i3", 4, Midia.DVD, null, null);
		
		Kinect kinect = new Kinect ("Kinect");
		
		xbox.setKinect (kinect);
		
		System.out.println(xbox);
		
		PlayStation playstation = new PlayStation ("core i3", 160, Midia.BluRay,null, null);
		
		Move move = new Move("Move");
		
		playstation.setMove(move);
		
		System.out.println(playstation);
		
	}		

}
