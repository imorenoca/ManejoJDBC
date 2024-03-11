// dominio, entidad porque tiene una representación en la base de datos

package domain;

public class Persona {
	private int idPerson;
	private String name;
	private String lastname;
	private String programmingLanguage;

	public Persona() {
	}

	// sobrecarga de constructores en función de los parámetros necesarios y del
	// caso que vayamos a
	// trabajar necesitamos un constructor u otro.

	public Persona(int idPerson) {
		this.idPerson = idPerson;
	}

	// al insertar un nuevo objeto de tipo persona no necesitamos id porque es
	// autoincremental.
	public Persona(String name, String lastname, String programmingLanguage) {
		this.name = name;
		this.lastname = lastname;
		this.programmingLanguage = programmingLanguage;
	}

	// modificar un registro necesitamos todos los atributos

	public Persona(int idPerson, String name,String lastname, String programmingLanguage) {
		this.idPerson = idPerson;
		this.name = name;
		this.lastname = lastname;
		this.programmingLanguage = programmingLanguage;
	}

	// si necesitamos modificar un atributo en específico agregamos todos los
	// getters and setters

	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	// imprimir el estado del objeto en cualquier momento.

	@Override
	public String toString() {
		return "Persona [idPerson=" + idPerson + ", name=" + name + ", lastname=" + lastname + ", programmingLanguage="
				+ programmingLanguage + "]";
	}


}
