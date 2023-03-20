package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* el usuario introduce un dia, mes y año y quiero que me digais el dia siguiente
		 * 
		 */
		int año,mes,dia;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el día");
		dia = sc.nextInt();
		System.out.println("Introduzca el mes");
		mes = sc.nextInt();
		System.out.println("Introduzca el año");
		año = sc.nextInt();
		
		if(dia<1 || dia>31) {
			System.out.println("Tus muertos");
		}else {
			
		}
		
		if (dia<28) {
			dia++; // el ++ incrementa, dia = dia + 1;
		}else if(dia==28) {
			if(mes==2 && año%4!=0) {
				dia=1;
				mes++;
			} else {
				dia++;
			}
		}else if(dia==29) {
			if(mes==2 && año%4==0) {
				dia = 1;
				mes++;
			}else {
				dia++;
			}
		}else if(dia==30) {
			if(mes==4 || mes==6 || mes==9 || mes==11) {
				dia=1;
				mes++;
			}else{
				dia++;
			}
		}else if(dia==31) {
			if(mes==12) {
				dia=1;
				
			}
		}
		
	}
