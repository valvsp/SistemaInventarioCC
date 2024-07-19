package com.inventario.tablas;

import java.sql.Date;
import com.inventario.conexiones.Conexion;

public class Pedido {
	
	int ID;
	Date FechaPedido;
	int IDCentroCosto;
	
	Conexion c = new Conexion();

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Date getFechaPedido() {
		return FechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		FechaPedido = fechaPedido;
	}

	public int getIDCentroCosto() {
		return IDCentroCosto;
	}

	public void setIDCentroCosto(int iDCentroCosto) {
		IDCentroCosto = iDCentroCosto;
	}
	
	
}
