
class Alumno {
	private String nombre;
	private int matricula;
	private double promedio;
	private String email;

	// Constructor
	public Alumno(String nombre, int matricula, double promedio, String	email) {
		this.nombre = nombre;
		this.matricula = matricula;
		this.promedio = promedio;
		this.email = email;
	}

	// SetGet method for Alumno class (recibe valor del atributo, asigna valor al atributo y regresa el valor asignado)
	public Object SetGet(String attribute, Object value) {
	
		switch (attribute) {
		case "nombre": 
			if (value instanceof String) {
				this.nombre = (String) value;
			}
			return this.nombre;
		
		case "matricula":
			if (value instanceof Integer) {
				this.matricula = (int) value;
			}
			return this.matricula;
		case "promedio":
			if (value instanceof Double) {
				this.promedio = (double) value;
			}
			return this.promedio;
		case "email":
			if (value instanceof String) {
				this.email = (String) value;
			}
			return this.email;
			
			default:
			return null;
		}
	}
}