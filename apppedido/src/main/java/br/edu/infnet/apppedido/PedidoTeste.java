package br.edu.infnet.apppedido;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Pedido;

@Order(1)
@Component
public class PedidoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Pedidos ##");

		Pedido p1 = new Pedido();		
		p1.setData(LocalDateTime.now());
		p1.setDescricao("Primeiro pedido");
		p1.setWeb(true);
		System.out.println("> " + p1);
		
		Pedido p2 = new Pedido();
		p2.setData(LocalDateTime.now());
		p2.setDescricao("Segundo pedido");
		p2.setWeb(false);
		System.out.println("> " + p2);
		
		Pedido p3 = new Pedido();
		p3.setData(LocalDateTime.now());
		p3.setDescricao("Terceiro pedido");
		p3.setWeb(true);
		System.out.println("> " + p3);
	}
}