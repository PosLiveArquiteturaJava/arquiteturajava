package br.edu.infnet.apppedido;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.controller.ProdutoController;
import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.domain.Comida;
import br.edu.infnet.apppedido.model.domain.Sobremesa;

@Order(4)
@Component
public class ProdutoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Produtos ##");

		Bebida bebida = new Bebida();
		bebida.setCodigo(123);
		bebida.setNome("Bebida 123");
		bebida.setValor(10);
		bebida.setGelada(false);
		bebida.setMarca("cooffffe");
		bebida.setTamanho(100);
		ProdutoController.incluir(bebida);

		Comida comida = new Comida();		
		comida.setCodigo(123); 
		comida.setNome("Comida 123");
		comida.setValor(10);
		comida.setIngredientes("frango e fritas");
		comida.setPeso(100);
		comida.setVegano(false);
		ProdutoController.incluir(comida);

		Sobremesa sobremesa = new Sobremesa();		
		sobremesa.setCodigo(123); 
		sobremesa.setNome("Sobremesa 123");
		sobremesa.setValor(10);
		sobremesa.setDoce(true);
		sobremesa.setInformacao("Doce demais");
		sobremesa.setQuantidade(1);
		ProdutoController.incluir(sobremesa);
	}
}