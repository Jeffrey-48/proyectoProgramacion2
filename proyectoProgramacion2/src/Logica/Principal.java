package Logica;

import java.util.ArrayList;
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

	/**
	 * Metodo usado para iniciar los metodos 
	 */
	private void iniciar() {
		CreacionEstudiante estudiantes = new CreacionEstudiante();
		this.estudiantes = estudiantes.getEstudiantesInscritos();
		CreacionProfesor profesor = new CreacionProfesor();
		this.profesor = profesor.getMisProfesores();
		CreacionFacultad facultad = new CreacionFacultad();
		this.facultad = facultad.getMisFacultades();
		CreacionSalon salon = new CreacionSalon();
		this.salon = salon.getMisSalones();
		llenarPersonas(this.estudiantes, this.profesor);
		universidad = new Universidad("UniQuindio", "0123", "la castellana", "036 784 512", Tipo.PUBLICA, this.facultad,
				personas);
		llenarListas();
		System.out.println(this.salon.toString());
	}

	/**
	 * Metodo para llenar las diferentes listas usadas en el proyecto
	 */
	private void llenarListas() {
		for (int i = 0; i < this.salon.size(); i++) {
			if (this.salon.get(i).getNombre().equals("Salon01")) {
				ArrayList<Estudiante> estudiantesSalon1 = new ArrayList<>();
				estudiantesSalon1.add(this.estudiantes.get(i));
				ArrayList<Profesor> profesores1 = new ArrayList<>();
				profesores1.add(this.profesor.get(i));
				this.salon.get(i).setMisProfesores(profesores1);
				this.salon.get(i).setMisEstudiantes(estudiantesSalon1);
			}
			if (this.salon.get(i).getNombre().equals("Salon100")) {
				ArrayList<Estudiante> estudiantesSalon2 = new ArrayList<>();
				estudiantesSalon2.add(this.estudiantes.get(i));
				ArrayList<Profesor> profesores1 = new ArrayList<>();
				profesores1.add(this.profesor.get(i));
				this.salon.get(i).setMisProfesores(profesores1);
				this.salon.get(i).setMisEstudiantes(estudiantesSalon2);
			}
			if (this.salon.get(i).getNombre().equals("Salon200")) {
				ArrayList<Estudiante> estudiantesSalon3 = new ArrayList<>();
				estudiantesSalon3.add(this.estudiantes.get(i));
				ArrayList<Profesor> profesores1 = new ArrayList<>();
				profesores1.add(this.profesor.get(i));
				this.salon.get(i).setMisProfesores(profesores1);
				this.salon.get(i).setMisEstudiantes(estudiantesSalon3);
			}
			if (this.salon.get(i).getNombre().equals("Salon300")) {
				ArrayList<Estudiante> estudiantesSalon4 = new ArrayList<>();
				estudiantesSalon4.add(this.estudiantes.get(i));
				ArrayList<Profesor> profesores1 = new ArrayList<>();
				profesores1.add(this.profesor.get(i));
				this.salon.get(i).setMisProfesores(profesores1);
				this.salon.get(i).setMisEstudiantes(estudiantesSalon4);
			}
			if (this.salon.get(i).getNombre().equals("Salon400")) {
				ArrayList<Estudiante> estudiantesSalon5 = new ArrayList<>();
				estudiantesSalon5.add(this.estudiantes.get(i));
				ArrayList<Profesor> profesores1 = new ArrayList<>();
				profesores1.add(this.profesor.get(i));
				this.salon.get(i).setMisProfesores(profesores1);
				this.salon.get(i).setMisEstudiantes(estudiantesSalon5);
			}
		}
		
	}

	/**
	 * 
	 * @param estudiantes2
	 * @param profesor2
	 */
	private void llenarPersonas(ArrayList<Estudiante> estudiantes2, ArrayList<Profesor> profesor2) {
		personas = new ArrayList<>();
		for (int i = 0; i < estudiantes2.size(); i++) {
			personas.add(estudiantes2.get(i));
		}
		for (int i = 0; i < profesor2.size(); i++) {
			personas.add(profesor2.get(i));
		}
	}

}
