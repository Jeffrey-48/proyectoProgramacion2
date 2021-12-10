package Logica;

import java.util.ArrayList;

import modelo.Estudiante;

public class Principal {
	
	public ArrayList<Estudiante> estudiantes;
	
	public Principal() {
		iniciar();
	}

	private void iniciar() {
		CreacionEstudiante estudiantes = new CreacionEstudiante();
		this.estudiantes=estudiantes.getEstudiantesInscritos();
	}
	
}
