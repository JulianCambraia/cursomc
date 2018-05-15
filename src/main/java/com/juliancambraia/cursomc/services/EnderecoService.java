package com.juliancambraia.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliancambraia.cursomc.domain.Endereco;
import com.juliancambraia.cursomc.repositories.EnderecoRepository;
import com.juliancambraia.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repo;
	
	public Endereco buscar(Integer id) {
		Optional<Endereco> obj = repo.findById(id);
		
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id " + id + ", Tipo: " + Endereco.class.getName()));
	}
}
