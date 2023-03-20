package Ejercicios;

public class Torre extends Figura{
	
	public Torre(boolean color, Celda casilla) {
		this.color=color;
		this.casilla=casilla;
	}

	@Override
	public boolean mover(Celda c) {
		boolean mover=true;
		
		if(this.casilla.getCol()!=c.getCol() && (this.casilla.getFila()>c.getFila() || this.casilla.getFila()<c.getFila())) {
			mover=false;
		}else if(this.casilla.getCol()==c.getCol() && this.casilla.getFila()==c.getFila()) {
			mover=false;
		}else {
			this.casilla=c;
		}
		return mover;
	}

	@Override
	public String toString() {
		return this.casilla.toString();
	}
	
	
	
	
	

	
	/**private char columna;
	private int fila;
	
	public Torre() {
		this.columna='A';
		this.fila=1;
	}
	
	public Torre(char columna, int fila) {
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
		
		if(this.columna!=columna && (this.fila>fila || this.fila<fila)) {
			respuesta=false;
		}else if(this.columna==columna && this.fila==fila) {
			respuesta=false;
		}else {
			this.columna=columna;
			this.fila=fila;
		}
			
		
		return respuesta;
	}**/
	
}
