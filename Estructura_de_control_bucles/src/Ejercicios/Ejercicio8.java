package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Implemente un programa que lea una frase por teclado. La salida debe mostrar la
          frase introducida, la frase en orden inverso y el número de vocales que contiene.
         (Puede usar el método length() de los String para obtener la longitud de la cadena).
		 */
		
		sc = new Scanner(System.in);
		
		String frase1="", inversa=""; /*nombro a la frase que me introduce el usuario y la inversa para cuando le de la vuelta*/
		int i, vocales=0, longitud=0; /*la i para el for, vocales como contador para contar cuantas vocales tiene la frase y el contador longitud para saber cuanto mide la frase y usarlo en el for */
		
		
		System.out.println("Introduce una frase");
		frase1 = sc.nextLine(); /*pido la frase al usuario*/
		
		longitud=frase1.length(); /*uso un .length para saber la longitud en numero de la frase*/
		
		for(i=longitud-1 ; i>=0 ; i--) { /*uso un for porque se cuantas vueltas necesito para darle la vuelta a la frase, osea la longitud de esta*/
			char letra = frase1.charAt(i); /*uso el char letra para ir separando letra por letras*/
			inversa+=frase1.charAt(i); /*voy sumando a inversa las letras por lo que guardo la frase al reves*/
		if (letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u' ) { /*utilizo un if con las condiciones de que letra sea una vocal y cuando lo es me lo suma al contador vocales*/
				vocales++;
			
		}	
		}
		
		System.out.println("La frase es: " + frase1); /*imprimo la frase original*/
		System.out.println("A la inversa sería: " + inversa); /*imprimo la frase en inversa*/
		System.out.println("Contiene: " + vocales + " vocales"); /*imprimo el numero de vocales que contiene la frase dada*/

	}

}
