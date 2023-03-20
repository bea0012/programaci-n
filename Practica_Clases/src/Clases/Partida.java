package Clases;

public class Partida {
	
	private Jugador Jugador1;
	private Jugador Jugador2;
	private Jugador Ganador;
	private int numRondas; /*nombramos las variables necesarias en esta clase*/
	
	public Partida(Jugador Jugador1, Jugador Jugador2, int numRondas) {
		this.Jugador1=Jugador1;
		this.Jugador2=Jugador2;
		this.Ganador=null;
		this.numRondas=numRondas;
	} /*creamos un constructor para que el usuario introduzca las variables que quiera y necesita, excepto la de ganador que le damos un valor nulo*/

	public Jugador getJugador1() {
		return Jugador1;
	}

	public void setJugador1(Jugador jugador1) {
		Jugador1 = jugador1;
	}

	public Jugador getJugador2() {
		return Jugador2;
	}

	public void setJugador2(Jugador jugador2) {
		Jugador2 = jugador2;
	}

	public Jugador getGanador() {
		return Ganador;
	}
	

	public void setGanador(Jugador ganador) {
		Ganador = this.Jugar(); /*aqui te he puesto que al cambiar no lo puede cambiar el usuario a gusto si no que es el resultado de el metodo jugar, 
		osea el resultado es literalmente el ganador de dicha ronda*/
	} 

	public int getNumRondas() {
		return numRondas;
	}

	public boolean setNumRondas(int numRondas) {
		boolean correcto=true;
		if(numRondas>0) {
			this.numRondas = numRondas;
		}else {
			correcto=false;
		}
		return correcto;
	} /*ponemos todos los setters y getters necesarios para poder pedir y cambiar los valores de la clase desde fuera de esta, 
	en este último ponemos un filtro para que no pueda introducir un número negativo de rondas*/
	
	public String ToString() {
		return "Jugador 1: " + this.Jugador1 + " Jugador 2: " + this.Jugador2 + " Número de rondas: " + this.numRondas;
	} /*Hcaemos un string que devuelva las variables de la clase, no el ganador porque si no se juego no hay ganador asignado*/
	
	public Jugador Jugar() {
		int suma1=0, suma2=0;
		for(int i=1; i>this.numRondas; i++) {
			suma1+=Jugador1.Tirar2();
			
			suma2+=Jugador2.Tirar2();	
		}
		if(suma1>suma2) {
			this.Ganador=this.Jugador1;
		}else{
			this.Ganador=this.Jugador2;
		}
		
		return this.Ganador;
	} /*el metodo de JUgar consiste en meter en un for con las características del numero de rondas para que de tantas vueltas como rondas haya, 
	dentro metemos dos variables que vayan sumando las tiradas de los jugadores llamando al metodo de Tirar2 de la clase jugador, después al salir del bucle hacemos un if para 
	ver quien a ganado comparando las sumatorias de cada uno y dandonde el valor del jugador a la variable de ganador, al final devolvemos quien es el ganador
	pd:por si acaso, no hice el empate porque me he tirado la ultima media hora comentando y has dicho que no hacia falta :P*/
	
	

}
