package br.edu.infnet.apppedido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.apppedido.model.service.BebidaService;

@Controller
public class BebidaController {
	
	@Autowired
	private BebidaService bebidaService;

	@GetMapping(value = "/bebida/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", bebidaService.obterLista());

		return "bebida/lista";
	}
	
	@GetMapping(value = "/bebida/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		bebidaService.excluir(id);
		
		return "redirect:/bebida/lista";
	}
}