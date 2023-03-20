package Ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//*Un programa que introduzca 10 notas por teclado y luego imprime esas notas y la media*//
		double notita, media=0, suma=0;
		Scanner sc = new Scanner(System.in);
		double[]notas = new double[10];
		
		for(int i=0; i<notas.length; i++) {
			do {
				System.out.println("Introduzca las notas");
				notita=sc.nextDouble();
			}while(notita<0);
			notas[i]= notita;
			
		}
		
		for(int i=0; i<notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		for(int i=0; i<notas.length; i++) {
			suma+= notas[i];
		}
		
		media=suma/notas.length;
		System.out.println(media);
		
		
		
		

	}

}
