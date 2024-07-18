package com.inventario.tablas;

import java.sql.Date;

import com.inventario.conexiones.Conexion;

public class Lote {

	int ID_Lote;
	Date Fecha_Ent, Fecha_Venc_Lote;
	float Precio_Lote;
	String Contenido;
	int Proveedor_ID;
	
	Conexion c = new Conexion();
	
	public int getID_Lote() {
		return ID_Lote;
	}
	public void setID_Lote(int iD_Lote) {
		ID_Lote = iD_Lote;
	}
	public Date getFecha_Ent() {
		return Fecha_Ent;
	}
	public void setFecha_Ent(Date fecha_Ent) {
		Fecha_Ent = fecha_Ent;
	}
	public Date getFecha_Venc_Lote() {
		return Fecha_Venc_Lote;
	}
	public void setFecha_Venc_Lote(Date fecha_Venc_Lote) {
		Fecha_Venc_Lote = fecha_Venc_Lote;
	}
	public float getPrecio_Lote() {
		return Precio_Lote;
	}
	public void setPrecio_Lote(float precio_Lote) {
		Precio_Lote = precio_Lote;
	}
	public String getContenido() {
		return Contenido;
	}
	public void setContenido(String contenido) {
		Contenido = contenido;
	}
	public int getProveedor_ID() {
		return Proveedor_ID;
	}
	public void setProveedor_ID(int proveedor_ID) {
		Proveedor_ID = proveedor_ID;
	}
	
	
}
