package br.com.temjobs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.temjobs.domain.Empresa;
import br.com.temjobs.repository.EmpresaRepository;

@Service
public class EmpresaService {
	@Autowired
	private EmpresaRepository empresaRepository;
	
	public Empresa salvar(Empresa empresa) {
		return this.empresaRepository.save(empresa);
	}
	
	public Empresa atualizar(Empresa empresa) {
		return this.empresaRepository.save(empresa);
	}
	
	public List<Empresa> listar() {
		return this.empresaRepository.findAll();
	}
	
	public Optional<Empresa> pesquisarPorId(Long id) {
		return this.empresaRepository.findById(id);
	}
	
	public void remover(Empresa empresa) {
		this.empresaRepository.delete(empresa);
	}
	
	public void removerPorId(Long id) {
		this.empresaRepository.deleteById(id);
	}
}
