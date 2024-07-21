package com.inventario.tablas;

import com.inventario.conexiones.Conexion;

public class PedidosHasSuministros {
	
	int IDSuministro, IDPedido;
	
	Conexion c = new Conexion();

	public int getIDSuministro() {
		return IDSuministro;
	}

	public void setIDSuministro(int iDSuministro) {
		IDSuministro = iDSuministro;
	}

	public int getIDPedido() {
		return IDPedido;
	}

	public void setIDPedido(int iDPedido) {
		IDPedido = iDPedido;
	}
	
}
