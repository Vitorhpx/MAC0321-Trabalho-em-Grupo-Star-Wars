package lista07;

public class Batalha {
	//Controlador geral que controla os eventos da batalha
	
	public static void batalhar(Ser lutador1, Ser lutador2) {
		Habilidade habilidade1;
		Habilidade habilidade2;
		while(lutador1.getVida() >= 0 && lutador2.getVida() >= 0) {
			habilidade1 = lutador1.escolherAcao();
			habilidade2 = lutador2.escolherAcao();
		
		}
	}
}
