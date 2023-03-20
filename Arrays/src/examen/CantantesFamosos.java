package examen;

public class CantantesFamosos {

	private String nombre;
	private int ventas;
	private String generoMusical;
	
	public CantantesFamosos(String nombre, int ventas, String generoMusical) {
		this.nombre = nombre;
		this.ventas = ventas;
		this.generoMusical = generoMusical;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVentas() {
		return ventas;
	}
	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	public String getGeneroMusical() {
		return generoMusical;
	}
	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}
	@Override
	public String toString() {
		return "CantantesFamosos [nombre=" + this.nombre + ", ventas=" + this.ventas + ", generoMusical=" + this.generoMusical + "]";
	}
	
	
	
}
