package Logica;

import java.util.ArrayList;

import modelo.Estudiante;
import modelo.Facultad;
import modelo.Profesor;
import modelo.Salon;

public class Principal {
	
	public ArrayList<Estudiante> estudiantes;
	public ArrayList<Profesor> profesor;
	public ArrayList<Facultad> facultad;
	public ArrayList<Salon> salon;
	
	
	public Principal() {
		iniciar();
	}

	private void iniciar() {
		CreacionEstudiante estudiantes = new CreacionEstudiante();
		this.estudiantes=estudiantes.getEstudiantesInscritos();
		CreacionProfesor profesor = new CreacionProfesor();
		this.profesor = profesor.getMisProfesores();
		CreacionFacultad facultad = new CreacionFacultad();
		this.facultad = facultad.getMisFacultades();
		CreacionSalon salon = new CreacionSalon();
		this.salon = salon.getMisSalones();
	}
	
}
