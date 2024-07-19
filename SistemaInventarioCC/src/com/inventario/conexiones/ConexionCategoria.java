package com.inventario.conexiones;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.inventario.tablas.Categoria;

public class ConexionCategoria {

	Conexion c = new Conexion();
	
	public boolean AgregarCategoria(Categoria ca) {
		
		try {
					
					String query = "INSERT INTO `categoria`(`ID_Categoria`, `Nombre_Categoria`) VALUES (?,?)";
					
					PreparedStatement st = c.conectar().prepareStatement(query);
					
					st.setInt(1, ca.getID());
					st.setString(2, ca.getNombre());
		
					st.executeUpdate();
					
					return true;
					
				} catch(SQLException e) {
					
					e.printStackTrace();
					return false;
				} finally {
					
					try {
						
						if(c.conectar()!=null) {
							c.conectar().close();
						}
						
					} catch(SQLException e) {
						
						e.printStackTrace();
					}
					
				}
			}
	
	public boolean MostrarPorCategoria(Categoria ca) {
		
		try {
			
			String query = "SELECT * FROM `Suministro` WHERE Categoria = ? ";
			
			PreparedStatement st = c.conectar().prepareStatement(query);
			
			st.setString(1, ca.getNombre());

			st.executeUpdate();
			
			return true;
			
		} catch(SQLException e) {
			
			e.printStackTrace();
			return false;
		} finally {
			
			try {
				
				if(c.conectar()!=null) {
					c.conectar().close();
				}
				
			} catch(SQLException e) {
				
				e.printStackTrace();
			}
			
		}
	
	}
}