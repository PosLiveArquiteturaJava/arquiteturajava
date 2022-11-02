package br.edu.infnet.apppedido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.apppedido.model.service.SolicitanteService;

@Controller
public class SolicitanteController {
	
	@Autowired
	private SolicitanteService solicitanteService;
	
	@GetMapping(value = "/solicitante/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", solicitanteService.obterLista());

		return "solicitante/lista";
	}
	
	@GetMapping(value = "/solicitante/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		solicitanteService.excluir(id);
		
		return "redirect:/solicitante/lista";
	}
}