package Logica;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.Estudiante;
import modelo.Facultad;
import modelo.Persona;
import modelo.Profesor;
import modelo.Salon;
import modelo.Tipo;
import modelo.Universidad;

public class Principal {
	
	public ArrayList<Estudiante> estudiantes;
	public ArrayList<Profesor> profesor;
	public ArrayList<Facultad> facultad;
	public ArrayList<Salon> salon;
	public ArrayList<Persona> personas;
	public Universidad universidad;
	
	
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
		llenarPersonas(this.estudiantes, this.profesor);
		universidad = new Universidad( "UniQuindio", "0123" ,  "la castellana", 
				"036 784 512", Tipo.PUBLICA,
				this.facultad, 
				personas);
	}


	private void llenarPersonas(ArrayList<Estudiante> estudiantes2, ArrayList<Profesor> profesor2) {
		personas = new ArrayList<>();
		for (int i = 0; i < estudiantes2.size(); i++) {
			personas.add(estudiantes2.get(i));
		}
		for (int i = 0; i <profesor2.size(); i++) {
			personas.add(profesor2.get(i));
		}
	}
	
}
