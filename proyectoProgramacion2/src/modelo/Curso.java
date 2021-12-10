package modelo;

import java.util.ArrayList;

public class Curso {

	public String nombre;
	public int creditos;
	public String codigo;
	public ArrayList<Salon> misSalones;
	public ArrayList<Profesor> misProfesores;
	public ArrayList<Estudiante> misEstudiantes;

	public Curso() {
		super();
	}

	/**
	 * @param nombre
	 * @param creditos
	 * @param codigo
	 * @param misSalones
	 * @param misProfesores
	 * @param misEstudiantes
	 */
	public Curso(String nombre, int creditos, String codigo, ArrayList<Salon> misSalones,
			ArrayList<Profesor> misProfesores, ArrayList<Estudiante> misEstudiantes) {
		super();
		this.nombre = nombre;
		this.creditos = creditos;
		this.codigo = codigo;
		this.misSalones = misSalones;
		this.misProfesores = misProfesores;
		this.misEstudiantes = misEstudiantes;
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
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	 * @return the misProfesores
	 */
	public ArrayList<Profesor> getMisProfesores() {
		return misProfesores;
	}

	/**
	 * @param misProfesores the misProfesores to set
	 */
	public void setMisProfesores(ArrayList<Profesor> misProfesores) {
		this.misProfesores = misProfesores;
	}

	/**
	 * @return the misEstudiantes
	 */
	public ArrayList<Estudiante> getMisEstudiantes() {
		return misEstudiantes;
	}

	/**
	 * @param misEstudiantes the misEstudiantes to set
	 */
	public void setMisEstudiantes(ArrayList<Estudiante> misEstudiantes) {
		this.misEstudiantes = misEstudiantes;
	}

	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", creditos=" + creditos + ", codigo=" + codigo + ", misSalones="
				+ misSalones + ", misProfesores=" + misProfesores + ", misEstudiantes=" + misEstudiantes + "]";
	}


	

}
