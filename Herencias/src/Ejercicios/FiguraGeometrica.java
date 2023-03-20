package Ejercicios;

public abstract class FiguraGeometrica {
	
	protected double area;
	protected double perimetro;
	
	public abstract double Area();
	
	public abstract double Perimetro();
	
	public boolean compara(FiguraGeometrica f1) {
		return this.Area()>f1.Area();
	}
}
