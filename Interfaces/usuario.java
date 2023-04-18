import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class usuario {
	
	public static void agregar_usuario(String Nombre, String Apellido, String Gmail, String nombreUsuario, String Contraseña) {
		Conexión conexion = new Conexión();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("INSERT INTO usuario(Nombre, Apellido, Gmail, nombreUsuario, Contraseña) VALUES (?,?,?,?,?)");
			stm2.setString(1 , Nombre);
			stm2.setString(2 , Apellido);
			stm2.setString(3 , Gmail);
			stm2.setString(4, nombreUsuario);
			stm2.setString(5, Contraseña);
			
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
	
	public boolean comprobar_usuario(String nombreUsuario, String Contraseña) {
		
		Conexión conexion = new Conexión();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
		
		cn = conexion.conectar();
		PreparedStatement stm2 = cn.prepareStatement("SELECT count(*) FROM usuario where nombreUsuario = ? and Contraseña = ? ");
		stm2.setString(1, nombreUsuario);
		stm2.setString(2, Contraseña);
		rs = stm2.executeQuery();

		if(rs.next() && rs.getInt(1) > 0) {
			return true;
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
			return false;
	}
	
	public static void borrar_usuario(String nombreUsuario, String Contraseña) {
		Conexión conexion = new Conexión();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			PreparedStatement stm2 = cn.prepareStatement("DELETE FROM usuario where nombreUsuario = ? and Contraseña = ? ");
			stm2.setString(1, nombreUsuario);
			stm2.setString(2, Contraseña);
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
