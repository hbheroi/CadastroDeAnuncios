package br.com.capgemini.academia.cadastroanuncios.controllers;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.capgemini.academia.cadastroanuncios.models.Anuncio;
import br.com.capgemini.academia.cadastroanuncios.repository.AnuncioRepository;


@Controller
public class AnuncioController {
	
	@Autowired
	private AnuncioRepository ar;
	
	@RequestMapping(value= "/cadastrarAnuncio", method=RequestMethod.GET)
	public String cadastraAnuncio() {
		return "cadastrarAnuncio";
	}
	
	@RequestMapping(value= "/cadastrarAnuncio", method=RequestMethod.POST)
	public String cadastraAnuncio(Anuncio anuncio) {
		anuncio.calculaValorTotalInvestido(anuncio.getValorInvestido(), anuncio.getQuantDias());
		anuncio.calculaQuantMaxVisualizacoes(anuncio.getQuantDias(), anuncio.getValorInvestido());
		ar.save(anuncio);
		return "redirect:/cadastrarAnuncio";
	}
}