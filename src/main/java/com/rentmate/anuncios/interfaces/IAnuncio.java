package com.rentmate.anuncios.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

import com.rentmate.anuncios.model.Anuncio;

public interface IAnuncio extends JpaRepository<Anuncio, Integer> {

} 
