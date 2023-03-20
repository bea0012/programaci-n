package Ejercicios;

public class Figura {
	
	private String codigo;
	private double precio;
	private Superheroe superheroe;
	private Dimension dimensiones;
	
	public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimensiones) {
		this.codigo=codigo;
		this.precio=precio;
		this.dimensiones=dimensiones;
		this.superheroe=superheroe;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public boolean setPrecio(double precio) {
		boolean correcto=true;
		if(precio>0) {
			this.precio = precio;
		}else {
			correcto=false;
		}
		return correcto;
	}

	public Superheroe getCaract() {
		return superheroe;
	}

	public void setCaract(Superheroe superheroe) {
		this.superheroe = superheroe;
	}

	public Dimension getDimen() {
		return dimensiones;
	}

	public void setDimen(Dimension dimensiones) {
		this.dimensiones = dimensiones;
	}
	
	public String ToString() {
		return "La figura con codigo " + this.codigo + " cuesta " + this.precio + " tiene unas dimensiones de " + this.dimensiones + " y sus caracteristicas son " + this.superheroe;
	}
	
	public boolean subirPrecio(double subida) {
		boolean correcto=true;
		if(precio<0) {
			this.precio=this.precio + subida;
		}else {
			correcto=false;
		}
		return correcto;
	}

}
