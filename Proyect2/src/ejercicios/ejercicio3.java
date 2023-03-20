package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* vamos a recibir un double (la hora), si es entre las 0 - 6: "Lolete time", 6 - 15 "A dormir como un campeon"
		 * 15: "Monster y pa clase" 15 - 21:30 "Isaac porfa para me duele" 21:30 - 24 "Autorecreación y autocuidado"
		 */
		
		double hora;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la hora");
		hora = sc.nextDouble();
		if(hora<0 || hora>=24) {
			System.out.println("Error");
		}else if(hora>=0 && hora<=6) {
			System.out.println("Lolete time");
		}else if(hora>6 && hora<15) {
			System.out.println("A dormir como un campeón");
		}else if(hora==15) {
			System.out.println("Monster y pa clase");
		}else if(hora>15 && hora<=21.5) {
			System.out.println("Isaac para ya, por favor, me duele");
		}else if(hora>21.5 && hora<24) {
			System.out.println("Autorecreación y autocuidado");
		}
		
		

	}

}
