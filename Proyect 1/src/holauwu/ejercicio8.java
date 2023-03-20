package holauwu;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*El usuario mete un número de 9 dígitos y una posición de este, tiene que imprimirse
		 * por pantalla el digito de esa posicion
		 */
		
		int numb1, posicion;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número de 9 dígitos:");
		
		numb1 = sc.nextInt();
		
		System.out.println("Introduzca un número:");
		
		posicion = sc.nextInt();
		
		int exponente = 9 - posicion;
		int posicion1 = (int) (numb1 / Math.pow(10, exponente));
		int resultado = posicion1%10;
		
		System.out.println("El numero es: " + resultado);
		
		
		
		
		
	}

}
