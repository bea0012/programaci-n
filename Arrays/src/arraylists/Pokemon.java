package arraylists;

public class Pokemon {
	
	/*Cree un programa que te deje consultar la información de un Pokemon. La
	información de un Pokemon consistirá en la siguiente: Número en la pokédex, tipo
	del pokémon y descripción del pokémon. El programa debe permitir consultar la
	información de 5 pokemongos a vuestra elección(tanto la información completa
	como una en específico). Utilice únicamente ArrayList unidimensional.*/
	
	private int numPokedex;
	private String tipo;
	private String descripcion;
	
	public Pokemon(int numPokedex, String tipo, String descripcion) {
		super();
		this.numPokedex = numPokedex;
		this.tipo = tipo;
		this.descripcion = descripcion;
	}
	public int getNumPokedex() {
		return numPokedex;
	}
	public void setNumPokedex(int numPokedex) {
		this.numPokedex = numPokedex;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Informacion_pokemon [numPokedex=" + numPokedex + ", tipo=" + tipo + ", descripcion=" + descripcion
				+ "]";
	}
	
	

}
