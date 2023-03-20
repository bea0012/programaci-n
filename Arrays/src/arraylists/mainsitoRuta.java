package arraylists;

public class mainsitoRuta {

	public static void main(String[] args) {
		
		
		Pokemon pokemon1 = new Pokemon(1, "Fuego", "Lanza aliento fuego");
		Pokemon pokemon2 = new Pokemon(2, "Agua", "Respira bajo agua");
		Pokemon pokemon3 = new Pokemon(3, "Planta", "Florece flores rosas en primavera");
		Pokemon pokemon4 = new Pokemon(4, "Roca", "Duro como una piedra");
		
		ArrayPokemon pokemons= new ArrayPokemon();
		
		pokemons.añadirPokemon(pokemon1);
		pokemons.añadirPokemon(pokemon2);
		pokemons.añadirPokemon(pokemon3);
		pokemons.añadirPokemon(pokemon4);
		
		Ruta ruta1 = new Ruta();
		
		ruta1.añadirRuta(pokemons);
		
		System.out.println(ruta1.toString());
	}

}
