package com.inventario.tablas;

import com.inventario.conexiones.Conexion;

public class Suministro {
	
	int ID, IDLote, IDCategoria;
	String Nombre, Descripcion;
	
	Conexion c = new Conexion();

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getIDLote() {
		return IDLote;
	}

	public void setIDLote(int iDLote) {
		IDLote = iDLote;
	}

	public int getIDCategoria() {
		return IDCategoria;
	}

	public void setIDCategoria(int iDCategoria) {
		IDCategoria = iDCategoria;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	
}
