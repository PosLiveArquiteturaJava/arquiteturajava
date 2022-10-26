package br.edu.infnet.apppedido.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.apppedido.model.domain.Bebida;

@Controller
public class BebidaController {
	
	@GetMapping(value = "/bebida/lista")
	public String telaLista(Model model) {
		
		Bebida b1 = new Bebida();
		b1.setCodigo(123);
		b1.setNome("Bebida 123");
		b1.setValor(10);
		b1.setGelada(false);
		b1.setMarca("cooffffe");
		b1.setTamanho(100);

		Bebida b2 = new Bebida();
		b2.setCodigo(234);
		b2.setNome("Bebida 234");
		b2.setValor(15);
		b2.setGelada(true);
		b2.setMarca("choooope");
		b2.setTamanho(500);

		Bebida b3 = new Bebida();
		b3.setCodigo(345);
		b3.setNome("Bebida 345");
		b3.setValor(20);
		b3.setGelada(true);
		b3.setMarca("suuuuco");
		b3.setTamanho(1000);

		List<Bebida> bebidas = new ArrayList<Bebida>();
		bebidas.add(b1);
		bebidas.add(b2);
		bebidas.add(b3);

		model.addAttribute("listagem", bebidas);

		return "bebida/lista";
	}
}