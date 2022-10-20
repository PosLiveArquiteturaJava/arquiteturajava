package br.edu.infnet.apppedido;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Bebida;

@Component
public class BebidaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Bebida b1 = new Bebida();		
		b1.gelada = false;
		b1.marca = "cooffffe";
		b1.tamanho = 100;
		System.out.println("Bebida - " + b1);
		
		Bebida b2 = new Bebida();
		b2.gelada = true;
		b2.marca = "choooope";
		b2.tamanho = 500;
		System.out.println("Bebida - " + b2);
		
		Bebida b3 = new Bebida();
		b3.gelada = true;
		b3.marca = "Succccooo";
		b3.tamanho = 700;
		System.out.println("Bebida - " + b3);
	}
}