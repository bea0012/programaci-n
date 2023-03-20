package Ejercicios;

import java.util.Scanner;

public class ejercicio_5 {
	
	/*Ejercicio 5 
Implemente un programa que inicialice una matriz de enteros de dimensiones máximas 
NxM, y muestre la moda, es decir, el elemento que más se repite. Para ello, tenga en cuenta 
que la matriz sólo podrá almacenar enteros del 1 al 10. */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];// hacemos un array que sea matriz
		int resultado=0;
		int contador=0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				matriz[i][j]=resultado;
				System.out.print("Introduzca elemento [" + i + "," + j + "]"); //Creamos dos fors para inicianilizar las variables del array
				matriz[i][j] = sc.nextInt();
			}
			System.out.println(matriz[i]);
		}
		
		for(int a=0;a<matriz.length;a++) {
			for(int g=0;g<matriz[a].length;g++) {
				
				if(matriz[a][g] == matriz[0][10]) {
					contador++;
					resultado = matriz[a][g];
				}
			} // hacemos otros dos for con contadores para poder contar el numero que se repite y cuantas veces
		}
		System.out.println("Se repite más el " + resultado + " y se repite un número de " + contador + "veces") ;
		} // lo imprimimos

}
