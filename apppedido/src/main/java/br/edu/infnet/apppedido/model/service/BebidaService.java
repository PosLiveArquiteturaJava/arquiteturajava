package br.edu.infnet.apppedido.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.repository.BebidaRepository;

@Service
public class BebidaService {
	
	@Autowired
	private BebidaRepository bebidaRepository;

	public void incluir(Bebida bebida) {
		bebidaRepository.save(bebida);		
	}
	
	public void excluir(Integer id) {
		bebidaRepository.deleteById(id);
	}
	
	public Collection<Bebida> obterLista(){
		return (Collection<Bebida>) bebidaRepository.findAll();
	}		
}