package br.edu.infnet.apppedido;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Pedido;

@Component
public class PedidoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Pedido p1 = new Pedido();		
		p1.data = LocalDateTime.now();
		p1.descricao = "Primeiro pedido";
		p1.web = true;
		System.out.println("Pedido - " + p1);
		
		Pedido p2 = new Pedido();
		p2.data = LocalDateTime.now();
		p2.descricao = "Segundo pedido";
		p2.web = false;
		System.out.println("Pedido - " + p2);
		
		Pedido p3 = new Pedido();
		p3.data = LocalDateTime.now();
		p3.descricao = "Terceiro pedido";
		p3.web = false;
		System.out.println("Pedido - " + p3);
	}
}