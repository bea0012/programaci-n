package interfaces;

public class Tarjeta implements TarjetaDebito, TarjetaMonedero{
	private String id;
	private String dniTitular;
	private int pin;
	private float saldo;
	
	public Tarjeta(String id, String dniTitular, int pin, float saldo) {
		this.id = id;
		this.dniTitular = dniTitular;
		this.pin = pin;
		this.saldo = saldo;
	}
	@Override
	public String getID() {
		return this.id;
	}
	
	@Override
	public String getDniTitular() {
		return this.dniTitular;
	}
	@Override
	public float getSaldo() {
		return this.saldo;
	}
	@Override
	public void setPin(int pin) {
		this.pin=pin;
		
	}
	@Override
	public void comprar(float importe, String dni) {
		if(this.saldo>=importe && this.pin==pin) {
			this.saldo-=saldo;
		}
		
	}
	@Override
	public void retirar(float importe, int pin) {
		
		if(this.saldo>=importe && this.pin==pin) {
			this.saldo-=importe;
		}
		
	}

	
	
}
