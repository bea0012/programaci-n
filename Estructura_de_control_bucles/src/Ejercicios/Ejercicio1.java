package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escriba un programa que muestre los números de 0 a N, siendo N un valor leído por teclado
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int N, i;
		
		System.out.println("Introduzca un número");
		N = sc.nextInt(); /* Pido al usuario hasta que numero quiere que le muestre*/
		
		for(i=0 ; i<=N ; i++) { /*Utilizo un for para hacer un bucle y que me imprima todos los números del 0 hasta el número que el usuario deseaba. Doy valor 0 a la I, porque es de donde quiero que empiece la cuenta y el maximo el número del usuario*/
			System.out.println(i); /*Imprimo todas las vueltas para listar los numeros*/
		}
		
		
		

	}

}
