package modelo;

public class Curso {
	
	public String nombre;
	public int creditos;
	public String codigo;
	public Curso() {
		super();
	}
	public Curso(String nombre, int creditos, String codigo) {
		super();
		this.nombre = nombre;
		this.creditos = creditos;
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", creditos=" + creditos + ", codigo=" + codigo + "]";
	}
	
}
