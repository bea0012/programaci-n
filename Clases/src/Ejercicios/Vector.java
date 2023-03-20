package Ejercicios;

public class Vector {
	
	private double [] vector;
	
	public Vector(double [] vector) {
		this.vector=vector;
	}

	public double[] getVector() {
		return vector;
	}

	public void setVector(double[] vector) {
		this.vector = vector;
	}
	
	public double [] productoEscalar(double escala) {
		double [] resultado = new double [vector.length];
		for(int i=0; i<vector.length; i++) {
			resultado[i]= this.vector[i]*escala;
		}
		
		return resultado;
	}
	
	public double[] productoporVectro(double [] vector2) {
		double [] resultado = new double [vector.length];
		for(int i=0; i<vector.length; i++) {
			resultado[i]= this.vector[i]*vector2[i];
		}
		
		return resultado;
	}

}
