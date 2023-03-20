package arraylists;

import java.util.ArrayList;

public class ejercicio2 {
	private ArrayList<Integer> boleto;

	public ejercicio2() {
		this.boleto = new ArrayList <Integer>();
	}

	public ArrayList<Integer> getBoleto() {
		return boleto;
	}

	public void setBoleto(ArrayList<Integer> boleto) {
		this.boleto = boleto;
	}
	
	public void añadirNumero(int numero) {
		this.boleto.add(numero);
	}

	@Override
	public String toString() {
		return this.boleto.toString();
	}
	
	public int comparar(ejercicio2 boleto2) {
		int contador=0;
		for(int i=0; i<this.boleto.size(); i++) {
			if(this.boleto.get(i).equals(boleto2.getBoleto().get(i))) {
				contador++;
			}
		}
		return contador;
	}
	
	
}
