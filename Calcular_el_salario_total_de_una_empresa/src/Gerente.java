
public class Gerente extends SupervisorTecnico{
	
	private double viaticos;
	
	public Gerente(String identificacion, double salario, int aniosTrabajados, double viaticos) {
		super(identificacion, salario, aniosTrabajados);
		this.viaticos = viaticos;
	}
	
	@Override
	public double getSalario() {
		return super.getSalario() + viaticos;
	}
	

}
