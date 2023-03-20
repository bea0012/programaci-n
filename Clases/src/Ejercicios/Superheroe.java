package Ejercicios;

public class Superheroe {
	
	private String nombre;
	private String descripción;
	private boolean capa;
	
	public Superheroe(String nombre) {
		this.nombre=nombre;
		this.descripción="";
		this.capa=false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public boolean isCapa() {
		return capa;
	}

	public void setCapa(boolean capa) {
		this.capa = capa;
	}
	
	public String ToString() {
		String capita="";
		if(this.capa) {
			capita="Tiene capa";
		}else {
			capita="No tiene capa";
		}
		return "El superheroe es " + this.nombre + " esta es su descripción: " + this.descripción + " y " + capita;
	}

}
