package Ejercicios;

public class Libro {
	
	private long ISBN;
	private String titulo;
	private String autor;
	private int añoPublicacion;
	private int nPaginas;
	
	
	public Libro (int ISBN, String titulo, String autor, int añoPublicacion, int nPaginas) {
		this.ISBN=ISBN;
		this.titulo=titulo;
		this.autor=autor;
		this.añoPublicacion=añoPublicacion;
		this.nPaginas=nPaginas;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		 this.ISBN = ISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	public int getnPaginas() {
		return nPaginas;
	}

	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}
	
	public String ToString() {
		return "El libro " + this.titulo + " con ISBN: " + this.ISBN + " creado por " + this.autor + " en " + this.añoPublicacion + " tiene " + this.nPaginas + " páginas y esta "; 
	}
	
	public boolean prestar() {
		boolean correcto=true;
		if(this.prestar()) {
			correcto=false;
		}else {
			this.prestado=true;
		} return correcto;
	}
	
	public boolean devolver() {
		boolean correcto=true;
		if(!this.prestado) {
			correcto=false;
		}else {
			this.prestar=false;
		} return correcto;
	}
	
	public boolean comparar(Libro l) {
		return this.nPaginas>l.nPaginas;
	}

}
