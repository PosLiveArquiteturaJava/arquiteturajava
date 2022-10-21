package br.edu.infnet.apppedido;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Comida;

@Order(5)
@Component
public class ComidaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Comidas ##");
		
		Comida c1 = new Comida();		
		c1.setCodigo(123); 
		c1.setNome("Comida 123");
		c1.setValor(10);
		c1.setIngredientes("frango e fritas");
		c1.setPeso(100);
		c1.setVegano(false);
		System.out.println("> " + c1);
		
		Comida c2 = new Comida();
		c2.setCodigo(234); 
		c2.setNome("Comida 234");
		c2.setValor(15);
		c2.setIngredientes("batata e cenoura");
		c2.setPeso(200);
		c2.setVegano(true);
		System.out.println("> " + c2);
		
		Comida c3 = new Comida();
		c3.setCodigo(345); 
		c3.setNome("Comida 345");
		c3.setValor(20);
		c3.setIngredientes("hamburguer e bacon");
		c3.setPeso(400);
		c3.setVegano(false);
		System.out.println("> " + c3);
	}
}