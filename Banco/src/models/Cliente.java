package models;


/**
 *  @author Facundo Benitez y Francisco Gonzales
 *    
 **/
public class Cliente {
	private String nombre,apellidoString;
	int edad;
	
	/**
	 * @param nombre
	 * @param apellidoString
	 * @param edad
	 */
	public Cliente(String nombre, String apellidoString, int edad) {
		
		this.nombre = nombre;
		this.apellidoString = apellidoString;
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
		return apellidoString;
	}

	/**
	 * @param apellido
	 */
	public void setApellidoString(String apellidoString) {
		this.apellidoString = apellidoString;
	}

	/**
	 * @return la edadg
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
