package modelo;

public class Universidad {
	
	public String nombre;
	public String nit;
	public String direccion;
	public String telefono;
	public String tipo;
	
	public Universidad() {

	}
	
	public Universidad(String nombre, String nit, String direccion, String telefono, String tipo) {
		this.nombre = nombre;
		this.nit = nit;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Universidad [nombre=" + nombre + ", nit=" + nit + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", tipo=" + tipo + "]";
	}
	
	
}
