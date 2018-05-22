package lista07;

import java.util.ArrayList;
import java.util.List;

public class Missao {
	private String nome;
	private String objetivo;
	private List<Ser> envolvidos = new ArrayList<Ser>();
	private Boolean sucesso;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public List<Ser> getEnvolvidos() {
		return envolvidos;
	}
	public void setEnvolvidos(List<Ser> envolvidos) {
		this.envolvidos = envolvidos;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public Boolean getSucesso() {
		return sucesso;
	}
	public void setSucesso(Boolean sucesso) {
		this.sucesso = sucesso;
	}

}
