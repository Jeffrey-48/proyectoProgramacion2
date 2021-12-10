/**
 * 
 */
package modelo;

import java.util.ArrayList;

/**
 * @author braya
 *
 */
public class Estudiante extends Persona {

	public int semestre;
	public int codigoEstudiante;
	public ArrayList<Salon> misSalones;
	public ArrayList<Curso> misCursos;

	public Estudiante() {

	}

	/**
	 * @param nombre
	 * @param apellido
	 * @param correo
	 * @param direccion
	 * @param identificador
	 * @param telefono
	 * @param tipoSangre
	 * @param rh
	 * @param fechaNacimiento
	 * @param genero
	 * @param tipoVinculacion
	 * @param semestre
	 * @param codigoEstudiante
	 * @param misSalones
	 * @param misCursos
	 */
	public Estudiante(String nombre, String apellido, String correo, String direccion, String identificador,
			String telefono, String tipoSangre, String rh, String fechaNacimiento, String genero,
			String tipoVinculacion, int semestre, int codigoEstudiante, ArrayList<Salon> misSalones,
			ArrayList<Curso> misCursos) {
		super(nombre, apellido, correo, direccion, identificador, telefono, tipoSangre, rh, fechaNacimiento, genero,
				tipoVinculacion);
		this.semestre = semestre;
		this.codigoEstudiante = codigoEstudiante;
		this.misSalones = misSalones;
		this.misCursos = misCursos;
	}

	public ArrayList<Salon> getMisSalones() {
		return misSalones;
	}

	public void setMisSalones(ArrayList<Salon> misSalones) {
		this.misSalones = misSalones;
	}

	public ArrayList<Curso> getMisCursos() {
		return misCursos;
	}

	public void setMisCursos(ArrayList<Curso> misCursos) {
		this.misCursos = misCursos;
	}

	/**
	 * @return the semestre
	 */
	public int getSemestre() {
		return semestre;
	}

	/**
	 * @param semestre the semestre to set
	 */
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	/**
	 * @return the codigoEstudiante
	 */
	public int getCodigoEstudiante() {
		return codigoEstudiante;
	}

	/**
	 * @param codigoEstudiante the codigoEstudiante to set
	 */
	public void setCodigoEstudiante(int codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

	@Override
	public String toString() {
		return "Estudiante [semestre=" + semestre + ", codigoEstudiante=" + codigoEstudiante + ", misSalones="
				+ misSalones + ", misCursos=" + misCursos + "]";
	}

}
