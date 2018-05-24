package lista07;

public class Habilidade {
	private String nome;
	private String alinhamento;
	private String tipo;
	private int prioridade;
	private double dano;
	
	Habilidade(){
	}
	
	Habilidade(String tipo, String nome, double dano, int prioridade){
		this.tipo = tipo;
		this.nome = nome;
		this.dano = dano;
		this.prioridade = prioridade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAlinhamento() {
		return alinhamento;
	}
	public void setAlinhamento(String alinhamento) {
		this.alinhamento = alinhamento;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getDano() {
		return dano;
	}
	public void setDano(double dano) {
		this.dano = dano;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public void executar(Ser usuario, Ser alvo) {
		alvo.setVida(alvo.getVida() - getDano());
		System.out.println(usuario.getNome() + " usou " + getNome());	
	}
	

}
