package br.edu.infnet.apppedido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.apppedido.model.domain.Solicitante;
import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.service.SolicitanteService;

@Controller
public class SolicitanteController {
	
	@Autowired
	private SolicitanteService solicitanteService;
	
	@GetMapping(value = "/solicitante/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", solicitanteService.obterLista(usuario));

		return "solicitante/lista";
	}
	
	@GetMapping(value = "/solicitante")
	public String telaCadastro() {
		return "solicitante/cadastro";
	}

	@PostMapping(value = "/solicitante/incluir")
	public String incluir(Solicitante solicitante, @SessionAttribute("user") Usuario usuario) {
		
		solicitante.setUsuario(usuario);
		
		solicitanteService.incluir(solicitante);
		
		return "redirect:/solicitante/lista";
	}
	
	@GetMapping(value = "/solicitante/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		solicitanteService.excluir(id);
		
		return "redirect:/solicitante/lista";
	}
}