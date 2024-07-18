package com.inventario.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

	
}
