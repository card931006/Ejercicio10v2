package com.cursoapidev.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cursoapidev.model.Prestamo;

@RestController
public class PrestamoController {

	private List<Prestamo> prestamos = createList();
	
	@RequestMapping(value = "/prestamo",method = RequestMethod.GET, produces = "application/json")
	public List<Prestamo>  firspage(){
		return prestamos;
	}

	private List<Prestamo> createList() {

		List<Prestamo> temPrest = new ArrayList<>();
		Prestamo p1 = new Prestamo();
		Prestamo p2 = new Prestamo();
		
		p1.setIdPrestamo(0);
		p1.setIdLibro(1);
		p1.setIdUsuario(1);
		p1.setFechaPrest("10/11/2021");
		p1.setFechaEntreg("20/11/2021");
		
		p2.setIdPrestamo(2);
		p2.setIdLibro(1);
		p2.setIdUsuario(1);
		p2.setFechaPrest("10/11/2021");
		p2.setFechaEntreg("20/11/2021");
		
		temPrest.add(p1);
		temPrest.add(p2);
		return temPrest;
	}
	
	@PostMapping
	public Prestamo create(@RequestBody Prestamo pres) {
		prestamos.add(pres);
		System.out.println(pres);
		return pres;
	}
}
