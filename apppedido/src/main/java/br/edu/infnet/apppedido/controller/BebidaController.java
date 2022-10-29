package br.edu.infnet.apppedido.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.apppedido.model.domain.Bebida;

@Controller
public class BebidaController {

	private static Map<Integer, Bebida> mapa = new HashMap<Integer, Bebida>();	
	private static Integer id = 1;

	public static void incluir(Bebida bebida) {
		bebida.setId(id++);
		mapa.put(bebida.getId(), bebida);
		
		System.out.println("> " + bebida);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Bebida> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/bebida/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "bebida/lista";
	}
	
	@GetMapping(value = "/bebida/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/bebida/lista";
	}
}