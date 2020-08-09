
public class SupervisorTecnico extends Empleado {
	private int aniosTrabajados;
	
	public SupervisorTecnico(String identificacion, double salario, int aniosTrabajados) {
		super(identificacion, salario);
		this.aniosTrabajados = aniosTrabajados;
	}
	public int getAniosTrabajados() {
		return aniosTrabajados;
	}
	
	public void setAniosTrabajados(int aniosTrabajados) {
		this.aniosTrabajados = aniosTrabajados;
	}
	
	@Override
	public double getSalario() {
		double salario = super.getSalario();
		double aumento = 0;
		for(int i=0; i < aniosTrabajados; i++) {
			aumento += salario * 0.05;
	}
		return salario + aumento;
	}
	

}
