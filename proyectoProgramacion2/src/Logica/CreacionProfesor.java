/**
 * 
 */
package Logica;

import java.util.ArrayList;

import modelo.Profesor;

public class CreacionProfesor {

	public ArrayList<Profesor> misProfesores;
	
	/**
	 * Constructor de la clase
	 */
	public CreacionProfesor() {
		misProfesores = new ArrayList<Profesor>();
		crearProfesores();
	}
	
	/**
	 * Metodo usado para crear profesores y agregarlos a un ArrayList
	 */
	public void crearProfesores() {
		Profesor p1 = new Profesor("Alex", "Vargas", "alex@gmail.com", "Barrio villa liliana", "01","3218759021" , "AB", "+", "23/08/1990","Masculino" ,"Profesor" , "Calculo", null, null);
		Profesor p2 = new Profesor("Maria", "Castro", "castroMaria@gmail.com", "Barrio las Acacias", "02","3218329045" , "0", "+", "03/11/1991","Femenino" ,"Profesor" , "Historia", null, null);
		Profesor p3 = new Profesor("Marlon", "Cepeda", "ce092M@gmail.com", "Armenia, Quindio", "03","3218727621" , "B", "+", "23/01/1990","Masculino" ,"Profesor" , "Programacion", null, null);
		Profesor p4 = new Profesor("Camilo", "Ortiz", "sorCa@gmail.com", "Tebaida,Quindio", "04","3218759651" , "A", "-", "21/09/1970","Masculino" ,"Profesor" , "Literatura", null, null);
		Profesor p5 = new Profesor("Patricia", "Quintero", "pad61@gmail.com", "Circasia,Quindio", "01","3218902021" , "0", "+", "02/05/1964","Femenino" ,"Profesor" , "Deporte", null, null);
		
		misProfesores.add(p1);
		misProfesores.add(p2);
		misProfesores.add(p3);
		misProfesores.add(p4);
		misProfesores.add(p5);
	}

	/**
	 * @return the misProfesores
	 */
	public ArrayList<Profesor> getMisProfesores() {
		return misProfesores;
	}

	/**
	 * @param misProfesores the misProfesores to set
	 */
	public void setMisProfesores(ArrayList<Profesor> misProfesores) {
		this.misProfesores = misProfesores;
	}
	
	


}
