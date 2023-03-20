package arraylists;

public class mainsitoPokemon {

	public static void main(String[] args) {
		
		Pokemon pokemon1 = new Pokemon(1, "Fuego", "Lanza aliento fuego");
		Pokemon pokemon2 = new Pokemon(2, "Agua", "Respira bajo agua");
		Pokemon pokemon3 = new Pokemon(3, "Planta", "Florece flores rosas en primavera");
		Pokemon pokemon4 = new Pokemon(4, "Roca", "Duro como una piedra");
		Pokemon pokemon5 = new Pokemon(5, "Rayo", "Tira rayos de colores");
		
		ArrayPokemon arra= new ArrayPokemon();
		
		arra.añadirPokemon(pokemon1);
		arra.añadirPokemon(pokemon2);
		arra.añadirPokemon(pokemon3);
		arra.añadirPokemon(pokemon4);
		arra.añadirPokemon(pokemon5);
		
		System.out.println(arra.consultar());
		

	}

}
