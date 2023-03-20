package Ejercicios;

public class Dimension {
	
	private double alto;
	private double ancho;
	private double profundidad;
	
	public Dimension() {
		this.alto=0;
		this.ancho=0;
		this.profundidad=0;
	}
	
	public Dimension(double alto, double ancho, double profundidad) {
		if(this.filtroDimension(alto, ancho, profundidad)) {
			this.alto=alto;
			this.ancho=ancho;
			this.profundidad=profundidad;
		}
		
	}
	
	public boolean filtroDimension(double alto, double ancho, double profundidad) {
		boolean correcto=true;
		if(alto<0 || ancho<0 || profundidad<0) {
			correcto=false;
		}else {
			
		}
		
		return correcto;
	}

	public double getAlto() {
		return alto;
	}

	public boolean setAlto(double alto) {
		boolean correcto=true;
		if(this.filtroDimension(alto, this.ancho, this.profundidad)){
			this.alto = alto;
		}else {
			correcto=true;
		}
		return correcto;
	}

	public double getAncho() {
		return ancho;
	}

	public boolean setAncho(double ancho) {
		boolean correcto=true;
		if(this.filtroDimension(this.alto, ancho, this.profundidad)){
			this.ancho = ancho;
		}else {
			correcto=true;
		}
		return correcto;
	}

	public double getProfundidad() {
		return profundidad;
	}

	public boolean setProfundidad(double profundidad) {
		boolean correcto=true;
		if(this.filtroDimension(this.alto, this.ancho, profundidad)){
			this.profundidad = profundidad;
		}else {
			correcto=true;
		}
		return correcto;
	}
	
	public double Volumen() {
		return this.alto*this.ancho*this.profundidad;
	}
	
	public String ToString() {
		return "El objeto es " + this.alto + " de alto " + this.ancho + " de ancho " + this.profundidad + " de profundidad y tiene un volumen de " + this.Volumen();
	}

}
