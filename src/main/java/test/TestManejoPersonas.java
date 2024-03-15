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
		/*Utiliza el paradigma de programación funcional y expresiones lambda.
		Permite operaciones más complejas en cada elemento de la colección.
		Puede ser más flexible en ciertos contextos, especialmente cuando se combinan con otras operaciones de flujo (stream) como filter, map, reduce, etc.*/
		personas.forEach(persona->{
			System.out.println("persona = "+ persona);
		});
	}

}
