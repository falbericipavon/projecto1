package bancomodel;

import banco.SinSaldo;

public abstract class Cuenta {

	protected String numero;
	protected float saldo;
	
	public void extraer(float monto) throws SinSaldo {
		if (saldo >= monto) {
			saldo = saldo-monto;
			System.out.println("Extraccion Realizada");
			System.out.println("Nuevo saldo caja de ahorro: " + saldo);
		}
		else {
			throw new SinSaldo ("Saldo insuficiente: " + saldo);
		}
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}
