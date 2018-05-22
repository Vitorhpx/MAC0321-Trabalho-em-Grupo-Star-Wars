package lista07;

import java.util.ArrayList;
import java.util.List;

public class Conselho {
	private String nome;
	private Academia academia;
	private List<Ser> membros = new ArrayList<Ser>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Academia getAcademia() {
		return academia;
	}
	public void setAcademia(Academia academia) {
		this.academia = academia;
	}
	public List<Ser> getMembros() {
		return membros;
	}
	public void setMembros(List<Ser> membros) {
		this.membros = membros;
	}

}
