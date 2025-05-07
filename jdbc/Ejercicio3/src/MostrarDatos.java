import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class MostrarDatos {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3307/club_deportivo";
        String usuario = "root";
        String contraseña = "";

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM socios");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + " Nombre: " + rs.getString("nombre") +  " Apellido: " + rs.getString("apellido") + " Edad: " + rs.getString("edad") + " Cuota: " + rs.getString("cuota"));
            }

            stmt.close();
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

	}

}
