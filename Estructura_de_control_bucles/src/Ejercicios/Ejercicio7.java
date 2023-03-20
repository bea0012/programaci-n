package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escriba un programa que devuelva si un número introducido por teclado es primo.
           (Un número primo es aquel que solo es divisible por 1 y por él mismo. Piense bien las
           condiciones).
		 */
		
        Scanner sc = new Scanner(System.in);
		
		int numb1, contador = 0; /*nombro las variables, el numero introducido y el contador de restos 0 osea de divisores*/
		
		System.out.println("Introduzca un número:");
		numb1 = sc.nextInt(); /*pido el numero al usuario*/
		
		for (int i=2 ; i<=numb1; i++ ) { /*en el for calculo los divisores del numero que me dio a partir del 2 y acumulo en un contador los restos 0 de ese numero*/
			if((numb1 % i) == 0){
				contador++;
			}
			
		}
		if(contador==2) { /*en este if separo el si en el contador es 2, es primo y si no , no es primo*/
			System.out.println("El número es primo");
		}else {
			System.out.println("El número no es primo");
		}

	}

}
