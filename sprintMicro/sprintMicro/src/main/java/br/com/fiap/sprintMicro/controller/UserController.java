package br.com.fiap.sprintMicro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.sprintMicro.model.ModelosCaminhoes;
import br.com.fiap.sprintMicro.model.User;
import br.com.fiap.sprintMicro.repository.UserRepository;

@Controller
@RequestMapping("user")
public class UserController {
	
	private UserRepository userRepository;
	
	@PostMapping("/register")
	public void createUser(@RequestBody User usuario) {
		userRepository.save(usuario);
	}

	@GetMapping("/{id}/delete")
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public User findUserById(Long id) {
		return userRepository.getById(id);
	}
	
	@PutMapping("/{id}")
	public User UpdateUser(@RequestBody User user) {
		return this.userRepository.save(user);
	}
}
