package Ejercicios;

public class Punto3D extends Punto{
	
	private double coord3;
	
	public Punto3D(){
		super();
		this.coord3=0;
	}
	
	public Punto3D(double coord3, double coord2, double coord1){
		super(coord1, coord2);
		this.coord3=coord3;
	}

	public double getCoord3() {
		return coord3;
	}

	public void setCoord3(double coord3) {
		this.coord3 = coord3;
	}
	
	public void MoverP(double distancia) {
		this.coord3=this.coord3+distancia;
	}

}
