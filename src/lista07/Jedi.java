package lista07;


public class Jedi extends UsuarioDaForca{
	private String corCapuz;
	
	Aprendiz(String nome, double vida) {
		this.addHabilidade(new Habilidade("sabre","Ataque simples",50,2));
		this.addHabilidade(new Habilidade("forca","Empurrão fraco",25,3));
		this.setNome(nome);
		this.setVida(vida);
	}
	
	public String getCorCapuz() {
		return corCapuz;
	}

	public void setCorCapuz(String corCapuz) {
		this.corCapuz = corCapuz;
	}

}
