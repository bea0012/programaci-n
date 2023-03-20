package arraylists;

import java.util.ArrayList;

public class ArrayPokemon {
	
	private ArrayList<Pokemon> pokemones = new ArrayList<Pokemon>();
	
	public ArrayPokemon() {
		this.pokemones=new ArrayList<Pokemon>();
	}
	
	public void añadirPokemon(Pokemon poke) {
		this.pokemones.add(poke);
	}

	public ArrayList<Pokemon> getPokemones() {
		return pokemones;
	}

	public void setPokemones(ArrayList<Pokemon> pokemones) {
		this.pokemones = pokemones;
	}
	 public String consultar(int index) {
		 return this.pokemones.get(index).toString();
	 }
	 public int consultarID(int index) {
		 return this.pokemones.get(index).getNumPokedex();
	 }
	 public String consultarTipo(int index) {
		 return this.pokemones.get(index).getTipo();
	 }
	 public String consultarDescripción(int index) {
		 return this.pokemones.get(index).getDescripcion();
	 }
	 
	 public String consultar(Pokemon poke) {
		 int index = this.pokemones.indexOf(poke);
		 return this.pokemones.get(index).toString();
	 }
	 public int consultarID(Pokemon poke) {
		 int index = this.pokemones.indexOf(poke);
		 return this.pokemones.get(index).getNumPokedex();
	 }
	 public String consultarTipo(Pokemon poke) {
		 int index = this.pokemones.indexOf(poke);
		 return this.pokemones.get(index).getTipo();
	 }
	 public String consultarDescripción(Pokemon poke) {
		 int index = this.pokemones.indexOf(poke);
		 return this.pokemones.get(index).getDescripcion();
	 }
	 public ArrayList<Pokemon> consultar() {
		 return this.pokemones;
	 }
	 public ArrayList<Integer> consultarID() {
		 ArrayList<Integer> ids = new ArrayList<Integer>();
		 for(int i=0; i<this.pokemones.size(); i++) {
			 ids.add(this.pokemones.get(i).getNumPokedex());
		 }
		 return ids;
	 }
	 public ArrayList<String> consultarTipo() {
		 ArrayList<String> tipo = new ArrayList<String>();
		 for(int i=0; i<this.pokemones.size(); i++) {
			 tipo.add(this.pokemones.get(i).getTipo());
		 }
		 return tipo;
	 }
	 public ArrayList<String> consultarDescripción() {
		 ArrayList<String> descripcion = new ArrayList<String>();
		 for(int i=0; i<this.pokemones.size(); i++) {
			 descripcion.add(this.pokemones.get(i).getTipo());
		 }
		 return descripcion;
	 }

	@Override
	public String toString() {
		return  this.pokemones.toString();
	}
	 
	 
	 
}
