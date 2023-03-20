package examen;

import java.util.ArrayList;

public class ListaCantantesFamosos {
	
	private ArrayList<CantantesFamosos> listaCantantesFamosos = new ArrayList<CantantesFamosos>();
	
	public void añadirCantante(CantantesFamosos singer) {
		this.listaCantantesFamosos.add(singer);
	}
	
	public void borrarCantante(CantantesFamosos singer) {
		this.listaCantantesFamosos.remove(singer);
	}
	
	public ArrayList<String> consultarPorGenero(String genero) {
		 ArrayList<String> singer = new ArrayList<String>();
		 for(int i=0; i<this.listaCantantesFamosos.size(); i++) {
			 if(this.listaCantantesFamosos.get(i).getGeneroMusical()==genero)
			 singer.add(this.listaCantantesFamosos.get(i).getNombre());
		 }
		 return singer;
	 }

	public String toString() {
		return this.listaCantantesFamosos.toString();
	}
	
	public String consultarPorVentas() {
		String singer = "";
		int mayor=0;
		for (int i = 0; i < this.listaCantantesFamosos.size(); i++) {
			if(this.listaCantantesFamosos.get(i).getVentas()>mayor) {
				mayor=this.listaCantantesFamosos.get(i).getVentas();
				if(this.listaCantantesFamosos.get(i).getVentas()==mayor) {
					singer=this.listaCantantesFamosos.get(i).getNombre();
				 }
			}
		}
		return singer;
	}
	
	
	
	
	

}
