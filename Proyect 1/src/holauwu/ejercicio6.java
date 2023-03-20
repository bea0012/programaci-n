package holauwu;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Recibe por teclado un numero de segundos y te dice cuantas horas, minutos y segundos son esos
		 * 
		 */
		final int min=60;
		int hora, minuto, segundos, seg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el numero de segundos");
		
		seg = sc.nextInt();
		
		minuto = seg/min;
		segundos = seg%min;
		
		hora = minuto/min;
		minuto = minuto%min;
		
		System.out.println("Resultado " + hora + " horas " + minuto + " minutos " + segundos + "segundos");
		
		
		
		

	}

}
