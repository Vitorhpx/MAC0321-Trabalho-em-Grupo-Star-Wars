package lista07;

public class Batalha {
	//Controlador geral que controla os eventos da batalha
	
	public static void batalhar(Ser lutador1, Ser lutador2) {
		Habilidade habilidade1;
		Habilidade habilidade2;
		int turnoAtual = 1;
		
		
		while(lutador1.getVida() > 0 && lutador2.getVida() > 0) {
			
			System.out.println("---------------Turno" + turnoAtual + "---------------");
			habilidade1 = lutador1.escolherAcao();
			habilidade2 = lutador2.escolherAcao();
			System.out.println("Vida " + lutador1.getNome() + ":" + lutador1.getVida());
			System.out.println("Vida " + lutador2.getNome() + ":" + lutador2.getVida());
			resolverAcoes(lutador1, lutador2, habilidade1, habilidade2);
			turnoAtual++;
		}
	}
	
	public static void resolverAcoes(Ser lutador1, Ser lutador2, Habilidade habilidade1,Habilidade habilidade2) {//retorna um vetor de eventos pro turno

		Habilidade habilidadePrioritaria = null;
		Habilidade habilidadeNaoPrioritaria = null;
		Ser lutadorPrioritario = null;
		Ser lutadorNaoPrioritario = null;
		
		if(habilidade1.getTipo().equals("esquiva") && habilidade2.getTipo().equals("sabre")) {
			System.out.println(lutador1.getNome() + " desviou");
			return;
		}
		
		
		if(habilidade2.getTipo().equals("esquiva") && habilidade1.getTipo().equals("sabre")) {
			System.out.println(lutador2.getNome() + "  desviou");
			return; 
		}
				
		if(habilidade2.getPrioridade() != habilidade1.getPrioridade()) {
			
			if(habilidade1.getPrioridade() < habilidade2.getPrioridade()) {
				habilidadePrioritaria = habilidade1;
				habilidadeNaoPrioritaria = habilidade2;
				lutadorPrioritario = lutador1;
				lutadorNaoPrioritario = lutador2;
			}
			
			else{
				habilidadePrioritaria = habilidade2;
				habilidadeNaoPrioritaria = habilidade1;
				lutadorPrioritario = lutador2;
				lutadorNaoPrioritario = lutador1;
			}
			
			habilidadePrioritaria.executar(lutadorPrioritario, lutadorNaoPrioritario);
			if(lutadorNaoPrioritario.getVida() <= 0) {
				System.out.println(lutadorPrioritario.getNome() + " venceu!");
				return;
			}
			habilidadeNaoPrioritaria.executar(lutadorNaoPrioritario, lutadorPrioritario);
			if(lutadorPrioritario.getVida() <= 0) {
				System.out.println(lutadorNaoPrioritario.getNome() + " venceu!");
				return;
			}
		}
		
		else { //caso sem prioridades
			habilidade1.executar(lutador1, lutador2);
			habilidade2.executar(lutador2, lutador1);
			if(lutador1.getVida() <= 0) {
				if(lutador2.getVida() <= 0) {
					System.out.println("Empate");
					return;
				}
				else {
					System.out.println(lutador2.getNome() + " venceu");
					return;
				}
			}
			else if(lutador2.getVida() <= 0) {
				System.out.println(lutador1.getNome() + " venceu");
				return;
			}
		}
		
	}
}
