package bancomodel;

import banco.SinSaldo;

public class CuentaCorriente  extends Cuenta {
	protected float descubierto;


	public float getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(float descubierto) {
		this.descubierto = descubierto;
	}

	@Override
	public void extraer(float monto) throws SinSaldo {
		if (saldo + descubierto >= monto) {
			saldo = saldo-monto;
			System.out.println("Extraccion Realizada");
			System.out.println("Nuevo saldo Cuenta corriente: " + saldo);
		}
		else {
			throw new SinSaldo ("Saldo insuficiente: " + saldo);
		}
	}
}
