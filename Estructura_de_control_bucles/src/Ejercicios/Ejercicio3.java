package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escriba un programa que devuelva la sumatoria de un valor leído por teclado
		 * (la sumatorio de N es la suma de todos los terminos desde 1.....N)
		 */
		
		Scanner sc = new Scanner(System.in);
		int N, i, aux = 0; /*N como la variable introducida por el usuario, I para construir el For y el Aux que utilizaré como un contador dandole un valor inicial de 0*/
		
		System.out.println("Introduzca un número");
		N = sc.nextInt(); /*Le pido al usuario la variable*/
		
		for(i=0 ; i<=N ; i++) { /*introduzco los parametros al For, la i como 0, desde donde quiero que empiece, que vaya subiemndo de uno en uno por cada vuelta y el tope sería la N para detener el bucle*/
			aux+= i; /*Voy sumando la i al aux con cada vuelta*/
			
		}
		System.out.println(aux); /*imprimo la suma de todas las variables*/
		

	}

}
