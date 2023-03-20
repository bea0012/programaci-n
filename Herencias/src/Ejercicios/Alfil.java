package Ejercicios;

public class Alfil extends Figura{
	
	public Alfil(boolean color, Celda casilla) {
		this.color=color;
		this.casilla=casilla;
	}

	@Override
	public boolean mover(Celda c) {
		boolean respuesta=true;
		int x= Math.abs((int)this.casilla.getCol() - (int)c.getCol());
		int y= Math.abs(this.casilla.getFila() - c.getFila());
		
		if(this.casilla.getCol()==c.getCol() || this.casilla.getFila()==c.getFila()) {
			respuesta=false;
		}else if(x!=y) {
			respuesta=false;
		}else {
			this.casilla=c;
		}
		
		return respuesta;
		
	}

	@Override
	public String toString() {
		return "Alfil [color=" + color + ", casilla=" + casilla + "]";
	}
	
	
	
	/*private char columna;
	private int fila;
	
	public Alfil() {
		this.columna='C';
		this.fila=1;
	}
	
	public Alfil(char columna, int fila) {
		if(columna>('A'+1)-1 || columna<('H'+1)-1 || fila<8 || fila>1) {
			this.columna=columna;
			this.fila=fila;
		}
	}

	public char getColumna() {
		return columna;
	}

	public void setColumna(char columna) {
		this.columna = columna;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	@Override
	public boolean mover(char columna, int fila) {
		
		boolean respuesta=true;
		int x= Math.abs((int)this.columna - (int)columna);
		int y= Math.abs(this.fila - fila);
		
		if(this.columna==columna || this.fila==fila) {
			respuesta=false;
		}else if(x!=y) {
			respuesta=false;
		}else {
			this.columna=columna;
			this.fila=fila;
		}
		
		return respuesta;
	}*/


	

}
