package br.edu.infnet.apppedido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.apppedido.model.domain.Pedido;
import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.service.PedidoService;
import br.edu.infnet.apppedido.model.service.ProdutoService;
import br.edu.infnet.apppedido.model.service.SolicitanteService;

@Controller
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	@Autowired
	private SolicitanteService solicitanteService;
	@Autowired
	private ProdutoService produtoService;

	@GetMapping(value = "/pedido")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("solicitantes", solicitanteService.obterLista(usuario));

		model.addAttribute("produtos", produtoService.obterLista(usuario));
		
		return "pedido/cadastro";
	}
	
	@GetMapping(value = "/pedido/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", pedidoService.obterLista(usuario));

		return "pedido/lista";
	}
	
	@PostMapping(value = "/pedido/incluir")
	public String incluir(Pedido pedido, @SessionAttribute("user") Usuario usuario) {
		
		System.out.println("Solicitante: " + pedido.getSolicitante());		
		System.out.println("Produtos: " + pedido.getProdutos());
		
		pedido.setUsuario(usuario);
		
		pedidoService.incluir(pedido);
		
		return "redirect:/pedido/lista";
	}

	@GetMapping(value = "/pedido/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		pedidoService.excluir(id);
		
		return "redirect:/pedido/lista";
	}
}