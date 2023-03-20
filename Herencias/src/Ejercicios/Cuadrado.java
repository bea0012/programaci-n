package Ejercicios;

public class Cuadrado extends FiguraGeometrica{
	
	private double lado;
	
	public Cuadrado() {
		super();
		this.lado=0;
	}
	
	public Cuadrado(double lado) {
		super();
		this.lado=lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double Area() {
		double a=Math.pow(lado, 2);
		this.area=a;
		return a;
	}

	@Override
	public double Perimetro() {
		double p=this.lado+this.lado+this.lado+this.lado;
		this.perimetro=p;
		return 0;
	}

}
