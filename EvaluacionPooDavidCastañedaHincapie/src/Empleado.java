
public class Empleado extends Persona{
	private String Departamento;
	private float Salario;
	private String FechaDeContratacion;
	
	public Empleado(String nombre, String direccion, String correo, String telefono, String departamento, float salario,
			String fechaDeContratacion) {
		super(nombre, direccion, correo, telefono);
		this.Departamento = departamento;
		this.Salario = salario;
		this.FechaDeContratacion = fechaDeContratacion;
	}

	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		this.Departamento = departamento;
	}

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		this.Salario = salario;
	}

	public String getFechaDeContratacion() {
		return FechaDeContratacion;
	}

	public void setFechaDeContratacion(String fechaDeContratacion) {
		this.FechaDeContratacion = fechaDeContratacion;
	}

	@Override
	public String toString() {
		return "Empleado [Departamento=" + Departamento + ", Salario=" + Salario + ", FechaDeContratacion="
				+ FechaDeContratacion + ", getDepartamento()=" + getDepartamento() + ", getSalario()=" + getSalario()
				+ ", getFechaDeContratacion()=" + getFechaDeContratacion() + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getCorreo()=" + getCorreo() + ", getTelefono()="
				+ getTelefono() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
