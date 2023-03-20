package interfaces;

public interface TarjetaMonedero {
	public void comprar(float importe, String dni);
	public String getID();
	public String getDniTitular();
	public float getSaldo();
	public void setPin(int pin);

}
