package com.cursoapidev.model;

public class Usuario {

	private int idusuario;
	private String nombre;
	private String email;
	private String carrera;
	
	
	
	public Usuario() {
	}
	
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	@Override
	public String toString() {
		return "Usuario [idusuario=" + idusuario + ", nombre=" + nombre + ", email=" + email + ", carrera=" + carrera
				+ "]";
	}
	
	
}
