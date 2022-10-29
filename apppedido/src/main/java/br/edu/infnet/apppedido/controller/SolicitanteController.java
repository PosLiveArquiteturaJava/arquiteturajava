package br.edu.infnet.apppedido.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.apppedido.model.domain.Solicitante;

@Controller
public class SolicitanteController {
	
	private static Map<Integer, Solicitante> mapa = new HashMap<Integer, Solicitante>();	
	private static Integer id = 1;

	public static void incluir(Solicitante solicitante) {
		solicitante.setId(id++);
		mapa.put(solicitante.getId(), solicitante);
		
		System.out.println("> " + solicitante);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Solicitante> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/solicitante/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "solicitante/lista";
	}
	
	@GetMapping(value = "/solicitante/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/solicitante/lista";
	}
}