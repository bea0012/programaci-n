package Ejercicios;

public class OperacionArray {
	
	private double [] numeros;
	private double max;
	private double min;
	
	public OperacionArray() {
		this.numeros=new double [0];
		this.max=0;
		this.min=0;
	}
	
	public OperacionArray(double[] numeros) {
		this.numeros=numeros;
		this.max=0;
		this.min=0;
	}

	public double[] getNumeros() {
		return numeros;
	}

	public void setNumeros(double[] numeros) {
		this.numeros = numeros;
	}

	public double getMax() {
		return max;
	}

	public double getMin() {
		return min;
	}
	
	public void calcularMin() {
		this.min=numeros[0];
		for(int i=1; i<numeros.length; i++) {
			if(this.min>numeros[i]) {
				this.min=numeros[i];
			}
		}
	}
	
	public void calcularMax() {
		this.max=numeros[0];
	}

	
	

}
