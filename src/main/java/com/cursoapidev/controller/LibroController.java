package com.cursoapidev.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cursoapidev.model.Libro;

@RestController
public class LibroController {

	private List<Libro> libros = createList();
	
	@RequestMapping(value = "/libro",method = RequestMethod.GET, produces = "application/json")
	public List<Libro>  firspage(){
		return libros;
	}

	private List<Libro> createList() {
		List<Libro> libroTemp = new ArrayList<>();
		Libro libro1 = new Libro();
		Libro libro2 = new Libro();
		
		libro1.setIdLibro(1);
		libro1.setTitulo("El principito");
		libro1.setAutor("Antoine de Saint-Exupéry");
		libro1.setTema("Sobre la amistad");
		
		libro2.setIdLibro(2);
		libro2.setTitulo("Algebra de Baldor");
		libro2.setAutor("Aurelio Baldor");
		libro2.setTema("Matematicas");
		
		libroTemp.add(libro1);
		libroTemp.add(libro2);
		
		return libroTemp;
	}
	
	@PostMapping
	public Libro create(@RequestBody Libro libro) {
		libros.add(libro);
		System.out.println(libro);
		return libro;
	}
}
