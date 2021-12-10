/**
 * 
 */
package modelo;

/**
 * @author braya
 *
 */
public class Facultad {
	
	public String nombre;
	public int numeroProgramas;
	/**
	 * @param nombre
	 * @param numeroProgramas
	 */
	public Facultad(String nombre, int numeroProgramas) {
		super();
		this.nombre = nombre;
		this.numeroProgramas = numeroProgramas;
	}

	public Facultad(){
		
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
	 * @return the numeroProgramas
	 */
	public int getNumeroProgramas() {
		return numeroProgramas;
	}

	/**
	 * @param numeroProgramas the numeroProgramas to set
	 */
	public void setNumeroProgramas(int numeroProgramas) {
		this.numeroProgramas = numeroProgramas;
	}

	@Override
	public String toString() {
		return "Facultad [nombre=" + nombre + ", numeroProgramas=" + numeroProgramas + "]";
	}
	
	
}
