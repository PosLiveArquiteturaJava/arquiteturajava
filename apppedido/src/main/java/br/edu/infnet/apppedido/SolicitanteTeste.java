package br.edu.infnet.apppedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Solicitante;
import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.service.SolicitanteService;

@Order(3)
@Component
public class SolicitanteTeste implements ApplicationRunner {

	@Autowired
	private SolicitanteService solicitanteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Solicitantes ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Solicitante s1 = new Solicitante();		
		s1.setCpf("12312312312");
		s1.setEmail("solicita@primeiro.com");
		s1.setNome("Primeiro solicitante");
		s1.setUsuario(usuario);
		solicitanteService.incluir(s1);
		
		Solicitante s2 = new Solicitante();		
		s2.setCpf("23423423423");
		s2.setEmail("solicita@segundo.com");
		s2.setNome("Segundo solicitante");
		s2.setUsuario(usuario);
		solicitanteService.incluir(s2);
		
		Solicitante s3 = new Solicitante();		
		s3.setCpf("34534534534");
		s3.setEmail("solicita@terceiro.com");
		s3.setNome("Terceiro solicitante");
		s3.setUsuario(usuario);
		solicitanteService.incluir(s3);
	}
}