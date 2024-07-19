package com.inventario.conexiones;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.inventario.tablas.Proveedor;

public class ConexionProveedor {

	Conexion c = new Conexion();
	
	public boolean AgregarProveedor(Proveedor p) {
		
		try {
			
			String query = "INSERT INTO `proveedor`(`RIF_Proveedor`, `Nombre_Proveedor`, `Email`, `Telefono`, `Ubicacion`) VALUES (?,?,?,?,?)";
			
			PreparedStatement st = c.conectar().prepareStatement(query);
			
			st.setString(1, p.getRIF());
			st.setString(2, p.getNombre());
			st.setString(3, p.getEmail());
			st.setString(4, p.getTlf());
			st.setString(5, p.getUbicacion());

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
