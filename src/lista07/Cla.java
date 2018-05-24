package lista07;

import java.util.ArrayList;
import java.util.List;

public class Cla {
	private String nome;
	private Mestre treinador;
	private List<Youngling> membros = new ArrayList<Youngling>();
	private String anoFundacao;
	private String anoExtincao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Mestre getTreinador() {
		return treinador;
	}
	public void setTreinador(Mestre treinador) {
		this.treinador = treinador;
	}
	public List<Youngling> getMembros() {
		return membros;
	}
	public void setMembros(List<Youngling> membros) {
		this.membros = membros;
	}
	public String getAnoFundacao() {
		return anoFundacao;
	}
	public void setAnoFundacao(String anoFundacao) {
		this.anoFundacao = anoFundacao;
	}
	public String getAnoExtincao() {
		return anoExtincao;
	}
	public void setAnoExtincao(String anoExtincao) {
		this.anoExtincao = anoExtincao;
	}
	

}
