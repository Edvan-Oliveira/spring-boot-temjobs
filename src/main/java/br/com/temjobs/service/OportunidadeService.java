package br.com.temjobs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.temjobs.domain.Oportunidade;
import br.com.temjobs.repository.OportunidadeRepository;

@Service
public class OportunidadeService {
	@Autowired
	private OportunidadeRepository oportunidadeRepository;
	
	public Oportunidade salvar(Oportunidade oportunidade) {
		return this.oportunidadeRepository.save(oportunidade);
	}
	
	public Oportunidade atualizar(Oportunidade oportunidade) {
		return this.oportunidadeRepository.save(oportunidade);
	}
	
	public List<Oportunidade> listar() {
		return this.oportunidadeRepository.findAll();
	}
	
	public Optional<Oportunidade> pesquisarPorId(Long id) { 
		return this.oportunidadeRepository.findById(id);
	}
	
	public void remover(Oportunidade oportunidade) {
		this.oportunidadeRepository.delete(oportunidade);
	}
	
	public void removerPorId(Long id) {
		this.oportunidadeRepository.deleteById(id);
	}
}