package br.edu.infnet.apppedido.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.apppedido.model.domain.Comida;

@Controller
public class ComidaController {
	
	private static Map<Integer, Comida> mapa = new HashMap<Integer, Comida>();	
	private static Integer id = 1;

	public static void incluir(Comida comida) {
		comida.setId(id++);
		mapa.put(comida.getId(), comida);
		
		System.out.println("> " + comida);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Comida> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/comida/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "comida/lista";
	}
	
	@GetMapping(value = "/comida/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/comida/lista";
	}
}