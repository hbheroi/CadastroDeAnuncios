package br.com.capgemini.academia.cadastroanuncios.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.capgemini.academia.cadastroanuncios.models.Anuncio;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
