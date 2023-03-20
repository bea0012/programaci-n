package Ejercicios;

public class Circulo extends FiguraGeometrica {
	private double radio;
	
	public Circulo() {
		super();
		this.radio=0;
	}
	
	public Circulo(double radio) {
		super();
		this.radio=radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double Area() {
		double a=Math.PI*(Math.pow(radio, 2));
		this.area=a;
		return a;
	}

	@Override
	public double Perimetro() {
		double p=2*Math.PI*this.radio;
		this.perimetro=p;
		return 0;
	}
	
	
}
