package holauwu;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Escriba un programa que lea desde teclado su fecha de nacimiento y la fecha del día de hoy
		 * e imprima en la plantalla el número de días que lleva viviendo.
		 * Una fecha puede venir representada por tres enteros correspondientes al año, mes y dia.
		 * Considere que todos los años tienes 365 días y que todos los meses del año tienen 30 días
		 */
		
		final int diasAño = (365);
		final int diasMes = (30);
		final int diaHoy = (28);
		final int mesHoy = (9);
		final int añoHoy = (2022);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su día de nacimiento");
		int diaNacimiento = sc.nextInt();
				
		System.out.println("Introduzca su mes de nacimiento");
		int mesNacimiento = sc.nextInt();
		
		System.out.println("Introduzca su año de nacimiento");
		int añoNacimiento = sc.nextInt();
		
		int resultado = ((añoHoy - añoNacimiento)*diasAño + (mesHoy - mesNacimiento)*diasMes + (diaHoy - diaNacimiento));
		
		System.out.println("Lleva viviento " + resultado + " días" );
		
		/* Escriba un programa que imprima en la pantalla la edad de una persona cuyo año de nacimiento
		 * es leído por el teclado. Defina el año como una constante
		 */
		
		int edad = (resultado/añoHoy);
		
		System.out.println("Tienes" + edad+ " años");
		
		
		
	}

}
