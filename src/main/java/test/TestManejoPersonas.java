package test;
import java.util.List;

import datos.PersonaDAO;
import domain.Persona;
// bajo acoplamiento, cada clase tiene las relaciones mínimas con cada una de las otras clases
// alta cohesión cada clase realiza sus tareas.
public class TestManejoPersonas {
	public static void main (String[]args) {
		PersonaDAO personaDao = new PersonaDAO();
		List<Persona> personas = personaDao.seleccionar();
		for (Persona persona: personas) {
			System.out.println("persona = "+ persona);
		}
	}

}
