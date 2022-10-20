package br.edu.infnet.apppedido;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Comida;

@Component
public class ComidaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Comida c1 = new Comida();		
		c1.ingredientes = "frango e fritas";
		c1.peso = 100;
		c1.vegano = false;
		System.out.println("Comida - " + c1);
		
		Comida c2 = new Comida();
		c2.ingredientes = "batata e cenoura";
		c2.peso = 50;
		c2.vegano = true;
		System.out.println("Comida - " + c2);
		
		Comida c3 = new Comida();
		c3.ingredientes = "hamburguer e bacon";
		c3.peso = 200;
		c3.vegano = true;
		System.out.println("Comida - " + c3);
	}
}