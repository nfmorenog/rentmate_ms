package com.rentmate.anuncios.controler;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.rentmate.anuncios.interfaceService.IAnuncioService;
import com.rentmate.anuncios.interfaces.IAnuncio;
import com.rentmate.anuncios.model.Anuncio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;

@RestController
@RequestMapping("/anuncios")
public class Controlador {
	
	@Autowired
	//private IAnuncioService service;
	private IAnuncio service;
	
	@GetMapping
	public List<Anuncio> listar () {
		/*List<Anuncio> anuncios = service.listar();
		model.addAttribute("anuncios", anuncios);
		return "index";*/
		return service.findAll();
	}
	
	@PostMapping
	public void insertar (@RequestBody Anuncio anuncio) {
		service.save(anuncio);
	}
	
	@PutMapping
	public void modificar (@RequestBody Anuncio anuncio) {
		service.save(anuncio);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar (@PathVariable("id") Integer id) {
		service.deleteById(id);
	}
}
