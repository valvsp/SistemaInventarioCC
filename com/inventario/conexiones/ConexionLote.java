package com.inventario.conexiones;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.inventario.tablas.*;

public class ConexionLote {

	Conexion c = new Conexion();
	
	public boolean AgregarLote(Lote a) {
			
			try {
				
				String query = "INSERT INTO `lote`(`ID_Lote`, `Fecha_Ent`, `Fecha_Venc_Lote`, `Precio_Lote`, `Contenido`, `Proveedor_ID`, `Perecedero`, `Cantidad`) VALUES (?,?,?,?,?,?,?,?)";
				
				PreparedStatement st = c.conectar().prepareStatement(query);
				
				st.setInt(1, a.getID_Lote());
				st.setDate(2, a.getFecha_Ent());
				st.setDate(3, a.getFecha_Venc_Lote());
				st.setFloat(4, a.getPrecio_Lote());
				st.setString(5, a.getContenido());
				st.setInt(6, a.getRIFProveedor());
				st.setString(7, a.getPerecedero());
				st.setInt(8, a.getCantidad());
				
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
	
	public boolean EliminarLote(Lote b) {
			
			try {
				
				String query = "DELETE FROM `lote` WHERE `ID_Lote`= ?";
				
				PreparedStatement st = c.conectar().prepareStatement(query);
				
				st.setInt(1, b.getID_Lote());
				
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
