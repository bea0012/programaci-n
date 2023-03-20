package interfaces;

public class Disco implements iPublicacion, iPrestable, iConsultable{
	
	private int codigo;
	private String autor;
	private String titulo;
	private int anio;
	private boolean prestado;
	private boolean consultado;
	

	public Disco(int codigo, String autor, String titulo, int anio) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.anio = anio;
		this.prestado = false;
		this.consultado=false;
	}

	@Override
	public int getCodigo() {
		
		return this.codigo;
	}

	@Override
	public void setCogido(int codigo) {
		this.codigo=codigo;
	}

	@Override
	public String getAutor() {
		return this.autor;
	}

	@Override
	public void setAutor(String autor) {
		this.autor=autor;
	}

	@Override
	public String getTitulo() {
		return this.titulo;
	}

	@Override
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}

	@Override
	public int getAnio() {
		return this.anio;
	}

	@Override
	public void setAnio(int anio) {
		this.anio=anio;
	}

	@Override
	public boolean isPrestado() {
		return this.prestado;
	}

	@Override
	public void setPrestado(boolean prestado) {
		this.prestado=prestado;
	}

	@Override
	public void prestar() {
		if(!this.prestado) {
			this.prestado=true;
		}
		
	}

	@Override
	public void devolver() {
		if(this.prestado) {
			this.prestado=false;
		}
		
	}

	@Override
	public void retirar() {
		if(!this.prestado && !this.consultado) {
			this.consultado=true;
		}
		
	}

	@Override
	public boolean isConsultando() {
		return this.consultado;
	}

}
