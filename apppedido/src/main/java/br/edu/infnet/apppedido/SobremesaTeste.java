package br.edu.infnet.apppedido;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.controller.SobremesaController;
import br.edu.infnet.apppedido.model.domain.Sobremesa;

@Order(7)
@Component
public class SobremesaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Sobremesas ##");
		
		Sobremesa s1 = new Sobremesa();		
		s1.setCodigo(123); 
		s1.setNome("Sobremesa 123");
		s1.setValor(10);
		s1.setDoce(true);
		s1.setInformacao("Doce demais");
		s1.setQuantidade(1);
		SobremesaController.incluir(s1);
		
		Sobremesa s2 = new Sobremesa();		
		s2.setCodigo(234); 
		s2.setNome("Sobremesa 234");
		s2.setValor(15);
		s2.setDoce(false);
		s2.setInformacao("Nem é doce");
		s2.setQuantidade(2);
		SobremesaController.incluir(s2);
		
		Sobremesa s3 = new Sobremesa();		
		s3.setCodigo(345); 
		s3.setNome("Sobremesa 345");
		s3.setValor(20);
		s3.setDoce(true);
		s3.setInformacao("Muito doce");
		s3.setQuantidade(4);
		SobremesaController.incluir(s3);
	}
}