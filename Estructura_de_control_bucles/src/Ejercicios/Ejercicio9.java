package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Implementa un juego para adivinar un número entre 1-9 con un máximo de tres
           intentos. El número puede ser generado aleatoriamente o pedirlo por teclado.
           Después se irán pidiendo números indicando “mayor” o “menor” según sea mayor o
           menor con respecto a N. El proceso termina cuando el usuario acierta el número o
           consume los tres intentos.
		 */
		
		Scanner sc = new Scanner(System.in);
		int num; /*nombro la variable que utilizara el usuario*/
		int var; /*la variable si quiere poner el usuario que numero adivinar*/
		int modo; /*mpara que elija el modo de juego*/
		int cont=0; /*necesito un contador para ponerlo como condicion del while y que me cuente los intentos que lleva el usuario*/
		
		System.out.println("Que modo de juego quiere utilizar: (1) aleatorio  o (2) a elegir"); /*Para que el usuario elija que modo de juego quiere, aleatorio o predeterminado*/
		modo = sc.nextInt(); /*Introduzce el modo*/
		
		if(modo==1) { /*uso un if según que modo elija, si 1 o 2*/
			int x = (int)(Math.random()*9+1); /*Utilizo el Math.random para que genere un número aleatorio, con casting para que sean numeros enteros y */
			System.out.println("Introduzca un número"); /*le pido el número al usuario*/
			do{ /*utilizo un  do while porque no se cuantas oportunidades necesitara el usuario pero si cuantas tiene, despues de tres oportunidades no deja introducir más*/
				num = sc.nextInt();
				cont++; /*me cuenta las oportunidades que lleva*/
				
				if(num<x) { /*utilizo otro if para que le conteste depende de si el numero tiene que ser mayor, menor o si a acertado*/
					System.out.println("Mayor");
				}else if(num<x){
					System.out.println("Menor");
				}else  {
					System.out.println("Acertaste");
				}
					
				}while(cont<3); /*la condición para que no le de más oportunidades*/
		}else {
			System.out.println("Introduzca el número a adivinar"); /*le pido al usuario el numero a adivinar*/
			var = sc.nextInt();
			
			System.out.println("Introduzca un número"); /*le pido el número al usuario*/
			
			do{ /*utilizo un do while porque no se cuantas oportunidades necesitara el usuario */
			num = sc.nextInt();
			cont++;
			
			if(num<var) {
				System.out.println("Mayor");
			}else if(num<var){
				System.out.println("Menor");
			}else  {
				System.out.println("Acertaste");
			}
				
			}while(cont<3); /*todo esto es lo mismo que en el otro modo de juego porque hace la misma función*/
				
			
		}
		}
		

}
