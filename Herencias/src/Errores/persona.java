package Errores;

import java.util.Scanner;

public class persona {
	
	private int edad;

	public persona(int edad) throws NotValidAgeEXception {
		if(edad<0) {
			throw new NotValidAgeException{
				
			}
		}else {
			this.edad = edad;
		}
	}

	/*public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
			if(n<3) {
				throw new Exception("cagaste puto");
			}
		}*/
	
	
	
	

}
