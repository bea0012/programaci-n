package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Implemente un programa que pida números hasta que se introduzca uno negativo.
		 * Mostrar entonces la media de los valores introducidos.
		 */
		
		Scanner sc = new Scanner(System.in);
		int numb1, sum = 0, cont = 0; /*nombro las variable numb1(numero introducido por el usuario) Sum y Cont como dos contadores, uno para sumar los valores que me de el usuario y otro para contar el numero de numeros introducidos*/
		double media; /*nombro como un double a media porque va a ser el resultado de la media de todos los numeros introducidos*/
		
		do {
			System.out.println("Dame un numero, negativo para parar"); /*Le indicó que hacer para parar el bucle y que así introduzca solo las variables que desee*/
			numb1 = sc.nextInt(); /*Pido las variables al usuario*/
			if(numb1>=0) { /*utilizo el if para que cuando introduzca el número de salida, negativo, no me lo incluya en la suma del resto de variables*/
				sum+=numb1; /*sumo las variables introducidas con cada bucle en el contador Sum*/
				cont++; /*aqui guardo el número de variables que introduce el usuario*/
			}	
			
		}while(numb1>=0); /* uso un do while porque no se cuantas vueltas voy a dar y la condición para salir es introducir un número negativo lo cual se lo indico al usuario*/
		media =(double)sum/cont; /*calculo la media que es la suma de las variables entre el numero de variables y utilizo un casting double porque estoy operandpo con enteros en una variable que quiero que sea double*/
			System.out.println("Tu media es " + media); /*Imprimo el resultado de la media*/
	}

}
