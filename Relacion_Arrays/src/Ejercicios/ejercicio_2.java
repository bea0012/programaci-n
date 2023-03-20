package Ejercicios;

public class ejercicio_2 {
	
	/*Escriba un programa que lea desde teclado 6 números correspondientes a la combinación 
ganadora de la lotería primitiva. A continuación, el programa leerá otros 6 números 
correspondientes a un boleto con el que se participa en dicho sorteo. Finalizada la lectura, el 
programa deberá de indicar el número de aciertos del boleto cuyos números hemos 
introducido. Ejemplo: si la combinación ganadora es 3 6 4 8 9 23 el boleto 8 6 23 5 9 1 tiene 
2 aciertos. */
	
	private int [] ganador;
	private int [] jugado;
	
	public ejercicio_2 (int [] ganador, int [] jugado) {
		boolean correcto= true;
		if(this.ganador.length==6 && this.jugado.length==6) {
			for(int i=0; i<ganador.length; i++) {
				if(this.ganador[i]<1 || this.ganador[i]>49 || this.jugado[i]<1 || this.jugado[i]>49) {
					correcto=false;
				}
			}
		}
		
		if(correcto) {
			this.ganador=ganador;
			this.jugado=jugado;
		}
		
	} // Creamos el constructor por parametros con su respectivo filtro para rellenar las variables a comprobar

	public int[] getGanador() {
		return ganador;
	}

	public void setGanador(int[] ganador) {
		boolean correcto= true;
		for(int i=0; i<ganador.length; i++) {
			if(this.ganador[i]<1 || this.ganador[i]>49) {
				correcto=false;
			}
		}
		if(correcto) {
			this.ganador=ganador;
		}
		
	} // ponemos el respectivo get y set con su filtro 

	public int[] getJugado() {
		return jugado;
	}

	public void setJugado(int[] jugado) {
		boolean correcto= true;
		for(int i=0; i<ganador.length; i++) {
			if(this.jugado[i]<1 || this.jugado[i]>49) {
				correcto=false;
			}
		}
		if(correcto) {
			this.jugado=jugado;
		}
	} // ponemos el respectivo get y set con su filtro 
	
	public int Comprobador() {
		int resultado=0;
		
		for(int i=0; i<ganador.length; i++) {
			if(this.ganador[i]==this.jugado[i]) {
				resultado++;
			}
		}
		
		return resultado;
	} // aqui hacemos el metodo comprobar donde cogen numero por numero y se comparan, imprimiendo el numero de resultados

}
