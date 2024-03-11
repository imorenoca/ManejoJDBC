package test;
// código antiguo todo junto - lo dejo para comparar
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMySqlJDBC {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/db_springboot?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

			try {
				Connection conexion = DriverManager.getConnection(url, "root", "admin");
				Statement instruccion = conexion.createStatement();
				String sql = "SELECT id, name, lastname, programming_language from persons ";
				ResultSet resultado = instruccion.executeQuery(sql);
				while(resultado.next()) {
					System.out.print(" ID: " + resultado.getInt("id"));
					System.out.print(" Nombre: " + resultado.getString("name"));
					System.out.print(" Apellido :" + resultado.getString("lastname"));
					System.out.print( " Lenguaje de Programación: " + resultado.getString("programming_language"));
					System.out.println(" ");
				}
				resultado.close();
				instruccion.close();
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
