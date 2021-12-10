/**
 * 
 */
package modelo;

import java.util.ArrayList;

/**
 * @author braya
 *
 */
public class Profesor extends Persona {
	public String especialidad;
	public ArrayList<Curso> misCursos;
	public ArrayList<Salon> misSalones;

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
	 * @param especialidad
	 * @param misCursos
	 * @param misSalones
	 */
	public Profesor(String nombre, String apellido, String correo, String direccion, String identificador,
			String telefono, String tipoSangre, String rh, String fechaNacimiento, String genero,
			String tipoVinculacion, String especialidad, ArrayList<Curso> misCursos, ArrayList<Salon> misSalones) {
		super(nombre, apellido, correo, direccion, identificador, telefono, tipoSangre, rh, fechaNacimiento, genero,
				tipoVinculacion);
		this.especialidad = especialidad;
		this.misCursos = misCursos;
		this.misSalones = misSalones;
	}

	/**
	 * 
	 */
	public Profesor() {

	}

	public ArrayList<Curso> getMisCursos() {
		return misCursos;
	}

	public void setMisCursos(ArrayList<Curso> misCursos) {
		this.misCursos = misCursos;
	}

	public ArrayList<Salon> getMisSalones() {
		return misSalones;
	}

	public void setMisSalones(ArrayList<Salon> misSalones) {
		this.misSalones = misSalones;
	}

	/**
	 * @return the especialidad
	 */
	public String getEspecialidad() {
		return especialidad;
	}

	/**
	 * @param especialidad the especialidad to set
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Profesor [especialidad=" + especialidad + ", misCursos=" + misCursos + ", misSalones=" + misSalones
				+ "]";
	}

}
