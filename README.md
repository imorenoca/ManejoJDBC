# Ejercicios para aprender Manejo JDBC - JPA.

Vamos a separar el proyecto anterior:

1. Creamos una clase para la **conexión**.
2. Creamos una clase:  dominio, **entidad** porque tiene una representación en la base de datos
3. Creamos una clase que realiza acciones sobre la base de datos se llama **DAO - DATA ACCESS OBJECT**
  	- Utiliza el Patrón de Diseño DAO   
  	- Tenemos una clase DAO asociada a cada clase de entidad
4. Tenemos una clase de pruebas.

Con esto respecto a la clase TestMySqlJDBC.java conseguimos: 

- **bajo acoplamiento**: cada clase tiene las relaciones mínimas con cada una de las otras clases.
- **alta cohesión**: cada clase realiza sus tareas.