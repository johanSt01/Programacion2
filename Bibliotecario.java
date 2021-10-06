package co.uniquindio.prog2.bibliotecaTaller.model;

public class Bibliotecario 
{
	/*
	 * Atributos
	 */
	
	String nombre;
	String identificacion;
	String direccion;
	String telefono;
	
	/*
	 * metodo constructor 
	 */
	
	public Bibliotecario(String nombre, String identificacion, String direccion, String telefono)
	{
		super();
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	/*
	 * getters and setters
	 */
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
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
	
	public String toString()
	{
		return "Bibliotecario [nombre=" + nombre + ", identificacion=" + identificacion + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}
	
}
