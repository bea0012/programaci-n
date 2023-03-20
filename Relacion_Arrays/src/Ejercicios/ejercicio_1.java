package Ejercicios;

public class ejercicio_1 {
	
	/*En un experimento de física se lanzan a la vez desde una determinada altura 5 objetos 
de diferente masa y superficie de rozamiento. Escriba un programa que lea el tiempo en 
segundos en que se produce la llegada al suelo de cada objeto en el orden en el que van 
cayendo. Una vez leídos los 5 números, el programa deberá de imprimir por pantalla la lista 
de tiempos de llegada de los objetos con respecto al primero. Por ejemplo, si los tiempos son 
5, 6, 8, 11 y 15, el programa deberá de devolver la lista de diferencias de tiempos siguiente: 
0, 1, 3, 6, 10. */
	
	private int [] tiempo;
	
	public ejercicio_1(int [] tiempo) {
		boolean correcto=true;
		for(int i=0; i<tiempo.length; i++) {
			if(this.tiempo[i]<0 || this.tiempo[i]>60) {
				correcto=false;
			}
		}
		if(correcto) {
			this.tiempo=tiempo;
		}

	} // ponemos filtro para cuando se inicialice la variable desde fuera de la clase

	public int[] getTiempo() {
		return tiempo;
	} // get del tiempo

	public void setTiempo(int[] tiempo) {
		boolean correcto=true;
		for(int i=0; i<tiempo.length; i++) {
			if(this.tiempo[i]<0 || this.tiempo[i]>60) {
				correcto=false;
			}
		}
		if(correcto) {
			this.tiempo=tiempo;
		}
	} // set del tiempo con su filtro correspondiente
	
	public int [] tiempoLlegada() {
		int [] resultado = new int [this.tiempo.length];
		
		for(int i=0; i<tiempo.length; i++) {
			resultado[i]=this.tiempo[i]-this.tiempo[0];
		}
		
		return resultado;
	} // calculo los tiempos de llegada con el for que necesita el array
	
	public String ToString() {
		String arra="";
		for(int i=0; i<tiempo.length; i++) {
			arra="" + this.tiempo[i];
		}
		
		return arra;
		
	}

}


