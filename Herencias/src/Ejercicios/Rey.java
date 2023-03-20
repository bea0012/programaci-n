package Ejercicios;

public class Rey extends Figura{
	
	public Rey(boolean color, Celda casilla) {
		this.color=color;
		this.casilla=casilla;
	}

	@Override
	public boolean mover(Celda c) {
		
		boolean respuesta= true;
		if(c.getCol()==this.casilla.getCol()+1 || c.getCol()==this.casilla.getCol()-1 || c.getFila()==this.casilla.getFila()+1 || c.getFila()==this.casilla.getFila()-1 ) {
			this.casilla=c;
		}else{
			respuesta=false;
		}
		
		return respuesta;
	}

	@Override
	public String toString() {
		return "Rey [color=" + color + ", casilla=" + casilla + "]";
	}
	
	
	
	/*private char columna;
	private int fila;
	
	public Rey() {
		this.columna='E';
		this.fila=1;
	}
	
	public Rey(char columna, int fila) {
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
		boolean respuesta= true;
		if(columna==this.columna+1 || columna==this.columna-1 || fila==this.fila+1 || fila==this.fila-1 ) {
			this.columna=columna;
			this.fila=fila;
		}else{
			respuesta=false;
		}
		
		
		return respuesta;
	}*/

}
