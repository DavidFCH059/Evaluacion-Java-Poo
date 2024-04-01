
public class Estudiante extends Persona {
	private int Estado;
	
	public Estudiante(String nombre, String direccion, String correo, String telefono, int estado) {
		super(nombre, direccion, correo, telefono);
		this.Estado = estado;
	}

	public int getEstado() {
		return Estado;
	}

	public void setEstado(int estado) {
		this.Estado = estado;
	}

	@Override
	public String toString() {
		return "Estudiante [Estado=" + Estado + ", getEstado()=" + getEstado() + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getCorreo()=" + getCorreo() + ", getTelefono()="
				+ getTelefono() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
