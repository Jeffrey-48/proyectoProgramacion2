package Logica;

import java.util.ArrayList;

import modelo.Curso;

public class CreacionCursos {

	public ArrayList<Curso> misCursos;

	public CreacionCursos() {
		misCursos = new ArrayList<Curso>();
		crearCursos();
	}

	/**
	 * Metodo que sirve para crear los cursos y agregarlos a un ArrayList
	 */
	public void crearCursos() {
		Curso c1 = new Curso("Fundamentos de Algoritmia", 3, "001", null, null, null);
		Curso c2 = new Curso("Programación I", 3, "002", null, null, null);
		Curso c3 = new Curso("Programación 2", 3, "003", null, null, null);
		Curso c4 = new Curso("Programación 3", 3, "004", null, null, null);
		Curso c5 = new Curso("Calculo I", 3, "005", null, null, null);
		Curso c6 = new Curso("Calculo 2", 3, "006", null, null, null);
		Curso c7 = new Curso("Calculo 3", 3, "007", null, null, null);
		Curso c8 = new Curso("Fisica I", 3, "008", null, null, null);
		Curso c9 = new Curso("Fisica 2", 3, "009", null, null, null);
		Curso c10 = new Curso("Estadistica", 3, "010", null, null, null);

		misCursos.add(c1);
		misCursos.add(c2);
		misCursos.add(c3);
		misCursos.add(c4);
		misCursos.add(c5);
		misCursos.add(c6);
		misCursos.add(c7);
		misCursos.add(c8);
		misCursos.add(c9);
		misCursos.add(c10);

	}

	/**
	 * @return the misCursos
	 */
	public ArrayList<Curso> getMisCursos() {
		return misCursos;
	}

	/**
	 * @param misCursos the misCursos to set
	 */
	public void setMisCursos(ArrayList<Curso> misCursos) {
		this.misCursos = misCursos;
	}
	
}
