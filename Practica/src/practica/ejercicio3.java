package practica;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Implementa un programa en Java que reciba dos parámetros de tipo entero y devuelva su división en formato byte 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int numb1, numb2, resultado; //nombro las variables que voy a utilizar, los dos numeros que introduce el usuario y el resultado 
		
		System.out.println("Introduzca el primer número entero");
		numb1 = sc.nextInt();
		System.out.println("Introduzca el segundo número entero");
		numb2 = sc.nextInt(); // le pido de manera clara las variables al usuario y este las introducen
		
		resultado = (byte) (numb1/numb2); //hago la operación de dividir ambos números y como me pide el resultado en bytes hago un casting para cambiar el formato del resultado de un entero, int, a byte
		
		System.out.println("El valor de la división en formato byte es: " + resultado); //imprimo por pantalla el resultado

		
	}

}
