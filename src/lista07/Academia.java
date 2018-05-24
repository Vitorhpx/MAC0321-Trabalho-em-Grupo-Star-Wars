package lista07;

import java.util.ArrayList;
import java.util.List;

public class Academia {
	private String nome;
	private Planeta planeta;
	private String ordem; //Jedi ou Sith
	private List<Ser> alunos = new ArrayList<Ser>();
	private Conselho conselho;
	public String getNome() {
		return nome;
	}
	public List<Ser> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Ser> alunos) {
		this.alunos = alunos;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Planeta getPlaneta() {
		return planeta;
	}
	public void setPlaneta(Planeta planeta) {
		this.planeta = planeta;
	}
	public String getOrdem() {
		return ordem;
	}
	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}
	public Conselho getConselho() {
		return conselho;
	}
	public void setConselho(Conselho conselho) {
		this.conselho = conselho;
	}
	

}
