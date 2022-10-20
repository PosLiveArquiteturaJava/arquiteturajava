package br.edu.infnet.apppedido.model.domain;

import java.time.LocalDateTime;

public class Pedido {
	public String descricao;
	public LocalDateTime data;
	public boolean web;
	
	@Override
	public String toString() {
		return descricao + ";" + data + ";" + web;
	}
}
