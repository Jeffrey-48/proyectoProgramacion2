package modelo;

public class Salon extends Edificacion{
	
	public String nombre;
	public String ubicacion;
	public int numero;
	public Salon() {
		super();
	}
	public Salon(String nombre, String ubicacion, int numero) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Salon [nombre=" + nombre + ", ubicacion=" + ubicacion + ", numero=" + numero + "]";
	}
	
	

}
