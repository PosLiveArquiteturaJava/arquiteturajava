package br.edu.infnet.apppedido;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Produto;

@Component
public class ProdutoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Produto p1 = new Produto();		
		p1.codigo = 123; 
		p1.nome = "Bebida 123";
		p1.valor = 10;
		System.out.println("Produto - " + p1);
		
		Produto p2 = new Produto();		
		p2.codigo = 234; 
		p2.nome = "Comida 234";
		p2.valor = 15;
		System.out.println("Produto - " + p2);
		
		Produto p3 = new Produto();		
		p3.codigo = 345; 
		p3.nome = "Sobremesa 345";
		p3.valor = 20;
		System.out.println("Produto - " + p3);
	}
}