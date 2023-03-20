package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ratas {

	public static void main(String[] args) {
		/*Escribir un programa que lea el peso de cada una de las 20 ratas de laboratorio del 
		departamento de Biología de la Nutrición. Calcular el peso medio de las ratas e imprimir un 
		informe parecido al siguiente: 
		hay 2 ratas que pesan 200 gramos 
		hay 1 rata que pesa 350 gramos 
		... 
		peso medio: 325.23 gramos */
		
		ArrayList<Integer> ratas=new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<20; i++) {
			ratas.add(sc.nextInt());
		}
		for(int i=0; i<20; i++) {
			
		}
		System.out.println("La media total es: " + media);
		
		ratas.sort(null);

	}

}
