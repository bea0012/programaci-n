package arraylists;

import java.util.HashMap;

public class Pokedex {
	
	private HashMap <String, Pokemon> pokedex;

	public Pokedex() {
		this.pokedex = new HashMap<String, Pokemon>();
	}

	public HashMap<String, Pokemon> getPokedex() {
		return pokedex;
	}

	public void setPokedex(HashMap<String, Pokemon> pokedex) {
		this.pokedex = pokedex;
	}
	
	public void añadirPokemon(String name, Pokemon poke) {
		this.pokedex.put(name, poke);
	}
	
	public void iniciales() {
		this.pokedex.put("Bulbasur", new Pokemon(1, "Planta", "Este Pokémon nace con una semilla en el lomo, que brota con el paso del tiempo"));
		this.pokedex.put("Charmander", new Pokemon(4, "Fuego", "Prefiere las cosas calientes. Dicen que cuando llueve le sale vapor de la punta de la cola."));
		this.pokedex.put("Squirtle", new Pokemon(7, "Agua", "Cuando retrae su largo cuello en el caparazón, dispara agua a una presión increíble."));
	}

	@Override
	public String toString() {
		return pokedex.toString();
	}
	
	
	
	

}
