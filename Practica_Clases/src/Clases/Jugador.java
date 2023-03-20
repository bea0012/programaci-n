package Clases;

public class Jugador {
	
	private String nombre;
	private Dado dado;
	private int puntuacion; /*nombramos las variables que necesitamos para esta clase*/
	
	public Jugador() {
		this.nombre="";
		this.dado=null;
		this.puntuacion=0;
		
	} /*creamos un contructor vacío con todas las variables a 0 o sin nada*/
	
	public Jugador(String nombre, Dado dado) {
		this.nombre=nombre;
		this.dado=dado;
		this.puntuacion=0;
	} /*creamos un contructor para que el usuario introduzca los valores por `parametro*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Dado getDado() {
		return dado;
	}

	public void setDado(Dado dado) {
		this.dado = dado;
	}

	public int getPuntuacion() {
		return puntuacion;
	} 

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = this.Tirar2();
	} /*Todo esto son getter y setter que basicamente devuelven y cambian las variables según el usuario lo pida, en el último 
	set de puntuación hemos puesto el metodo de tirar ya que la puntuación es el numero que le haya salido en el dado*/
	
	public int Tirar2() {
		this.puntuacion=dado.Tirar();
		return this.puntuacion;
	} /*el metodo tirar consiste en llamar al método de la clase dado Tirar y lo guardo en puntuación y devuelvo esta porque es donde se va a almacenar la tirada*/
	
	public String ToString() {
		return "El jugador es " + this.nombre + " usa un dado de " + this.dado + " y tiene una puntuación de " + this.puntuacion;
	} /*hacemos un tostring para pasar por pantalla al usuario los valores de las variables de dicha clase*/
	
	

}
