package datos;

// podemos importar todos los métodos estáticos de la clase que estamos utilizando importándolos
import static datos.Conexion.*;
import java.sql.*;
import java.util.*;

import domain.Persona;
// clase que realiza acciones sobre la base de datos se llama DAO - DATA ACCESS OBJECT
// Patrón de Diseño DAO 
// tenemos una clase DAO asociada a cada clase de entidad

public class PersonaDAO {
	// es importante asegurarse que la consulta funciona, probarla antes con la bbdd
	private static final String SQL_SELECT = "SELECT id, name, lastname, programming_language from persons";

	public List<Persona> seleccionar() {
		// declaramos las variables
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		// recuperamos cada reglón y lo convertimos en un objeto del tipo persona y lo
		// guardamos en una array list
		Persona persona = null;
		List<Persona> personas = new ArrayList<>();

		try {
			// conn= Conexion.getConnection(); al importar el método estático de la clase no
			// hace falta escribir
			// el nombre de la clase.
			conn = getConnection();
			stmt = conn.prepareStatement(SQL_SELECT);
			rs = stmt.executeQuery();

			while (rs.next()) {
				int idPersona = rs.getInt("id");
				String name = rs.getString("name");
				String lastname = rs.getString("lastname");
				String programmingLanguage = rs.getString("programming_language");
				// utilizamos constructor completo.
				// construimos objetos reutilizables, convirtiendo información de la base de
				// datos
				// hacia objetos java -- Hibernate es lo que hace.
				persona = new Persona(idPersona, name, lastname, programmingLanguage);

				personas.add(persona);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		} finally {
			try { // se cierran en orden inverso al que son abiertos
				Conexion.close(rs);
				Conexion.close(stmt);
				Conexion.close(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return personas;

	}

}
