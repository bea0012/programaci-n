package Ejercicios;

public class Mainsito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Torre torrecita = new Torre(true, ('A', 1));
		
		System.out.println(torrecita.mover('A',1 ));
		System.out.println(torrecita.getCasilla());
		
		/*Alfil alfilito = new Alfil('b', 1);
		
		System.out.println(alfilito.mover('d', 3));
		System.out.println(alfilito.getColumna());
		System.out.println(alfilito.getFila());*/
		
		
	}

}
