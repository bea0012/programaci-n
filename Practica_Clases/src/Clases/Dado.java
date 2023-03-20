package Clases;

public class Dado {
	
	private int numCaras;
	private boolean trucado; /*definimos las variables necesarias para esta calse*/
	
	public Dado() {
		this.numCaras=0;
		this.trucado=false; 
	} /*creamos un constructor vacío*/
	
	public Dado(int numCaras, boolean trucado) {
		if(numCaras>1) {
			this.numCaras=numCaras;
			this.trucado=trucado;
		}else {
			
		} /*creamos otro constructor, esta vez para que el usuario introduzca por parametro el valor de las variables y ponemos un filtro para para que no introduzcan un dado no valido*/
		
	}

	public int getNumCaras() {
		return numCaras;
	} /*get para poder devolver la info al usuario de esta variable*/

	public boolean setNumCaras(int numCaras) {
		boolean correcto=true;
		if(numCaras<=1) {
			correcto=false;
		}else {
			this.numCaras = numCaras;
		}
		return correcto;
	} /*set de una variable para que el usuario pueda cambiar la variable y con un filtro para que no introduzca un valor negativo o incorrecto*/

	public boolean isTrucado() {
		return trucado;
	} /*is y no get porque la variable es booleana y devolver la info al usuario de esta variable*/

	public void setTrucado(boolean trucado) {
		this.trucado = trucado;
	} /*un set sirve para que el usuario pueda cambiar el valor de la variable*/
	
	public String ToString() {
		String trucado="";
		if(this.trucado) {
			trucado= "esta trucado";
		}else {
			trucado= "no esta trucado";
		}
		return "El dado tiene " + this.numCaras + " y " + trucado;
	} /*Un ToString sirve para imprimir al usuario información de la clase en este caso el numero de caras y si el daqdo esta trucado o no, 
	para esto creamos un if donde nos devolverá un string de si el dado esta trucado o no porque no podemos imprimir simplemente la variable trucado que es boolean, solo se vería un true o false*/
	
	public int Tirar() {
		int num=0;
		if(this.trucado==false) {
			num= (int)(Math.random()*this.numCaras)+1;
		}else {
			num=(int)(Math.random()*5)+1; /*no se como hacer lo de 50%, si esto funciona ole*/
		}
		
		return num;
	} /*el metodo tirar sirve para larzar el dado y que salga un numero aleatorio por eso hacemos un if dentro por si eldado esta trucado o no, dentro de cada uno ponemos
	el Math.random que sirve para larzar un número aleatorio y lo multiplicamos por el número de caras para que sea un numero que este dentro de las posibilidades de nuestro
	dado*/
	
	

}
