package br.edu.infnet.apppedido;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Solicitante;

@Component
public class SolicitanteTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Solicitante s1 = new Solicitante();		
		s1.cpf = "12312312312";
		s1.email = "solicita@primeiro.com";
		s1.nome = "Primeiro solicitante";
		System.out.println("Solicitante - " + s1);
		
		Solicitante s2 = new Solicitante();		
		s2.cpf = "23423423423";
		s2.email = "solicita@segundo.com";
		s2.nome = "Segundo solicitante";
		System.out.println("Solicitante - " + s2);
		
		Solicitante s3 = new Solicitante();		
		s3.cpf = "34534534534";
		s3.email = "solicita@terceiro.com";
		s3.nome = "Terceiro solicitante";
		System.out.println("Solicitante - " + s3);
	}
}