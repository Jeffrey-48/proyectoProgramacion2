package Logica;

import java.util.ArrayList;

import modelo.Estudiante;
import modelo.Profesor;

public class Principal {
	
	public ArrayList<Estudiante> estudiantes;
	public ArrayList<Profesor> profesor;
	
	public Principal() {
		iniciar();
	}

	private void iniciar() {
		CreacionEstudiante estudiantes = new CreacionEstudiante();
		this.estudiantes=estudiantes.getEstudiantesInscritos();
		CreacionProfesor profesor = new CreacionProfesor();
		this.profesor = profesor.getMisProfesores();
	}
	
}
