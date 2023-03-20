package practica;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Implemente un programa en Java que resuelva la siguiente ecuación para sacar la x de la ecuación adjunta
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double z, y, x; // nombro las variables con double por si el usuario introduce un número con decimales
		final double C = 356.18; //nombro la variable como un final porque es una variable que no quiero que cambie
		
		System.out.println("Introduzca la variable y");
		y = sc.nextDouble();
		System.out.println("Introduzca la variable z");
		z = sc.nextDouble(); // en estas 4 lineas le pido al usuario de manera clara las variables y este las introducen
		
		x = C*(Math.pow(z, 2)*Math.pow(y, 2)/(z+C)); //escribo la operación matemática de forma ordenada con sus respectivos parentesis para priorizar las operaciones necesarias
		
		System.out.println("El valor de x es: " + x); //imprimo por pantalla el resultado

	}

}
