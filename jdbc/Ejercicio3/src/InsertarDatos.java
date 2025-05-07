import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarDatos {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3307/club_deportivo";
        String usuario = "root";
        String contraseña = "";

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement stmt = conexion.createStatement();
            stmt.executeUpdate("INSERT INTO socios (nombre, apellido, edad, cuota) VALUES ('Zarah', 'D', 24, 29.99)");

            stmt.close();
            conexion.close();
            System.out.println("Socio agregado");
            
        } catch (SQLException e) {
            System.out.println("Error al insertar socios: " + e.getMessage());
        }
	}

}
