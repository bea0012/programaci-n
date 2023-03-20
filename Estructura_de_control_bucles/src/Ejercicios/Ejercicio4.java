package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escriba un programa que calcule el factorial de un número leído por teclado (!N = 1*2*3*4*...*(n-1) *n)
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int N, i, aux = 1; /*Nombro las variables N (variable introducida por el usuario), i (variable necesaria para el for) y el Aux con el valor 1 ya que necesitaré una variable de contador y necesito multiplicar así que el 1 no cambia el resultado*/
		
		System.out.println("Introduzca un número");
		N = sc.nextInt(); /*Pido la variable al usuario*/
		
		for(i=1 ; i<=N ; i++) { /*le doy los valores al for que necesito, el valor inicial de 1, que aumente a 1 por cada vuelta y el stop que es el numero introducido por el usuario*/
			aux*= i; /*voy guardando en el aux el valor de i y lo multiplico por el siguiente por cada vuelta*/
			
		}
		System.out.println(aux); /*Imprimo el resultado de multiplicar todos los números*/

	}

}
