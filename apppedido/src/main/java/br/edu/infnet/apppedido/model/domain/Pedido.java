package br.edu.infnet.apppedido.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
	private String descricao;
	private LocalDateTime data;
	private boolean web;
	private Solicitante solicitante;
	private List<Produto> produtos;
	
	public Pedido() {
		data = LocalDateTime.now();
		web = true;
	}
	
	public Pedido(Solicitante solicitante) {
		this();
		this.solicitante = solicitante;
	}

	@Override
	public String toString() {
		return descricao + ";" + data + ";" + web + ";" + solicitante + ";" + produtos.size();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}