package br.edu.infnet.apppedido.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComidaController {
	
	@GetMapping(value = "/comida/lista")
	public String telaLista() {
		return "comida/lista";
	}
}