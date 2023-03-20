package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* el usuario introduce por teclado un double que es una temperatura, si la temperatura es >38 "Me quemo, ay, ay ay",
		 * si la temperatura es <38 "tamo gucci" y si la temperatura es <7 "se me hiela la genitalia"
		 * 
		 */
		double temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la temperatura");
		temp = sc.nextDouble();
		
		if(temp>=38) {
			System.out.println("Me quemo, ay, ay, ay");
		}else if(temp<38 && temp>=7) {
			System.out.println("Tamo gucci");
		}else{
			System.out.println("Se me hiela la genitalia");
		}
	}

}
