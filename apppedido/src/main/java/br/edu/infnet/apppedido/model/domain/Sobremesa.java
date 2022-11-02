package br.edu.infnet.apppedido.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tsobremesa")
public class Sobremesa extends Produto {
	private float quantidade;
	private boolean doce;
	private String informacao;
	
	@Override
	public String toString() {
		return super.toString() + ";" + quantidade + ";" + doce + ";" + informacao;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isDoce() {
		return doce;
	}

	public void setDoce(boolean doce) {
		this.doce = doce;
	}

	public String getInformacao() {
		return informacao;
	}

	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}
}