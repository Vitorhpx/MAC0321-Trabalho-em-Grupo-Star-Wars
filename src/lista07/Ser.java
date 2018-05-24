package lista07;

import java.util.ArrayList;
import java.util.List;

public class Ser {
	private String nome;
	private String especie;
	private String sexo;
	private String anoNascimento; //datas estarao em String pois em Star Wars sao dadas em XX ABY ou YY DBY
	private Planeta planetaNatal;
	private int midi_chlorians;
	private double vida;
	private double dominioForca;
	private double dominioSabre;
	private List<Habilidade> habilidades = new ArrayList<Habilidade>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(String anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public Planeta getPlanetaNatal() {
		return planetaNatal;
	}
	public void setPlanetaNatal(Planeta planetaNatal) {
		this.planetaNatal = planetaNatal;
	}
	public int getMidi_chlorians() {
		return midi_chlorians;
	}
	public void setMidi_chlorians(int midi_chlorians) {
		this.midi_chlorians = midi_chlorians;
	}
	public double getVida() {
		return vida;
	}
	public void setVida(double vida) {
		this.vida = vida;
	}
	public double getDominioForca() {
		return dominioForca;
	}
	public void setDominioForca(double dominioForca) {
		this.dominioForca = dominioForca;
	}
	public double getDominioSabre() {
		return dominioSabre;
	}
	public void setDominioSabre(double dominioSabre) {
		this.dominioSabre = dominioSabre;
	}
	public List<Habilidade> getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}
	
}
