package ejercicios;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Realizar un programa que lea una serie de números y obtenga su media. Un número negativo
		 * indicará el fin de datos
		 */
		
		Scanner sc = new Scanner(System.in);
		int numb1, sum = 0, cont = 0;
		double media;
		
		do {
			System.out.println("Dame un numero, negativo para parar");
			numb1 = sc.nextInt();
			if(numb1>=0) {
				sum+=numb1;
				cont++;
			}	
			
		}while(numb1>=0);
		media =(double)sum/cont;
			System.out.println("Tu media es " + media);
	}

}
