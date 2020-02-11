package banco;

import java.util.Scanner;

import bancomodel.CajaAhorro;
import bancomodel.Cliente;
import bancomodel.CuentaCorriente;

public class AppBanco {

	public static void main(String[] args) {

		Cliente cli1 = new Cliente();
		System.out.println("APLICACION BANCOS:");
		System.out.println("==================");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre de cliente: ");
		String cliNombre = sc.next();
		cli1.setNombre(cliNombre);
		System.out.println("Ingrese DNI de cliente: ");
		String cliDNI = sc.next();
		cli1.setDni(cliDNI);

		CajaAhorro cajaA = new CajaAhorro();
		cajaA.setNumero("001");
		cajaA.setSaldo(1000);

		CuentaCorriente cc = new CuentaCorriente();
		cc.setNumero("002");
		cc.setSaldo(1500);
		cc.setDescubierto(500);
		

		cli1.setsCuentaCorriente(cc);
		cli1.setsCajaAhorro(cajaA);
		
		System.out.println("");

		System.out.println("Bienvenido al sistema: " + cli1.getNombre());
		System.out.println("Cual es la operacion que desea realizar ");
		System.out.println("1. Extraer dinero de la Cuenta Corriente");
		System.out.println("2. Extraer dinero de la Caja de Ahorros");
		System.out.println("Operacion elegida:");
		int cliEleccion = sc.nextInt();
		try {

			switch (cliEleccion) {
				case 1: {
					System.out.println("Ingrese monto a extraer en su Cuenta Corriente: ");
					int monto = sc.nextInt();
					cli1.getsCuentaCorriente().extraer(monto);
					break;
				}
				case 2: {
					System.out.println("Ingrese monto a extraer en su Caja de ahorros: ");
					int monto = sc.nextInt();
					cli1.getsCajaAhorro().extraer(monto);
					break;
				}
			}
		} catch (SinSaldo e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}

		sc.close();

	}
}
