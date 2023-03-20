package ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Realizar un programa que pida un número al usuario repetidamente hasta que el número introducido
		 * este entre 1 y 10.
		 */
		
		Scanner sc = new Scanner(System.in);
		int numb1;
		do {
			System.out.println("Introduzca un número");
			numb1 = sc.nextInt();
		}while(numb1>10 || numb1<0);
		System.out.println("Saliste");

	}

}
