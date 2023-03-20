package Ejercicios;

public class Reina extends Figura{
	
	private char columna;
	private int fila;
	
	public Reina() {
		this.columna='D';
		this.fila=1;
	}
	
	public Reina(char columna, int fila) {
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
	public boolean mover(char columna, int fila) { /*movimiento de torre + movimiento de alfil*/
		boolean respuesta=true;
		int x= Math.abs((int)this.columna - (int)columna);
		int y= Math.abs(this.fila - fila);
		
		if(this.columna!=columna && (this.fila>fila || this.fila<fila)) {
			respuesta=false;
		}else if(this.columna==columna && this.fila==fila || x!=y) {
			respuesta=false;
		}else {
			this.columna=columna;
			this.fila=fila;
		}
		
		
		
		
		/*if(this.columna==columna || this.fila==fila) {
			respuesta=false;
		}else if(x!=y) {
			respuesta=false;
		}else {
			this.columna=columna;
			this.fila=fila;
		}*/
		
		
		
		return respuesta;
	}

}
