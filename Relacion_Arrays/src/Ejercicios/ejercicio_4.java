package Ejercicios;

public class ejercicio_4 {
	
	/*Escribir un programa que lea el peso de cada una de las 20 ratas de laboratorio del 
departamento de Biología de la Nutrición. Calcular el peso medio de las ratas e imprimir un 
informe parecido al siguiente: 
hay 2 ratas que pesan 200 gramos 
hay 1 rata que pesa 350 gramos 
... 
peso medio: 325.23 gramos */
	
	private int [] ratas;
	private double media;
	
	public ejercicio_4(int[] ratas) {
		boolean correcto= true;
		if(this.ratas.length==20) {
			for(int i=0; i<ratas.length; i++) {
				if(this.ratas[i]>0) {
					this.ratas=ratas;
				}
			} correcto=false;
		} // Hacemos el constructor para rellenar la variable de ratas
			
		
	}

	public int[] getRatas() {
		return ratas;
	}

	public void setRatas(int[] ratas) {
		this.ratas = ratas;
	} // getter y setter de ratas
	
	public void calcularMedia() {
		int suma=0;
		double media=0;
		for(int i=0; i<ratas.length; i++) {
			suma+= this.ratas[i];
		}
		media=suma/this.ratas.length;
		this.media=media;
	} //aquí calculamos la media del peso de las ratas
	
	public void Ordenar() {
		int aux = 0;
		for (int i = 0; i < this.ratas.length - 1; i++) {
            for (int j = 0; j < this.ratas.length - i - 1; j++) {                                                              
                if (this.ratas[j + 1] < this.ratas[j]) {
                    aux = this.ratas[j + 1];
                    this.ratas[j + 1] = this.ratas[j];
                    this.ratas[j] = aux;
                }
            }
        }
	} // Aquí ordenamos los pesos de las ratas con un método burbuja
	
	
	
	public String ToString() {
		int guardado=this.ratas[0];
		int cont=0;
		String respuesta="";
		for(int i=0; i<this.ratas.length; i++) {
			if(guardado==this.ratas[i]) {
				cont++;
			}else {
				respuesta+="la rata de: ";
				respuesta+= guardado;
				respuesta+= " gramos se repite: ";
				respuesta+= cont;
			}
		}
		return respuesta;
	} // aquí imprimimos el resultado
	
	
	

}
