package Ejercicios;

public class Rectangulo extends FiguraGeometrica {
	
	public double base;
	public double altura;
	
	public Rectangulo() {
		super();
		this.base=0;
		this.altura=0;
	}
	
	public Rectangulo(double base, double altura) {
		super();
		this.base=base;
		this.altura=altura;
	}
	
	

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double Area() {
		double a=this.base*this.altura;
		this.area=a;
		return a;
	}

	@Override
	public double Perimetro() {
		double p=2*this.base + 2*this.altura;
		this.perimetro=p;
		return p;
	}
	
	

}
