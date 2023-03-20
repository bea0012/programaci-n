package Ejercicios;

public class Cuenta_bancaria {
	
	
	private String titular;
	private double saldo;
	
	public Cuenta_bancaria() {
		this.titular="";
		this.saldo=0;
	}
	
	public Cuenta_bancaria (String titular, double saldo) {
			this.titular=titular;
			this.saldo=saldo;
	}
	
	public Cuenta_bancaria (String titular) {
			this.titular=titular;
			this.saldo=0;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean ingresar(double ingreso) {
		boolean correcto=true;
		if(ingreso>0) {
			this.saldo+=ingreso;
		}else {
			correcto=false;
		}
		return correcto;
		
	}
	public  boolean retirar(double importe) {
		boolean correcto=true;
		if(importe<=saldo) {
			this.saldo-=importe;
		}else {
			correcto=false;
		}
		return correcto;
	}
	public boolean transferencia(double cantidad, Cuenta_bancaria cuenta2) {
		boolean correcto=true;
		if(this.retirar(cantidad)) {
			cuenta2.ingresar(cantidad);
		}else {
			correcto=false;
		}
		return correcto;
	}
	
	public String ToString() {
		return "La cuenta esta a nombre de " + this.titular + " y cuenta con un saldo de " + this.saldo;
	}
	

}
