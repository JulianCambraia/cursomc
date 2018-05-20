package com.juliancambraia.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliancambraia.cursomc.domain.Pedido;
import com.juliancambraia.cursomc.repositories.PedidoRepository;
import com.juliancambraia.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repository;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repository.findById(id);
		
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id " + id + ", Tipo: " + Pedido.class.getName()) );
		
	}

}
