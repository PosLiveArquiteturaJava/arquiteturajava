package br.edu.infnet.apppedido;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Bebida;

@Order(4)
@Component
public class BebidaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Bebidas ##");
		
		Bebida b1 = new Bebida();
		b1.setCodigo(123);
		b1.setNome("Bebida 123");
		b1.setValor(10);
		b1.setGelada(false);
		b1.setMarca("cooffffe");
		b1.setTamanho(100);
		System.out.println("> " + b1);
		
		Bebida b2 = new Bebida();
		b2.setCodigo(234);
		b2.setNome("Bebida 234");
		b2.setValor(15);
		b2.setGelada(true);
		b2.setMarca("choooope");
		b2.setTamanho(500);
		System.out.println("> " + b2);
		
		Bebida b3 = new Bebida();
		b3.setCodigo(345);
		b3.setNome("Bebida 345");
		b3.setValor(20);
		b3.setGelada(true);
		b3.setMarca("suuuuco");
		b3.setTamanho(1000);
		System.out.println("> " + b3);
	}
}