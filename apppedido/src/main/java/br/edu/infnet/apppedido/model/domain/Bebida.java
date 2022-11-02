package br.edu.infnet.apppedido.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbebida")
public class Bebida extends Produto {
	private boolean gelada;
	private float tamanho;
	private String marca;
	
	@Override
	public String toString() {
		return super.toString() + ";" + gelada + ";" + tamanho + ";" + marca;
	}

	public boolean isGelada() {
		return gelada;
	}

	public void setGelada(boolean gelada) {
		this.gelada = gelada;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}