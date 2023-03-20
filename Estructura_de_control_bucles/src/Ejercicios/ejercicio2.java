package Ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escriba un programa similar al anterior que muestre los numeros en orden inverso
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int N, i; /*N como la variable que introduce el usuario y i la variable necesaria para construir el For*/
		
		System.out.println("Introduzca un número");
		N = sc.nextInt(); /*Pregunto al usuario desde que número quiere la cuenta*/
		
		for(i=N ; i>=0; i--) { /*Para que sea una cuenta en reversa le doy el valor de N a la i y voy restando de uno en uno por cada vuelta hasta llegar a 0*/
			System.out.println(i); /*Imprimo cada numero con cadab vuelta para listar los números*/
		}

	}

}
