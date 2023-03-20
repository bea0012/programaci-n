package ejercicios;

import java.util.Scanner;

import Ejercicios.TriangulosRectangulos;

public class probar_triangulo {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		TriangulosRectangulos triangulo =new TriangulosRectangulos(4,3,5);
		
		System.out.println(triangulo.area());
		System.out.println(triangulo.perimetro());
		

	}

}
