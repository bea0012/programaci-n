package Ejercicios;

public class Peon extends Figura{
	
	private boolean salida;
	
	public Peon(boolean color, Celda casilla, boolean salida) {
		this.color=color;
		this.casilla=casilla;
		this.salida=salida;
	}

	@Override
	public boolean mover(Celda c) {
		boolean respuesta=true;
		if(this.salida=true) {
			this.casilla=c;
		}else {
		   if(c.getCol()>this.casilla.getCol()+1 && c.getFila()>this.casilla.getFila()+1 || c.getFila()==this.casilla.getFila()+1) {
			   this.casilla=c;
		   }
		   respuesta=false;
		}
			
		return respuesta;
		
	}

	@Override
	public String toString() {
		return "Peon [salida=" + salida + ", color=" + color + ", casilla=" + casilla + "]";
	}
	
	
	
	/*private char columna;
	private int fila;
	private boolean salida;
	
	public Peon() {
		this.columna='E';
		this.fila=1;
	}
	
	public Peon(char columna, int fila, boolean salida) {
		if(columna>('A'+1)-1 || columna<('H'+1)-1 || fila<8 || fila>1) {
			this.columna=columna;
			this.fila=fila;
			this.salida=salida;
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

	public boolean isSalida() {
		return salida;
	}

	public void setSalida(boolean salida) {
		this.salida = salida;
	}

	@Override
	public boolean mover(char columna, int fila) {
		boolean respuesta=true;
		if(this.salida=true) {
			this.columna=columna;
			this.fila=this.fila+2;
		}else {
		   if(columna>this.columna+1 && fila>this.fila+1 || fila==this.fila+1) {
			   this.columna=columna;
			   this.fila=fila;
		   }
		   respuesta=false;
		}
			
		return respuesta;
	}*/

}
