package arraylists;

import java.util.ArrayList;

public class mainsito {

	public static void main(String[] args) {
		
		ArrayList<String> arraisito=new ArrayList<String>();
		ArrayList<Integer> arraiInt=new ArrayList<Integer>();
		ArrayList<String> arraisito2=new ArrayList <String>();
		
		arraisito.add("Hola");
		arraisito.add("Adios");
		arraisito.add("Uwu"); /*añadir datos a tu arraylist*/
		
		arraisito.remove(1); /*borra una posición o un contenido especifico ejem:"Hola"(solo de uno)*/
		
		arraisito.removeIf(n->(n=="Hola")); 
		arraisito.removeIf(palabra->(palabra.charAt(0)=='A'));/*borra varios elementos repetidos o que tengan una condicion igual*/
		
		arraisito.sort(null); /*ordena alfabeticamente */
		
		arraisito.clear(); /*borra todo el contenido*/
		
		arraisito.set(1, "Modificado"); /*modifica algo de una posicion*/
		
		System.out.println(arraisito.contains("Hola")); /*te responde true o false si contiene lo que pongas*/
		
		System.out.println(arraisito.indexOf("Hola")); /*imprime todos los parametros que haya con esa condición*/
		
		arraisito2.addAll(arraisito2);
		
		for(int i=0; i<arraisito.size(); i++) {
			System.out.println(arraisito.get(i)); /*recorrer he imprimir el arraylist*/
		}
		

	}

}
