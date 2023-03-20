package arraylists;

import java.util.ArrayList;

public class Ruta {
	
	private ArrayList<ArrayPokemon> ruta = new ArrayList<ArrayPokemon>();

	public Ruta() {
		this.ruta = new ArrayList<ArrayPokemon>();
	}

	public ArrayList<ArrayPokemon> getRuta() {
		return ruta;
	}

	public void setRuta(ArrayList<ArrayPokemon> ruta) {
		this.ruta = ruta;
	}
	
	public void añadirRuta(ArrayPokemon rutas) {
		this.ruta.add(rutas);
	}

	@Override
	public String toString() {
		return this.ruta.toString();
	}
	
	
	
	
	
}
