package br.edu.infnet.apppedido.model.domain;

public class Sobremesa extends Produto {
	public float quantidade;
	public boolean doce;
	public String informacao;
	
	@Override
	public String toString() {
		return quantidade + ";" + doce + ";" + informacao;
	}
}
