package Ejercicios;

public class Punto {
	
	private double coord1;
	private double coord2;
	
	public Punto() {
		this.coord1=0;
		this.coord2=0;
	}
	
	public Punto (double coord1, double coord2) {
		this.coord1=coord1;
		this.coord2=coord2;
	}

	public double getCoord1() {
		return this.coord1;
	}

	public void setCoord1(double coord1) {
		this.coord1 = coord1;
	}

	public double getCoord2() {
		return this.coord2;
	}

	public void setCoord2(double coord2) {
		this.coord2 = coord2;
	}
	
	public String ToString () {
		return "(" + this.coord1 + "," + this.coord2 + ")";
	}
	
	public void moverV( double dist) {
		this.coord2+=dist;
	}
	
	public void moverH( double dist) {
		this.coord1+=dist;
	}
}
