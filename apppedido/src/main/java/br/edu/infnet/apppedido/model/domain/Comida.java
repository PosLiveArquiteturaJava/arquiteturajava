package br.edu.infnet.apppedido.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tcomida")
public class Comida extends Produto {
	private float peso;
	private boolean vegano;
	private String ingredientes;
	
	@Override
	public String toString() {
		return super.toString() + ";" + peso + ";" + vegano + ";" + ingredientes;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public boolean isVegano() {
		return vegano;
	}

	public void setVegano(boolean vegano) {
		this.vegano = vegano;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
}