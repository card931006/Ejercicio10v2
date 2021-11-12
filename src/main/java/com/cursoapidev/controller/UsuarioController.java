package com.cursoapidev.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cursoapidev.model.Libro;
import com.cursoapidev.model.Usuario;

@RestController
public class UsuarioController {

	private List<Usuario> usuarios = createList();

	@RequestMapping(value="/usuario",method = RequestMethod.GET, produces = "application/json")
	public List<Usuario> retornaLista(){
		return usuarios;
	}
	
	@PostMapping
	private static List<Usuario> createList() {

		List<Usuario> usuarioTemporal = new ArrayList<>();
		Usuario usr1 = new Usuario();
		Usuario usr2 = new Usuario();
		
		usr1.setIdusuario(1);
		usr1.setNombre("Daniel");
		usr1.setCarrera("TICs");
		usr1.setEmail("danieñ@gmail.com");
		
		usr2.setIdusuario(2);
		usr2.setNombre("Yesi");
		usr2.setCarrera("TICs");
		usr2.setEmail("yesi@gmail.com");
		
		usuarioTemporal.add(usr1);
		usuarioTemporal.add(usr2);
		return usuarioTemporal;
	}
	
	@PostMapping
	public Usuario create(@RequestBody Usuario usr) {
		usuarios.add(usr);
		System.out.println(usr);
		return usr;
	}
}
