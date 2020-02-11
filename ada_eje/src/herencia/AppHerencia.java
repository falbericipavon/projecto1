package herencia;

public class AppHerencia {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado();
		emp1.setEdad(28);
		emp1.setNombre("A");
		emp1.setSueldo(1000);
		
		Cliente cli1 = new Cliente();
		cli1.setEdad(40);
		cli1.setNombre("B");
		cli1.setSaldoCuenta(100);
	}
}
