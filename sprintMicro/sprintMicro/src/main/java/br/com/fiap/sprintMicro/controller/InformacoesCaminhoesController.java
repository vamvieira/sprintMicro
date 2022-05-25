package br.com.fiap.sprintMicro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.sprintMicro.model.InformacoesCaminhoes;
import br.com.fiap.sprintMicro.model.ModelosCaminhoes;
import br.com.fiap.sprintMicro.repository.InformacoesCaminhoesRepository;

@Controller
@RequestMapping("informacoesCaminhoes")
public class InformacoesCaminhoesController {
	
	private InformacoesCaminhoesRepository informacoesCaminhoes;
	
	@PostMapping("/register")
	public void createInformacoes(@RequestBody InformacoesCaminhoes informacoesCaminhoes) {
		this.informacoesCaminhoes.save(informacoesCaminhoes);
	}

	@GetMapping("/{id}/delete")
	public void deleteInformacoes(Long id) {
		informacoesCaminhoes.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public InformacoesCaminhoes findInformacoesById(Long id) {
		return informacoesCaminhoes.getById(id);
	}
	
	@PutMapping("/update")
	public InformacoesCaminhoes UpdateInformacoes(@RequestBody InformacoesCaminhoes informacoesCaminhoes) {
		return this.informacoesCaminhoes.save(informacoesCaminhoes);
	}
}
