package arraylists;

import java.util.ArrayList;

public class DiscoDuro {
	
	private ArrayList<Archivo> archivos = new ArrayList<Archivo>();
	private int tamaño;

	public DiscoDuro(int tamaño) {
		super();
		this.archivos=new ArrayList <Archivo>();
		this.tamaño=tamaño;
	}

	public ArrayList<Archivo> getArchivos() {
		return archivos;
	}

	public void setArchivos(ArrayList<Archivo> archivos) {
		this.archivos = archivos;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	
	public int tamañoActual() {
		int tamañoActual =0;
		for(int i=0; i<this.archivos.size(); i++) {
			tamañoActual+=this.archivos.get(i).getTamaño();
		}
		return tamañoActual;
	}
	public boolean guardarArchivo(Archivo arch) {
		boolean resultado=false;
		int tamañoActual=this.tamañoActual();
		if(!((tamañoActual + arch.getTamaño()) > this.tamaño)) {
			this.archivos.add(arch);
			resultado=true;
		}
		return resultado;
	}
	
	public boolean eliminar(String nombre) {
		boolean resultado=false;
		ArrayList<String> aux = new ArrayList<String>();
		for(int i=0; i<this.archivos.size();i++) {
			aux.add(this.archivos.get(i).getNombre());
		}
		int index= aux.indexOf(nombre);
		if(index>=0) {
			resultado=true;
			this.archivos.remove(index);
		}
		return resultado;
	}
	
	public void formatear() {
		this.archivos.clear();
	}

	@Override
	public String toString() {
		return this.archivos.toString() + "\n" + this.tamañoActual();
	}
	
	

	
	
	

}
