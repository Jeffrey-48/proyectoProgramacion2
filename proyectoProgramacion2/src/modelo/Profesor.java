/**
 * 
 */
package modelo;

/**
 * @author braya
 *
 */
public class Profesor extends Persona{
	public String especialidad;

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
	 */
	public Profesor(String nombre, String apellido, String correo, String direccion, String identificador,
			String telefono, String tipoSangre, String rh, String fechaNacimiento, String genero,
			String tipoVinculacion, String especialidad) {
		super(nombre, apellido, correo, direccion, identificador, telefono, tipoSangre, rh, fechaNacimiento, genero,
				tipoVinculacion);
		this.especialidad = especialidad;
	}
	
	/**
	 * 
	 */
	public Profesor()
	{
		
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
		return "Profesor [especialidad=" + especialidad + "]";
	}
	
	

}
