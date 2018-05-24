package lista07;

public class Controlador {
	public static void main(String[] args) {
		Lorde vader = new Lorde("Anakin",1000);
		Mestre obi = new Mestre("Obi-Wan",1000);
		
		Batalha.batalhar(vader, obi);
		
	}
}
