package br.edu.infnet.apppedido.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PedidoController {
	
	@GetMapping(value = "/pedido/lista")
	public String telaLista() {
		return "pedido/lista";
	}
}