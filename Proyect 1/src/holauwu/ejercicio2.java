package holauwu;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Un programa que lea por teclado 3 enteros que representen un instante de tiempo expresado 
		 * en horas, minutos y segundos he imprima en la pantalla cuantos segundos en total
		 */
		final int conversorH = (3600);
		final int conversorM = (60);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Estimado usuario introduzca la hora" );
		int hora = sc.nextInt();
		System.out.println("Introduzca los minutos");
		int minutos = sc.nextInt();
		System.out.println("Introduzca los segundos");
		int segundos = sc.nextInt();
		
		int resultado = (hora*conversorH) + (minutos*conversorM) + segundos;
		
		System.out.println("El total serían = " + resultado + "seg");

	}

}
