package Ejercicios;

public class Caballo extends Figura {
	
	private char columna;
	private int fila;
	
	public Caballo() {
		this.columna='B';
		this.fila=1;
	}
	
	public Caballo(char columna, int fila) {
		if(columna>('A'+1)-1 || columna<('H'+1)-1 || fila<8 || fila>1) {
			this.columna=columna;
			this.fila=fila;
		}
	}
	
	

	@Override
	public boolean mover(char columna, int fila) {
		boolean respuesta=true;
		if(this.columna==columna) {
			respuesta=false;
		}
		
		return respuesta;
	}

}
