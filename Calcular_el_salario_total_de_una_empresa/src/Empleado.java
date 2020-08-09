
public class Empleado {
	private String nombre;
	private String apellidos;
	private String identificacion;
	private double salario;
	
	
	
	public Empleado(String identificacion, double salario) {
		super();
		this.identificacion = identificacion;
		this.salario = salario;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getIdentificacion() {
		return identificacion;
	}



	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
