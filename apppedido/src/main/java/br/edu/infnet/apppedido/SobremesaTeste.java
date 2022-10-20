package br.edu.infnet.apppedido;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Sobremesa;

@Component
public class SobremesaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Sobremesa s1 = new Sobremesa();		
		s1.doce = true;
		s1.informacao = "Doce demais";
		s1.quantidade = 1;
		System.out.println("Sobremesa - " + s1);
		
		Sobremesa s2 = new Sobremesa();		
		s2.doce = false;
		s2.informacao = "Nem é doce";
		s2.quantidade = 2;
		System.out.println("Sobremesa - " + s2);
		
		Sobremesa s3 = new Sobremesa();		
		s3.doce = true;
		s3.informacao = "Muito doce";
		s3.quantidade = 3;
		System.out.println("Sobremesa - " + s3);
	}
}