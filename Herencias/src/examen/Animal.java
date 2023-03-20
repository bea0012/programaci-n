package examen;

public abstract class Animal {
	
	private String familia;
	private String especie;
	private String reino; /*las variables que decía el ejercicio*/
	
	public Animal(String familia, String especie, String reino) {
		super();
		this.familia = familia;
		this.especie = especie;
		this.reino = reino;
	} /*contructor para que hereden las clases hijas*/
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getReino() {
		return reino;
	}
	public void setReino(String reino) {
		this.reino = reino;
	} /*getters y setters de las variables*/
	
	public abstract String sonido();
	public abstract String comer();
	public abstract boolean reproducción(); /*los metodos abstractos que pedias*/

}
