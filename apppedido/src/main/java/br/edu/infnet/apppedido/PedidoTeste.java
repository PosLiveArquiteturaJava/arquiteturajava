package br.edu.infnet.apppedido;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.domain.Comida;
import br.edu.infnet.apppedido.model.domain.Pedido;
import br.edu.infnet.apppedido.model.domain.Produto;
import br.edu.infnet.apppedido.model.domain.Sobremesa;
import br.edu.infnet.apppedido.model.domain.Solicitante;

@Order(1)
@Component
public class PedidoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Pedidos ##");
		
		Bebida bebida = new Bebida();
		bebida.setCodigo(123);
		bebida.setNome("Bebida 123");
		bebida.setValor(10);
		bebida.setGelada(false);
		bebida.setMarca("cooffffe");
		bebida.setTamanho(100);

		Comida comida = new Comida();		
		comida.setCodigo(123); 
		comida.setNome("Comida 123");
		comida.setValor(10);
		comida.setIngredientes("frango e fritas");
		comida.setPeso(100);
		comida.setVegano(false);

		Sobremesa sobremesa = new Sobremesa();		
		sobremesa.setCodigo(123); 
		sobremesa.setNome("Sobremesa 123");
		sobremesa.setValor(10);
		sobremesa.setDoce(true);
		sobremesa.setInformacao("Doce demais");
		sobremesa.setQuantidade(1);

		Solicitante s1 = new Solicitante();		
		s1.setCpf("12312312312");
		s1.setEmail("solicita@primeiro.com");
		s1.setNome("Primeiro solicitante");
		
		List<Produto> produtosPrimeiroPedido = new ArrayList<Produto>();
		produtosPrimeiroPedido.add(bebida);
		produtosPrimeiroPedido.add(comida);
		
		List<Produto> produtosDemaisPedidos = new ArrayList<Produto>();
		produtosDemaisPedidos.add(bebida);
		produtosDemaisPedidos.add(comida);
		produtosDemaisPedidos.add(sobremesa);

		Pedido p1 = new Pedido(s1);		
		p1.setDescricao("Primeiro pedido");
		p1.setWeb(true);
		p1.setProdutos(produtosPrimeiroPedido);
		System.out.println("> " + p1);
		
		Pedido p2 = new Pedido();
		p2.setDescricao("Segundo pedido");
		p2.setWeb(false);
		p2.setSolicitante(s1);
		p2.setProdutos(produtosDemaisPedidos);
		System.out.println("> " + p2);
		
		Solicitante s2 = new Solicitante();		
		s2.setCpf("23423423423");
		s2.setEmail("solicita@segundo.com");
		s2.setNome("Segundo solicitante");

		Pedido p3 = new Pedido();
		p3.setDescricao("Terceiro pedido");
		p3.setSolicitante(s2);
		p3.setProdutos(produtosDemaisPedidos);
		System.out.println("> " + p3);
	}
}