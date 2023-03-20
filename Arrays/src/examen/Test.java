package examen;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CantantesFamosos singer1 = new CantantesFamosos("Lady Gaga", 1500000, "Pop");
		CantantesFamosos singer2 = new CantantesFamosos("Lewis Capaldi", 600000, "Pop");
		ListaCantantesFamosos artistas = new ListaCantantesFamosos();
		
		artistas.añadirCantante(singer1);
		artistas.añadirCantante(singer2);
		
		System.out.println(artistas.consultarPorGenero("Pop"));
		System.out.println(artistas.toString());
		
		System.out.println(artistas.consultarPorVentas());
		artistas.consultarPorVentas();
		
		artistas.borrarCantante(singer2);
		System.out.println(artistas.toString());
		
		
	}

}
