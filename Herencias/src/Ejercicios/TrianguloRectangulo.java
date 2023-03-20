package Ejercicios;

public class TrianguloRectangulo extends FiguraGeometrica{
	
	public double cateto1;
	public double cateto2;
	public double cateto3;
	
	public TrianguloRectangulo() {
		super();
		this.cateto1=0;
		this.cateto2=0;
		this.cateto3=0;
	}
	
	public TrianguloRectangulo(double cateto1, double cateto2, double cateto3) {
		super();
		this.cateto1=cateto1;
		this.cateto2=cateto2;
		this.cateto3=cateto3;
	}

	public double getCateto1() {
		return cateto1;
	}

	public void setCateto1(double cateto1) {
		this.cateto1 = cateto1;
	}

	public double getCateto2() {
		return cateto2;
	}

	public void setCateto2(double cateto2) {
		this.cateto2 = cateto2;
	}
	
	

	public double getCateto3() {
		return cateto3;
	}

	public void setCateto3(double cateto3) {
		this.cateto3 = cateto3;
	}

	@Override
	public double Area() {
		double a=this.cateto1*this.cateto2/2;
		this.area=a;
		return a;
	}

	@Override
	public double Perimetro() {
		double p=this.cateto1+this.cateto2+this.cateto3;
		this.perimetro=p;
		return p;
	}
	
	

}
