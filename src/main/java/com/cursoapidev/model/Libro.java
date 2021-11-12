package com.cursoapidev.model;

public class Libro {

	private int idLibro;
	private String titulo;
	private String autor;
	private String tema;
	
	
	
	public Libro() {
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", autor=" + autor + ", tema=" + tema + "]";
	}
	
	
}
