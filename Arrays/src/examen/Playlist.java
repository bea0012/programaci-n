package examen;

import java.util.ArrayList;
import java.util.HashMap;

public class Playlist {
	
	private HashMap<String, ArrayList<String>> repositorio;

	public void añadirCantantesYCanciones(String singer, ArrayList<String> songs) {
		this.repositorio.put(singer, songs);
	}

	public void añadirCanciones(String singer, ArrayList<String> song) {
		this.repositorio.put(singer, song);
	}
	
	public ArrayList<String> consultarCanciones(String singer) {
		return this.repositorio.get(singer);
	}

}