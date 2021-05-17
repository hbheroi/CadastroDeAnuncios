package br.com.capgemini.academia.cadastroanuncios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.capgemini.academia.cadastroanuncios.models.Anuncio;
import br.com.capgemini.academia.cadastroanuncios.repository.AnuncioRepository;

@Controller
public class RelatorioController {
	
	@Autowired
	private AnuncioRepository ar;
	
	@RequestMapping("/relatorioAnuncios")
	public ModelAndView listaAnuncios() {
		ModelAndView mv = new ModelAndView("relatorioAnuncio");
		Iterable<Anuncio> anuncios = ar.findAll();
		mv.addObject("anuncios", anuncios);
		return mv;
	}
	
	
}
