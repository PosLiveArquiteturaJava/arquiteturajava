package br.edu.infnet.apppedido.model.domain;

public class Solicitante {
	public String nome;
	public String cpf;
	public String email;
	
	@Override
	public String toString() {
		return nome + ";" + cpf + ";" + email;
	}
}
