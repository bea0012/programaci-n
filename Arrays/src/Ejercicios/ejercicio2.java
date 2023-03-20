package Ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Implementar un  método que reciba un array y lo devuelva en orden inverso*/
		
		int tamaño, num=0;
		
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("De cuanto quiere su array");
			tamaño=sc.nextInt();
		}while(tamaño<0);
		
		int[]arraycito = new int[tamaño];
		
		for(int i=0; i<arraycito.length; i++) {
			System.out.println("Introduzca un digito");
			arraycito[i]=sc.nextInt();
		}
		
		for(int i=0; i<arraycito.length; i++) {
			System.out.println(arraycito[i]);
		}
		
		for(int i=arraycito.length-1; i>=0; i--) {
			System.out.println(arraycito[i]);
		}
		

	}

}
