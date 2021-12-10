package modelo;

import java.util.ArrayList;

public class Universidad {

	public String nombre;
	public String nit;
	public String direccion;
	public String telefono;
	public Tipo tipo;
	public ArrayList<Facultad> misFacultades;
	public ArrayList<Persona> misPersonas;

	
	public Universidad() {

	}

	/**
	 * 
	 * @param nombre
	 * @param nit
	 * @param direccion
	 * @param telefono
	 * @param tipo
	 * @param misFacultades
	 * @param misPersonas
	 */
	public Universidad(String nombre, String nit, String direccion, String telefono,  Tipo tipo,
			ArrayList<Facultad> misFacultades, ArrayList<Persona> misPersonas) {
		super();
		this.nombre = nombre;
		this.nit = nit;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipo = tipo;
		this.misFacultades = misFacultades;
		this.misPersonas = misPersonas;
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
	 * @return the nit
	 */
	public String getNit() {
		return nit;
	}

	/**
	 * @param nit the nit to set
	 */
	public void setNit(String nit) {
		this.nit = nit;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the tipo
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the misFacultades
	 */
	public ArrayList<Facultad> getMisFacultades() {
		return misFacultades;
	}

	/**
	 * @param misFacultades the misFacultades to set
	 */
	public void setMisFacultades(ArrayList<Facultad> misFacultades) {
		this.misFacultades = misFacultades;
	}

	/**
	 * @return the misPersonas
	 */
	public ArrayList<Persona> getMisPersonas() {
		return misPersonas;
	}

	/**
	 * @param misPersonas the misPersonas to set
	 */
	public void setMisPersonas(ArrayList<Persona> misPersonas) {
		this.misPersonas = misPersonas;
	}

	@Override
	public String toString() {
		return "Universidad [nombre=" + nombre + ", nit=" + nit + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", tipo=" + tipo + ", misFacultades=" + misFacultades + ", misPersonas=" + misPersonas + "]";
	}

}
