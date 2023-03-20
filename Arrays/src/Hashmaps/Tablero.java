package Hashmaps;

import java.util.HashMap;

public class Tablero {
	
	HashMap <String, Casilla> tablero;

	public Tablero() {
		this.tablero = new HashMap <String,Casilla>();
	}

	public HashMap<String, Casilla> getTablero() {
		return tablero;
	}

	public void setTablero(HashMap<String, Casilla> tablero) {
		this.tablero = tablero;
	}
	
	public boolean tocado(Casilla c) {
		return c.tocado();
	}

}
