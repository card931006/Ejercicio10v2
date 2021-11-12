package com.cursoapidev.model;

public class Prestamo {

	private int idPrestamo;
	private int idLibro;
	private int idUsuario;
	private String fechaPrest;
	private String fechaEntreg;
	
	
	
	public Prestamo() {
	}
	public int getIdPrestamo() {
		return idPrestamo;
	}
	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getFechaPrest() {
		return fechaPrest;
	}
	public void setFechaPrest(String fechaPrest) {
		this.fechaPrest = fechaPrest;
	}
	public String getFechaEntreg() {
		return fechaEntreg;
	}
	public void setFechaEntreg(String fechaEntreg) {
		this.fechaEntreg = fechaEntreg;
	}
	@Override
	public String toString() {
		return "Prestamo [idPrestamo=" + idPrestamo + ", idLibro=" + idLibro + ", idUsuario=" + idUsuario
				+ ", fechaPrest=" + fechaPrest + ", fechaEntreg=" + fechaEntreg + "]";
	}
	
	
}
