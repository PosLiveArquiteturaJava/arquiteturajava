package br.edu.infnet.apppedido.model.domain;

public class Bebida extends Produto {
	public boolean gelada;
	public float tamanho;
	public String marca;
	
	@Override
	public String toString() {
		return gelada + ";" + tamanho + ";" + marca;
	}
}