package br.edu.infnet.apppedido;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.domain.Comida;
import br.edu.infnet.apppedido.model.domain.Sobremesa;

@Order(3)
@Component
public class ProdutoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Produtos ##");

		Bebida b1 = new Bebida();
		b1.setCodigo(123);
		b1.setNome("Bebida 123");
		b1.setValor(10);
		b1.setGelada(false);
		b1.setMarca("cooffffe");
		b1.setTamanho(100);
		System.out.println("> " + b1);

		Comida c1 = new Comida();		
		c1.setCodigo(123); 
		c1.setNome("Comida 123");
		c1.setValor(10);
		c1.setIngredientes("frango e fritas");
		c1.setPeso(100);
		c1.setVegano(false);
		System.out.println("> " + c1);

		Sobremesa s1 = new Sobremesa();		
		s1.setCodigo(123); 
		s1.setNome("Sobremesa 123");
		s1.setValor(10);
		s1.setDoce(true);
		s1.setInformacao("Doce demais");
		s1.setQuantidade(1);
		System.out.println("> " + s1);
	}
}