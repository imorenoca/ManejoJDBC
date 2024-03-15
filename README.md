# Ejercicios para aprender Manejo JDBC - JPA.

Vamos a separar el proyecto anterior:

1. Creamos una clase para la **conexión**.
2. Creamos una clase que representa una tabla de la base de datos, por este motivo es  dominio, **entidad** porque es una representación de la base de datos.
3. Creamos una clase que realiza acciones sobre la base de datos - **DAO - DATA ACCESS OBJECT**, crea objetos de acceso a los datos.
  	- Utiliza el Patrón de Diseño DAO   
  	- Se asocia a una clase que está relacionada con una tabla de la base de datos y se llama **entidad**.
4. Tenemos una clase de pruebas.

Con esto respecto a la clase TestMySqlJDBC.java conseguimos: 

- **bajo acoplamiento**: cada clase tiene las relaciones mínimas con cada una de las otras clases.
- **alta cohesión**: cada clase realiza sus tareas.

[Java SE 17](https://docs.oracle.com/en/java/javase/17/books.html)