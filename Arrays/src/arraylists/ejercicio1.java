package arraylists;

import java.util.ArrayList;

public class ejercicio1 {
	
	private ArrayList<Integer> objetos;

	public ejercicio1() {
		this.objetos = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getObjetos() {
		return objetos;
	}

	public void setObjetos(ArrayList<Integer> objetos) {
		this.objetos = objetos;
	}
	
	public void añadirTiempo(int t) {
		this.objetos.add(t);
	}

	@Override
	public String toString() {
		return this.objetos.toString();
	}
	
	public ArrayList<Integer> diferencia(){
		ArrayList<Integer> aux= new ArrayList<Integer>();
		for(int i=0; i<this.objetos.size();i++) {
			aux.add(this.objetos.get(i) - this.objetos.get(0));
		}
		return aux;
	}
	
	
	
	

}
