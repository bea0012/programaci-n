package holauwu;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Escriba un programa que intercambie el valor  de dos variables de tipo entero leídos
		 * por teclado. Imprimaen la pantalla los valores de las variables antes y después del
		 * intercambio.
		 */
		
		int var1, var2, varAux;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca var 1");
		var1 = sc.nextInt();
		System.out.println("Introduca var 2");
		var2 = sc.nextInt();
		
		System.out.println("Var 1 es: " + var1 + " Var 2 es: " + var2);
		
		varAux= (var1);
		var1=(var2);
		var2=(varAux);	
		
		System.out.println("Varv 1 es: " + var1 + " Var 2 es: " + var2);
	}

}
