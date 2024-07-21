package com.inventario.conexiones;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.inventario.tablas.Pedido;

public class ConexionPedido {
	
	Conexion c = new Conexion();
	
	public boolean AgregarPedido (Pedido p) {
		
		try {
			
			String query = "INSERT INTO `pedido`(`ID_Pedido`, `Fecha_Pedido`, `ID_CentroCostos`) VALUES (?,?,?)";
			
			PreparedStatement st = c.conectar().prepareStatement(query);
			
			st.setInt(1, p.getID());
			st.setDate(2, p.getFechaPedido());
			st.setInt(3, p.getIDCentroCosto());

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
