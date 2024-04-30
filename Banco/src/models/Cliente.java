package models;


/**
 *  @author Facundo Benitez y Francisco Gonzales
 *    
 **/
public class Cliente {
	private String nombre,apellido;
	int edad;
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public Cliente(String nombre, String apellido, int edad) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el apellido
	 */
	public String getApellidoString() {
		return apellido;
	}

	/**
	 * @param apellido
	 */
	public void setApellidoString(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return la edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad 
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
