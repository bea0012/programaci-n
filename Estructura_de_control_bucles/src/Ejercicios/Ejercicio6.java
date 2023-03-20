package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Implemente un programa que calcule los N primeros términos de la serie de
          Fibonacci. El número de términos se leerá por teclado.
          La sucesión de Fibonacci comienza con los números 0 y 1, y a partir de estos, cada
          término es la suma de los dos anteriores:
          0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377...
		 */
		
		Scanner sc = new Scanner(System.in);
		int N, aux1, aux2, i; /*nombro las variables necesarias, dos auxiliares, el numero que me da el usuario y la i para el for*/
		aux1=0; /*el primer numero de la serie de fibonacci*/
		aux2=1; /*el segundo numero de la serie de fibonacci*/
		
		System.out.println("Introduzca un número");
		N = sc.nextInt(); /*le pido el numero al usuario*/
		
		System.out.println(aux1 + " "); /*imprimo el primer numero de fibonacci*/
		for(i=1 ; i<=N; i++) {
		System.out.println(aux2 + " "); /*aqui imprimo el calculo de los siguientes numeros de fibonacci*/
		aux2 = aux1 + aux2; /*aqui uso la formula para calcular los numeros de fibonacci*/
		aux1 = aux2 - aux1;		
		}
		
	}

}
