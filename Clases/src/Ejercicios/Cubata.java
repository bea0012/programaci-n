package Ejercicios;

public class Cubata {
	/*entero hielos capacidad, cantidad
	 * string alcohol,mezcla
	 * double precio
	 * metodos: 1-rellenar 2-beber 3-hidalgo 4-aguarse 
	 */
	private int hielo;
	private int capacidad;
	private int cantidad;
	private String alcohol;
	private String mezcla;
	private double precio;
	
	public Cubata() {
		this.hielo=0;
		this.capacidad=0;
		this.cantidad=0;
		this.alcohol="Nada";
		this.mezcla="Nada";
		this.precio=0;	
	}
	public Cubata(int hielo, int cantidad, int capacidad, String alcohol, String mezcla, double precio) {
		if(this.capacidad>0 && this.cantidad>=0 && this.hielo>=0) {
		this.hielo=hielo;
		this.capacidad=capacidad;
		this.cantidad=capacidad;
		this.mezcla=mezcla;
		this.alcohol=alcohol;
		this.precio=precio;
		}else {
			System.out.println("Cubata no creado");
		}
	}
	public int getHielo() {
		return this.hielo;	
	}
	public void setHielo (int hielo) {
		if(hielo>=0) {
			this.hielo=hielo;
		}else {
			System.out.println("No se han actualizado los hielos");
		}
	}
	public int getCapacidad() {
		return this.capacidad;
	}
	public int getCantidad() {
		return this.cantidad;
	}
	public void setCantidad(int cantidad) {
		if(cantidad>0) {
			this.cantidad=cantidad;
		}else {
			System.out.println("No se ha actualizado la cantidad");
		}
	}
	public String getAlcohol() {
		return this.alcohol;
	}
	public void setAlcohol (String alcohol) {
		this.alcohol=alcohol;
	}
	public String getMezcla() {
		return this.mezcla;
	}
	public void setMezcla(String mezcla) {
		this.mezcla=mezcla;
	}
	public double getPrecio() {
		return this.precio;
	}
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	public void rellenar() {
		this.cantidad=this.capacidad;
	}
	public void beber(int trago) {
		if(cantidad<trago) {
			this.cantidad=0;
		}else {
			this.cantidad-=trago;
		}
	}
	public void hidalgo() {
		this.cantidad=0;
	}
	public void aguarse() {
		if(this.hielo>0) {
			this.hielo--;
			this.cantidad+=50;
			if(this.cantidad>this.capacidad) {
				this.cantidad=this.capacidad;
			}
		}
		
	}
	

}
