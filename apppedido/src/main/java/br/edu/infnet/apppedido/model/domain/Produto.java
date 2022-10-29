package br.edu.infnet.apppedido.model.domain;

public abstract class Produto {
	private Integer id;
	private String nome;
	private float valor;
	private int codigo;

	@Override
	public String toString() {
		return id + ";" + nome + ";" + valor + ";" + codigo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
