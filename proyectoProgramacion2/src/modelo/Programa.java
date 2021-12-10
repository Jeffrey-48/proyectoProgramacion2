/**
 * 
 */
package modelo;

/**
 * @author braya
 *
 */
public class Programa {
	
	public String nombre;
	public int creditos;
	public int numeroEstudiantesRegistrados;
	/**
	 * @param nombre
	 * @param creditos
	 * @param numeroEstudiantesRegistrados
	 */
	public Programa(String nombre, int creditos, int numeroEstudiantesRegistrados) {
		super();
		this.nombre = nombre;
		this.creditos = creditos;
		this.numeroEstudiantesRegistrados = numeroEstudiantesRegistrados;
	}
	
	public Programa() {
		
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the creditos
	 */
	public int getCreditos() {
		return creditos;
	}

	/**
	 * @param creditos the creditos to set
	 */
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	/**
	 * @return the numeroEstudiantesRegistrados
	 */
	public int getNumeroEstudiantesRegistrados() {
		return numeroEstudiantesRegistrados;
	}

	/**
	 * @param numeroEstudiantesRegistrados the numeroEstudiantesRegistrados to set
	 */
	public void setNumeroEstudiantesRegistrados(int numeroEstudiantesRegistrados) {
		this.numeroEstudiantesRegistrados = numeroEstudiantesRegistrados;
	}

	@Override
	public String toString() {
		return "Programa [nombre=" + nombre + ", creditos=" + creditos + ", numeroEstudiantesRegistrados="
				+ numeroEstudiantesRegistrados + "]";
	}
	
	

}
