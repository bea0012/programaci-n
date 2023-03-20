package interfaces;

public interface TarjetaDebito {
	public void comprar(float importe, String dni);
	public void retirar(float importe, int pin);
	public String getID();
	public String getDniTitular();
	public float getSaldo();
	public void setPin(int pin);
}
