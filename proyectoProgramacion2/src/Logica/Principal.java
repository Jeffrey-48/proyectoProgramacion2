package Logica;

import java.util.ArrayList;

import modelo.Estudiante;

public class Principal {
	
	public ArrayList<Estudiante> estudiantes;
	
	public Principal() {
		iniciar();
	}

	private void iniciar() {
		CreacionCliente estudiantes = new CreacionCliente();
		this.estudiantes=estudiantes.getEstudiantesInscritos();
	}
	
}
