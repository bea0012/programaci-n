package Hashmaps;

public class Barco extends Casilla {
	
	private String id;
	private int tamaño;
	private int vida;
	
	public Barco(int tamaño, int vida, String id) {
		this.id=id;
		this.tamaño = tamaño;
		this.vida = tamaño;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public boolean tocado() {
		this.vida-=1;
		return true;
	}
	
	public boolean isAlive() {
		boolean respuesta=true;
		if(this.vida==0) {
			respuesta=false;
		}
		
		return respuesta;
	}
	
	
	
	

}
