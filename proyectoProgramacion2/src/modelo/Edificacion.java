package modelo;

public class Edificacion {
	
	public double metrosCuadrados;
	public int numeroPisos;
	public int numeroSalones;
	
	public Edificacion() {
		super();
	}

	/**
	 * 
	 * @param metrosCuadrados
	 * @param numeroPisos
	 * @param numeroSalones
	 */
	public Edificacion(double metrosCuadrados, int numeroPisos, int numeroSalones) {
		super();
		this.metrosCuadrados = metrosCuadrados;
		this.numeroPisos = numeroPisos;
		this.numeroSalones = numeroSalones;
	}

	/**
	 * @return the metrosCuadrados
	 */
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	/**
	 * @param metrosCuadrados the metrosCuadrados to set
	 */
	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	/**
	 * @return the numeroPisos
	 */
	public int getNumeroPisos() {
		return numeroPisos;
	}

	/**
	 * @param numeroPisos the numeroPisos to set
	 */
	public void setNumeroPisos(int numeroPisos) {
		this.numeroPisos = numeroPisos;
	}

	/**
	 * @return the numeroSalones
	 */
	public int getNumeroSalones() {
		return numeroSalones;
	}

	/**
	 * @param numeroSalones the numeroSalones to set
	 */
	public void setNumeroSalones(int numeroSalones) {
		this.numeroSalones = numeroSalones;
	}

	@Override
	public String toString() {
		return "Edificacion [metrosCuadrados=" + metrosCuadrados + ", numeroPisos=" + numeroPisos + ", numeroSalones="
				+ numeroSalones + "]";
	}

		
	

}
