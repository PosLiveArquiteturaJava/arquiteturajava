package br.edu.infnet.apppedido.model.domain;

public class Comida extends Produto {
	public float peso;
	public boolean vegano;
	public String ingredientes;
	
	@Override
	public String toString() {
		return peso + ";" + vegano + ";" + ingredientes;
	}

}
