package Ejercicios;

public class Persona {
	
	private int edad;
	private String sexo;
	private String DNI;
	private double peso;
	private double altura;
	public double IMC;
	
	public Persona (int edad, String sexo, String DNI, double peso, double altura) {
		this.edad=edad;
		this.sexo=sexo;
		this.DNI=generadorDNI();
		this.peso=peso;
		this.altura=altura;
		this.IMC=calcularIMC();
	}

	public int getEdad() {
		return edad;
	}

	public boolean setEdad(int edad) {
		boolean correcto=true;
		if(this.edad>0) {
			this.edad = edad;
		}else {
			correcto=false;
		}
		return correcto;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDNI() {
		return DNI;
	}
	
	public double getPeso() {
		return peso;
	}

	public boolean setPeso(double peso) {
		boolean correcto=true;
		if(this.peso>0) {
			this.peso = peso;
		}else {
			correcto=false;
		}
		return correcto;
		
	}

	public double getAltura() {
		return altura;
	}

	public boolean setAltura(double altura) {
		boolean correcto=true;
		if(this.altura>0) {
			this.altura = altura;
		}else {
			correcto=false;
		}
		return correcto;
	}
	

	public double getIMC() {
		return IMC;
	}

	public String ToString() {
		return "Usted mide " + altura + " pesa " + peso + " tiene " + edad + " años su IMC es de " + IMC + " su DNI es " + DNI + " y su sexo es " + sexo;
	}
	
	public double calcularIMC() {
		return IMC=peso/Math.pow(this.altura,2);
	}
	
	public String ClasificacionOMS() {
		String res="";
		if(this.IMC<18.5) {
			res="Bajo peso";
		}else if(this.IMC>18.5 && this.IMC>24.9) {
			res="Adecuado";
		}else if(this.IMC>25 && this.IMC<29.9){
			res="Sobrepeso";
		}else if(this.IMC>30 && this.IMC<34.9) {
			res="Obesidad grado 1";
		}else if(this.IMC>35 && this.IMC<39.9) {
			res="Obesidad grado 2";
		}else if(this.IMC>40){
			res="Obesidad grado 2";
		}else {

		}
		return res;
	}
	public boolean comprobarSexo(String sexo2) {
		boolean correcto=false;
		if(this.sexo==sexo2) {
			correcto=true;
		}else {
			
		}
		return correcto;
	}
	public boolean MayorDeEdad() {
		boolean correcto=true;
		if(edad<18) {
			correcto=false;
		}else {
			
		}
		return correcto;
	}
	public String generadorDNI() {
		int num1 = (int)(Math.random()*9+1);
		int num2 = (int)(Math.random()*9+1);
		int num3 = (int)(Math.random()*9+1);
		int num4 = (int)(Math.random()*9+1);
		int num5 = (int)(Math.random()*9+1);
		int num6 = (int)(Math.random()*9+1);
		int num7 = (int)(Math.random()*9+1);
		int num8 = (int)(Math.random()*9+1);
		String numDNI = ""+num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8;
		String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = Integer.parseInt(numDNI)%23;
		return numDNI + caracteres.charAt(resto);
	}
	
	

}
