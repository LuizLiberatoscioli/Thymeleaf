package com.time.time.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/departemento/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/departemento/lista";
	}

}
