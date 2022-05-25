package br.com.fiap.sprintMicro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.sprintMicro.model.InformacoesCaminhoes;
import br.com.fiap.sprintMicro.model.ModelosCaminhoes;
import br.com.fiap.sprintMicro.model.User;
import br.com.fiap.sprintMicro.repository.ModelosCaminhoesRepository;
import br.com.fiap.sprintMicro.repository.UserRepository;

@Controller
@RequestMapping("modeloscaminhoes")
public class ModelosCaminhoesController {
	
private ModelosCaminhoesRepository modelosCaminhoes;
	
	@PostMapping("/register")
	public void createUser(@RequestBody ModelosCaminhoes modelosCaminhoes) {
		this.modelosCaminhoes.save(modelosCaminhoes);
	}

	@GetMapping("/{id}/delete")
	public void deleteUser(Long id) {
		modelosCaminhoes.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public ModelosCaminhoes findModeloById(Long id) {
		return modelosCaminhoes.getById(id);
	}
	
	@PutMapping("/{id}")
	public ModelosCaminhoes UpdateModelos(@RequestBody ModelosCaminhoes modelosCaminhoes) {
		return this.modelosCaminhoes.save(modelosCaminhoes);
	}
}
