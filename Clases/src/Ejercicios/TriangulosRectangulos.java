package Ejercicios;

public class TriangulosRectangulos {
	/*Diseñe e implemente una clase para representar triángulos rectángulos.
	 * Debe añadir las propiedades, métodos y constructores que considere oportunos.
	 * Añada un método para calcular el perímetro y otro para el área
	 * con los argumentos que considere
	 */
	
	private double catetoA;
	private double catetoB;
	private double hipotenusa;
	
	public TriangulosRectangulos() {
		this.catetoA=4;
		this.catetoB=3;
		this.hipotenusa=5;
	}
	
	public TriangulosRectangulos(double catetoA, double catetoB, double hipotenusa) {
		if (catetoA>0 && catetoB>0 && hipotenusa>0) {
			if (Math.pow(catetoA, 2)+Math.pow(catetoB, 2)==Math.pow(hipotenusa, 2)){
				this.catetoA=catetoA;
				this.catetoB=catetoB;
				this.hipotenusa=hipotenusa;
			}
		}else{
			System.out.println("No es un triangulo rectangulo");
		}
	}
	
	public double getCatetoA() {
		return this.catetoA;
	}
	public void setCatetoA(double catetoA) {
		if (catetoA>0) {
			this.catetoA=catetoA;
	}else {
		System.out.println("CatetoA no modificado");
	}
	}
	public double getCatetoB() {
		return this.catetoB;
	}
	public void setCatetoB(double catetoB) {
		if (catetoB>0) {
			this.catetoB=catetoB;
	}else {
		System.out.println("CatetoB no modificado");
	}
	}
	public double getHipotenusa() {
		return this.hipotenusa;
	}
	public void setHipotenusa(double hipotenusa) {
		if (hipotenusa>0) {
			this.hipotenusa=hipotenusa;
	}else {
		System.out.println("Hipotenusa no modificada");
	}
	}
	public double perimetro() {
		return this.catetoA+this.catetoB+this.hipotenusa;
	}
	public double area() {
		return (this.catetoA*this.catetoB)/2;
	}

}
