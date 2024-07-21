package com.inventario.conexiones;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.inventario.tablas.CentroCosto;

public class ConexionCentroCosto {

	Conexion c = new Conexion();
	
		public boolean AgregarCentroCosto(CentroCosto cc) {
			
			try {
				
				String query = "INSERT INTO `centro_costos`(`ID_Centro`, `Nombre_Centro`, `Ubicacion`, `Descripcion_Centro`) VALUES (?,?,?,?)";
				
				PreparedStatement st = c.conectar().prepareStatement(query);
				
				st.setInt(1, cc.getID());
				st.setString(2, cc.getNombre());
				st.setString(3, cc.getUbicacion());
				st.setString(4, cc.getDescripcion());
	
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
