package Ejercicios;

import java.util.Scanner;

public class ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Ejercicio 3 
	      Escriba un programa que lea desde teclado un vector de caracteres (uno a uno) de 
	      tamaño fijado por una constante simbólica. Una vez leído, el programa debe indicar si dicho 
	      vector forma un palíndromo. Un palíndromo es una palabra, frase o número que se lee igual 
	      de derecha a izquierda que de izquierda a derecha, por ejemplo: “reconocer”. */
			
			Scanner sc = new Scanner(System.in);
			Scanner palabras = new Scanner(System.in);
			boolean palindromo=true;
			
			System.out.println("Introduzca el tamaño de su array"); 
			int numb = sc.nextInt(); // pedimos y nos introducen la variable
			
			String array[] = new String [numb]; //creamos el array
			
			for (int i = 0; i <= numb - 1 ; i++) {
				System.out.println("Introduzca la palabra deseada" + (i) + " : " );
				array [i] = palabras.next();
			}
			//aquí ingresaran la palabra del usuario
		
			System.out.println("Esta es la palabra que usted a  introducida : ");
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i] + " ");
			} //imprimos la palabra
			
			String array1[] = new String [numb];
			int cont=0;
			
			
			for (int i = array.length - 1; i >= 0 ; i--) {
				array1 [cont] = array[i];
				cont++;
			}
			System.out.println("Esta es la palabra pero al revés : ");// Le damos la vuelta a la palabra y la imprimimos
			for (int i = 0; i < array1.length; i++) {
				System.out.println(array1[i]);
			}
			
			for (int i = 0; i < numb; i++) {
				if(!array1[i].equals(array[i])) {
					palindromo=false;
					
				}
				}
			//Aquí vemos si la palabra es palindroma o no
			
			if(palindromo) {
				System.out.println("Sí es un palindromo"); 
			}else {
				System.out.println("No es un palindromo");
			} // y lo imprimimos

	}

}
