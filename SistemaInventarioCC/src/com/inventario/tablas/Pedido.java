package com.inventario.tablas;

import com.inventario.conexiones.Conexion;

public class Pedido {

	String RIF, Nombre, Email, Tlf, Ubicacion;
	
	Conexion c = new Conexion();

	public String getRIF() {
		return RIF;
	}

	public void setRIF(String rIF) {
		RIF = rIF;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTlf() {
		return Tlf;
	}

	public void setTlf(String tlf) {
		Tlf = tlf;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}
	
	
	
}
