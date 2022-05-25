package br.com.fiap.sprintMicro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.sprintMicro.model.DadosCadastro;
import br.com.fiap.sprintMicro.model.User;
import br.com.fiap.sprintMicro.repository.DadosCadastroRepository;
import br.com.fiap.sprintMicro.repository.UserRepository;

@Controller
@RequestMapping("dadoscadastro")
public class DadosCadastroController {
	
	private DadosCadastroRepository dadosCadastroRepository;
	
	@PostMapping("/register")
	public void create(@RequestBody DadosCadastro dadosCadastro) {
		this.dadosCadastroRepository.save(dadosCadastro);
	}

	@GetMapping("/{id}/delete")
	public void delete(Long id) {
		dadosCadastroRepository.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public DadosCadastro findById(Long id) {
		return dadosCadastroRepository.getById(id);
	}
	
	@PutMapping("/{id}")
	public DadosCadastro Update(@RequestBody DadosCadastro dadosCadastro) {
		return this.dadosCadastroRepository.save(dadosCadastro);
	}
}
