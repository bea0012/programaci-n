package ejercicios;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Realizar un programa que devuelva si un número introducido por teclado
		 * es primo o no
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int numb1, contador = 0;
		
		System.out.println("Introduzca un número:");
		numb1 = sc.nextInt();
		
		for (int i=2 ; i<=numb1; i++ ) {
			if((numb1 % i) == 0){
				contador++;
			}
			
		}
		if(contador <=2) {
			System.out.println("El número es primo");
		}else {
			System.out.println("El número no es primo");
		}

	}

}
