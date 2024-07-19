package com.inventario.tablas;

import com.inventario.conexiones.Conexion;

public class Categoria {

	int ID;
	String Nombre;
	
	Conexion c = new Conexion();
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
}
