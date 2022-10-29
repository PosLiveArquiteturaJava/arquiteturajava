package br.edu.infnet.apppedido.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.apppedido.model.domain.Sobremesa;

@Controller
public class SobremesaController {
	
	private static Map<Integer, Sobremesa> mapa = new HashMap<Integer, Sobremesa>();	
	private static Integer id = 1;

	public static void incluir(Sobremesa sobremesa) {
		sobremesa.setId(id++);
		mapa.put(sobremesa.getId(), sobremesa);
		
		System.out.println("> " + sobremesa);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Sobremesa> obterLista(){
		return mapa.values();
	}
		
	@GetMapping(value = "/sobremesa/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "sobremesa/lista";
	}
	
	@GetMapping(value = "/sobremesa/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);
		
		return "redirect:/sobremesa/lista";
	}
}