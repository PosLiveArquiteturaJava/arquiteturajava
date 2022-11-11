package br.edu.infnet.apppedido;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.domain.Pedido;
import br.edu.infnet.apppedido.model.domain.Produto;
import br.edu.infnet.apppedido.model.domain.Solicitante;
import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.service.PedidoService;

@Order(7)
@Component
public class PedidoTeste implements ApplicationRunner {
	
	@Autowired
	private PedidoService pedidoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Pedidos ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Bebida bebida = new Bebida();
		bebida.setId(1);

//		Comida comida = new Comida();		

//		Sobremesa sobremesa = new Sobremesa();		

		Solicitante s1 = new Solicitante();
		s1.setId(1);
		
		List<Produto> produtosPrimeiroPedido = new ArrayList<Produto>();
		produtosPrimeiroPedido.add(bebida);
//		produtosPrimeiroPedido.add(comida);
		
		List<Produto> produtosDemaisPedidos = new ArrayList<Produto>();
		produtosDemaisPedidos.add(bebida);
//		produtosDemaisPedidos.add(comida);
//		produtosDemaisPedidos.add(sobremesa);

		Pedido p1 = new Pedido(s1);		
		p1.setDescricao("Primeiro pedido");
		p1.setWeb(true);
		p1.setProdutos(produtosPrimeiroPedido);
		p1.setUsuario(usuario);
		pedidoService.incluir(p1);
		
		Pedido p2 = new Pedido();
		p2.setDescricao("Segundo pedido");
		p2.setWeb(false);
		p2.setSolicitante(s1);
		p2.setProdutos(produtosDemaisPedidos);
		p2.setUsuario(usuario);
		pedidoService.incluir(p2);
		
		Solicitante s2 = new Solicitante();		
		s2.setId(2);

		Pedido p3 = new Pedido();
		p3.setDescricao("Terceiro pedido");
		p3.setSolicitante(s2);
		p3.setProdutos(produtosDemaisPedidos);
		p3.setUsuario(usuario);
		pedidoService.incluir(p3);
	}
}