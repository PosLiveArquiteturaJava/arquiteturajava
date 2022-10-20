package br.edu.infnet.apppedido.model.domain;

public class Produto {
	public String nome;
	public float valor;
	public int codigo;
	
	@Override
	public String toString() {
		return nome + ";" + valor + ";" + codigo;
	}
}
