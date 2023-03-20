package arraylists;

public class Archivo {
	
	private String nombre;
	private String contenido;
	private int tamaño;

	public Archivo(String nombre, String contenido) {
		this.nombre = nombre;
		this.contenido = contenido;
		this.tamaño=this.contenido.length();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Archivo [nombre=" + nombre + ", tamaño=" + tamaño + "]";
	}

	
	
	

}
