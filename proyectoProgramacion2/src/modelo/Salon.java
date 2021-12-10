package modelo;

import java.util.ArrayList;

public class Salon extends Edificacion {

	public String nombre;
	public String ubicacion;
	public int numero;
	public ArrayList<Curso> misCursos;
	public ArrayList<Profesor> misProfesores;
	public ArrayList<Estudiante> misEstudiantes;
	public Facultad miFacultad;

	public Salon() {
		super();
	}

	/**
	 * @param nombre
	 * @param ubicacion
	 * @param numero
	 * @param misCursos
	 * @param misProfesores
	 * @param misEstudiantes
	 * @param miFacultad
	 */
	public Salon(String nombre, String ubicacion, int numero, ArrayList<Curso> misCursos,
			ArrayList<Profesor> misProfesores, ArrayList<Estudiante> misEstudiantes, Facultad miFacultad) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.numero = numero;
		this.misCursos = misCursos;
		this.misProfesores = misProfesores;
		this.misEstudiantes = misEstudiantes;
		this.miFacultad = miFacultad;
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
	 * @return the ubicacion
	 */
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * @param ubicacion the ubicacion to set
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the misCursos
	 */
	public ArrayList<Curso> getMisCursos() {
		return misCursos;
	}

	/**
	 * @param misCursos the misCursos to set
	 */
	public void setMisCursos(ArrayList<Curso> misCursos) {
		this.misCursos = misCursos;
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

	/**
	 * @return the miFacultad
	 */
	public Facultad getMiFacultad() {
		return miFacultad;
	}

	/**
	 * @param miFacultad the miFacultad to set
	 */
	public void setMiFacultad(Facultad miFacultad) {
		this.miFacultad = miFacultad;
	}

	@Override
	public String toString() {
		return "Salon [nombre=" + nombre + ", ubicacion=" + ubicacion + ", numero=" + numero + ", misCursos="
				+ misCursos + ", misProfesores=" + misProfesores + ", misEstudiantes=" + misEstudiantes
				+ ", miFacultad=" + miFacultad + "]";
	}

}
