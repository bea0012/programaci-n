package practica;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Implemente un programa en Java que acepte dos números enteros por teclado, representando el primero un número de euros,
		 * y el otro el tipo de billete a ejecutar. El programa debe mostrar por pantalla el número de billetes de ese tipo que deberá utilizar
		 * y cuanto dinero le faltaría por pagar.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int nBillete, nEuros, rEuros, rBillete; //he nombrado todas las variables con billete y euros solo cambiando la n del numero introducido y la r de resultado
		
		System.out.println("Introduzca el tipo de billete que tiene");
		nBillete = sc.nextInt();
		System.out.println("Introduzca la cantidad a pagar");
		nEuros = sc.nextInt(); //en estas 4 lineas le pido al usuario las variables de manera que me entienda y este lo introducen
		
		rBillete =nEuros/nBillete; //divido los euros entre el numero del billete para saber cuantos billetes hacen falta de esa cantidad
		rEuros = nEuros%nBillete; //busco el resto con el % para saber el número de los euros restantes
		
		
		System.out.println("Debe usar " + rBillete + " billetes y faltarian " + rEuros + " euros"); //imprimo el resultadop por pantalla

	}

}
