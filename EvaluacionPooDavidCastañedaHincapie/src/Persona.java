
public class Persona {
	private String Nombre;
	private String Direccion;
	private String Correo;
	private String Telefono;
	
	public Persona(String nombre, String direccion, String correo, String telefono) {
		super();
		this.Nombre = nombre;
		this.Direccion = direccion;
		this.Correo = correo;
		this.Telefono = telefono;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		this.Direccion = direccion;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		this.Correo = correo;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		this.Telefono = telefono;
	}
	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Direccion=" + Direccion + ", Correo=" + Correo + ", Telefono="
				+ Telefono + "]";
	}
}
