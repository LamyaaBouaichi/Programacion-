import java.sql.*;

public class ActualizarSocioPrepStat {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3307/club_deportivo";
        String usuario = "root";
        String contraseña = "";
		
		 try {
	            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
	            String sql = "UPDATE socios SET cuota = ? WHERE nombre = ?";
	            PreparedStatement pstmt = conexion.prepareStatement(sql);
	            pstmt.setDouble(1, 49.99);
	            pstmt.setString(2,"Zarah");

	            pstmt.executeUpdate();
	            
	            System.out.println("Socio actiualizado.");
	            
	            pstmt.close();
	            conexion.close();
	        } catch (SQLException e) {
	            System.out.println("Error al actualizar los datos: " + e.getMessage());
	        }

	}

}
