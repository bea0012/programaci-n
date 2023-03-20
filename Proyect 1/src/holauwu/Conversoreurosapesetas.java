package holauwu;

import java.util.Scanner;

public class Conversoreurosapesetas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pesetas = 166.386;
		double euros;
		
		System.out.println("Introduzca la cantidad de euros, con comas porfi");
		
		Scanner sc = new Scanner(System.in);
		euros = sc.nextDouble();
		
		System.out.println(euros * pesetas);
		
		
		
		
		
	}

}
