/**
 * 
 */
package modelo;

/**
 * @author braya
 *
 */
public class Estudiante extends Persona{

	public int semestre;
	public int codigoEstudiante;
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
	 */
	public Estudiante(String nombre, String apellido, String correo, String direccion, String identificador,
			String telefono, String tipoSangre, String rh, String fechaNacimiento, String genero,
			String tipoVinculacion, int semestre, int codigoEstudiante) {
		super(nombre, apellido, correo, direccion, identificador, telefono, tipoSangre, rh, fechaNacimiento, genero,
				tipoVinculacion);
		this.semestre = semestre;
		this.codigoEstudiante = codigoEstudiante;
	}
	
	public Estudiante()
	{
		
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
		return "Estudiante [semestre=" + semestre + ", codigoEstudiante=" + codigoEstudiante + "]";
	}
	
	
	
	
}
