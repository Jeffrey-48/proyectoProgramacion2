/**
 * 
 */
package modelo;

import java.util.ArrayList;

public class Facultad extends Edificacion {

	public String nombre;
	public int numeroProgramas;
	public ArrayList<Programa> misProgramas;
	public ArrayList<Salon> misSalones;

	/**
	 * @param nombre
	 * @param numeroProgramas
	 */

	public Facultad() {

	}

	/**
	 * 
	 * @param nombre
	 * @param numeroProgramas
	 * @param misProgramas
	 * @param misSalones
	 * @param metrosCuadrados
	 * @param numeroPisos
	 * @param numeroSalones
	 */
	public Facultad(String nombre, int numeroProgramas, ArrayList<Programa> misProgramas, ArrayList<Salon> misSalones,
			double metrosCuadrados, int numeroPisos, int numeroSalones) {
		super(metrosCuadrados, numeroPisos, numeroSalones);
		this.nombre = nombre;
		this.numeroProgramas = numeroProgramas;
		this.misProgramas = misProgramas;
		this.misSalones = misSalones;
	}	

	/**
	 * @return the misProgramas
	 */
	public ArrayList<Programa> getMisProgramas() {
		return misProgramas;
	}

	/**
	 * @param misProgramas the misProgramas to set
	 */
	public void setMisProgramas(ArrayList<Programa> misProgramas) {
		this.misProgramas = misProgramas;
	}

	/**
	 * @return the misSalones
	 */
	public ArrayList<Salon> getMisSalones() {
		return misSalones;
	}

	/**
	 * @param misSalones the misSalones to set
	 */
	public void setMisSalones(ArrayList<Salon> misSalones) {
		this.misSalones = misSalones;
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
		return "Facultad [nombre=" + nombre + ", numeroProgramas=" + numeroProgramas + ", misProgramas=" + misProgramas
				+ ", misSalones=" + misSalones + "]";
	}

}
