package com.inventario.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.inventario.tablas.Lote;

public class Conexion {

	private static final String Controlador= "com.mysql.jdbc.Driver";
	private static final String URL= "jdbc:mysql://localhost:3306/CentroCostos";
	private static final String Usuario= "root";
	private static final String Password= "mysql";
	
	static {
		
		try {
			
			Class.forName(Controlador);
			
			System.out.println("Controlador cargado");
			
		} catch(ClassNotFoundException e) {
			
			e.printStackTrace();
			
			System.out.println("Controlador no cargado");
			
		}
		
	}
	
	public Connection conectar() {
		
		Connection conexion = null;
		
		try {
			
			conexion = DriverManager.getConnection(URL, Usuario, Password);
			
			System.out.println("Conexion cargada");
		} catch(SQLException e) {
			
			e.printStackTrace();
			
			System.out.println("Conexion no cargada");
		}
		
		return conexion;
	}
	
	public boolean AgregarLote(Lote a) {
		
		try {
			
			String query = "INSERT INTO `lote`(`ID_Lote`, `Fecha_Ent`, `Fecha_Venc_Lote`, `Precio_Lote`, `Contenido`, `Proveedor_ID`) VALUES (?,?,?,?,?,?)";
			
			PreparedStatement st = conectar().prepareStatement(query);
			
			st.setInt(1, a.getID_Lote());
			st.setDate(2, a.getFecha_Ent());
			st.setDate(3, a.getFecha_Venc_Lote());
			st.setFloat(4, a.getPrecio_Lote());
			st.setString(5, a.getContenido());
			st.setInt(6, a.getProveedor_ID());
			
			st.executeUpdate();
			
			return true;
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			return false;
		} finally {
			
			try {
				
				if(conectar()!=null) {
					conectar().close();
				}
				
			} catch(SQLException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	
	public boolean EliminarLote(Lote b) {
		
		try {
			
			String query = "DELETE FROM `lote` WHERE `ID_Lote`= ?";
			
			PreparedStatement st = conectar().prepareStatement(query);
			
			st.setInt(1, b.getID_Lote());
			
			st.executeUpdate();
			
			return true;
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			return false;
			
		} finally {
			
			try {
				
				if(conectar()!=null) {
					conectar().close();
				}
				
			} catch(SQLException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	
	
}
