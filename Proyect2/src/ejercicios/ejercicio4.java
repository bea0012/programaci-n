package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Escriba un programa que pida al usuario una hora determinada, que denominaremos h1,
		 * (pidiendo primero las horas expresadas en formatos de 0 a 24 horas, y a continuación
		 * los minutos). Posteriormente se pedirá al usuario otra hora, h2. El programa deberá 
		 * indicar si h1 es posterior o anterior a h2. En el caso de ser posterior se mostrará 
		 * por pantalla un mensaje y se indicará cuantas horas y minutos han pasado, en caso
		 * de ser anterior se mostrará un mensaje similar y se indicará las horas y minutos que faltan.
		 */
		int h1, min1, h2, min2, hAux,  h3 = 0, min3 = 0;
		String resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la hora");
		h1 = sc.nextInt();
		System.out.println("Introduzca los minutos");
		min1 = sc.nextInt();
		System.out.println("Introduzca otra hora");
		h2 = sc.nextInt();
		System.out.println("Introduzca los minutos");
		min2 = sc.nextInt();
		
		if(h1>h2 && min1<min2 && min1<=30) {
			hAux = h1-h2;
			h3 = hAux--;
			min3 = 60 - (min1 - min2);
			resultado = "Han pasado " + h3 + " horas y " + min3 + " minutos";
		}else if(h1>h2 && min1>min2){
					h3 = (h1-h2);
					min3 = (min1 - min2);
			resultado = "Han pasado " + h3 + " horas y " + min3 + " minutos";	
		}else if(h2<h1 && min1<min2){
			h3 = (h2 - h1);
			min3 = 60 - (min1 + min2);
			resultado = "Quedan " + h3 + " horas y " + min3 + " minutos";
				if(h2<h1 && min1>min2){
					h3 = (h2 - h1);
					min3 = min1 - min2;
			resultado = "Quedan " + h3 + " horas y " + min3 + " minutos";
				}else {
					h3 = 0;
					min3 = 60 - (min1 - min2);
			resultado = "Son iguales " + h3 + " horas y " + min3 + " minutos";
					if (min1>min2){
						h3 = 0;
						min3 = min1 - min2;
			resultado = "Son iguales " + h3 + " horas y " + min3 + " minutos";
					}
				}

		}
		
		System.out.println(resultado);
		

	}

}

