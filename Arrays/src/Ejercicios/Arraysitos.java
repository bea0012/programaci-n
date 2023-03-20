package Ejercicios;

public class Arraysitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arraisito = {1, 4, 7, 2}; //*como poner un array, rellenando posiciones*//
		int [] arraisito2= new int [6]; //*poner un array nuevo vacio con 6 posiciones*//
		
		
		for (int i=0; i<arraisito.length; i++) { //*como imprimir un array siempre con for*//
			System.out.println(arraisito[i]);	
		}
		
		for (int i=0; i<arraisito.length; i++) { //*como darle valor, siempre con for*//
			arraisito[i]=i;	
		}

	}

}
