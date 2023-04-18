

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexion {
	public static void main(String[] args) {
		Conexión conexion = new Conexión();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM usuario");
			
			while (rs.next()) {
				String Nombre = rs.getString(1);
				String Apellido = rs.getString(2);
				String Email = rs.getString(3);
				String User_Name = rs.getString(4);
				String Password = rs.getString(5);
				String Specie = rs.getString(6);
				
				System.out.println(Nombre + " - " + Apellido + " - " + Email + " - " + User_Name + " - " + Password + " - " + Specie);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				} 
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("INSERT INTO usuario(Nombre, Apellido, Email, User_Name, Password, Specie) VALUES (?,?,?,?,?,?)");
			stm2.setString(1 , "Fergus");
			stm2.setString(2 , "MacLeod");
			stm2.setString(3 , "kingofhell@gmail.com");
			stm2.setString(4, "Kingof666");
			stm2.setString(5, "Imthebest666@");
			stm2.setString(6, "Demon");
			
			stm2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("UPDATE usuario SET Nombre = ?  WHERE Apellido = ? and Email = ?");
			stm2.setString(1 , "Crowley");
			stm2.setString(2 , "MacLeod");
			stm2.setString(3 , "kingofheel@gmail.com");
			
			
			stm2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("DELETE FROM usuario WHERE Email = ?");
			stm2.setString(1 , "kingofheel@gmail.com");
			
			
			stm2.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs!= null) {
					rs.close();
				}
				
				if (stm != null) {
					stm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}