package br.com.capgemini.academia.cadastroanuncios.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.capgemini.academia.cadastroanuncios.models.Anuncio;

public interface AnuncioRepository extends CrudRepository<Anuncio, String>{

}
