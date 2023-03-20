package holauwu;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Resuelve una ecuación de segundo grado
		 */
		int A, B, C;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca la variable A");
		A = sc.nextInt();
		System.out.println("Introduzca la variable B");
		B = sc.nextInt();
		System.out.println("Introduzca la variable C");
		C = sc.nextInt();
		
		double resultado1= ((-B + (Math.sqrt((B*B) - (4*A*C)))) / (2*A));
		double resultado2= ((-B - (Math.sqrt((B*B) - (4*A*C)))) / (2*A));
		
		System.out.println("Solución 1: "+ resultado1 + "Solucion 2: " + resultado2);
		
		
	}

}
