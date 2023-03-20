package holauwu;

import java.util.Scanner;

public class ejercicio7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Realiza un programa en Java que reciba por teclado un número de tres cifras y
		 * un número de una cifra. El programa devolverá true en caso de que el número de un dígito
		 * aparezca dentro del número de tres dígitos
		 */
		int numb1, numb2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número de tres cifras");
		
		numb1 = sc.nextInt();
		
		System.out.println("Introduzca un número de un dígito");
		
		numb2 = sc.nextInt();
		
		int r1 = numb1/10;
		int r2 = numb1%10;
		
		int r3 = r1%10;
		int r4 = r1/10;
		
		boolean resultado1 = r2==numb2 || r3==numb2 || r4==numb2;
		
		System.out.println(resultado1);
		
		
		
	}	

}
