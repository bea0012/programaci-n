package Ejercicios;

public abstract class Figura {
	
	protected boolean color;
	protected Celda casilla;
	
	
	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	public Celda getCasilla() {
		return casilla;
	}

	public void setCasilla(Celda casilla) {
		this.casilla = casilla;
	}


	public abstract boolean mover(Celda c);
		
}
