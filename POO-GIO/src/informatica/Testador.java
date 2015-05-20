package informatica;

public class Testador {

	public static void main(String[] args) {
	
	Ios ios = new Ios ("Apple", "OS x 6", "64 bits", "HFS");
	Windows8_1 win8 = new Windows8_1("Microsoft", "Windows 8.1 pro", "64 Bits", "NTFS", "482XP-6J9WR-4JXT3-VBPP6-FQF4M");
	WindowsPhone winph = new WindowsPhone ("Microsoft", "Windows Phone 5", "64 Bits", "NTFS", "JYDV8-H8VXG-74RPT-6BJPB-X42V4");
	Linux linux = new Linux ("Ubuntu", "14.10", "64 Bits", "EXT4");
	Android android = new Android ("Samsung", "Kit Kat 4.4.4", "64 Bits", "XFS");
	
	Laptop not1 = new Laptop ("Core i3", "500gb", "4 GB", win8, "Dell Inspiron 1525");
	Laptop not2 = new Laptop ("Core I5", "2 TB", "8GB", linux, "HP Pavilion DV9");
	SmartPhone apple = new SmartPhone ("A5", "32gb", "8GB", ios, "Iphone 5");
	SmartPhone galaxy = new SmartPhone ("quad core", "16gb", "16gb", winph, "Nokia Lumia 990");
	Tablet tablet = new Tablet("quad core", "16gb", "8gb", android, "Samsung Galaxy S3");
	
	System.out.println(not1);
	System.out.println(not2);
	System.out.println(apple);
	System.out.println(galaxy);
	System.out.println(tablet);
	}
}