package br.com.fiap.sprintMicro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.sprintMicro.model.ComponentesCaminhoes;
import br.com.fiap.sprintMicro.model.DadosCadastro;
import br.com.fiap.sprintMicro.repository.ComponentesCaminhoesRepository;
import br.com.fiap.sprintMicro.repository.DadosCadastroRepository;

@Controller
@RequestMapping("Componentescaminhoes")
public class ComponentesCaminhoesController {
	
private ComponentesCaminhoesRepository componentesCaminhoesRepository;
	
	@PostMapping("/register")
	public void create(@RequestBody ComponentesCaminhoes componentesCaminhoes) {
		this.componentesCaminhoesRepository.save(componentesCaminhoes);
	}

	@GetMapping("/{id}/delete")
	public void delete(Long id) {
		componentesCaminhoesRepository.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public ComponentesCaminhoes findById(Long id) {
		return componentesCaminhoesRepository.getById(id);
	}
	
	@PutMapping("/{id}")
	public ComponentesCaminhoes Update(@RequestBody ComponentesCaminhoes componentesCaminhoes) {
		return this.componentesCaminhoesRepository.save(componentesCaminhoes);
	}
}
