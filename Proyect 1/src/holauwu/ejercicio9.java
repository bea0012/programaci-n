package holauwu;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* El usuario te da un numero de 9 digitos y tu tienes que darle la vuelta y 
		 * imprimirlo en pantalla
		 */
		
		int numb1, numb2, numb3, x1, y1, z1, x2, y2, z2, resultado;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número de 3 digitos");
		
		numb1 = sc.nextInt();
		
		numb2 = numb1/10;
		numb3 = numb2/10;
		
		x1= numb1%10;
		y1 = numb2%10;
		z1 = numb3%10;
		
		x2 = (int)(x1*Math.pow(10, 2));
		y2 = (int)(y1*Math.pow(10, 1));
		z2 = (int)(z1*Math.pow(10, 0));
		
		resultado = (x2 + y2 + z2);
		
		System.out.println("Aquí tiene su número del reves: " + resultado);
		
		

	}

}
