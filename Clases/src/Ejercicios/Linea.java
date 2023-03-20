package Ejercicios;

public class Linea {
	private Punto p1;
	private Punto p2;
	
	public Linea() {
		this.p1= new Punto();
		this.p2= new Punto();
	}
	
	public Linea(double x, double y) {
		this.p1=new Punto();
		this.p2=new Punto(x,y);
	}
	
	public Linea( double x1, double y1, double x2, double y2) {
		this.p1=new Punto(x1,y1);
		this.p2=new Punto(x2,y2);
	}
	public Linea(Punto p1, Punto p2) {
		this.p1=p1;
		this.p2=p2;
	}

	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	
	public void moverV(double dist) {
		this.p1.moverV(dist);
		this.p2.moverV(dist);
	}
	
	public void moverH(double dist) {
		this.p1.moverH(dist);
		this.p2.moverH(dist);
	}
	
	public String ToString() {
		return "Origen: " + this.p1 + " y final: " + this.p2;
	}
}
