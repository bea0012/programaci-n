package Ejercicios;

public class ReproductorPortatil implements iReproductorPortatil {
	
	private String marca;
	private String modelo;
	private boolean sonido;
	private boolean video;
	private String tipoAlmac;
	private int capacidadAlmac;
	private String pantalla;
	private String bateria;
	private int autonomia;
	private double ancho;
	private double alto;
	private double grosor;

	public ReproductorPortatil(String marca, String modelo, String tipoAlmac) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipoAlmac = tipoAlmac;
	}

	@Override
	public String getMarca() {
		return this.marca;
	}

	@Override
	public void setMarca(String Marca) {
		this.marca=Marca;
		
	}

	@Override
	public String getModelo() {
		return this.modelo;
	}

	@Override
	public void setModelo(String Modelo) {
		this.modelo=Modelo;
		
	}

	@Override
	public boolean isReproduceSonido() {
		return this.sonido;
	}

	@Override
	public void setReproduceSonido(boolean sonido) {
		this.sonido=sonido;
		
	}

	@Override
	public boolean isReproduceVideo() {
		return this.video;
	}

	@Override
	public void setReproduceVideo(boolean video) {
		this.video=video;
		
	}

	@Override
	public String getTipoAlmacenamiento() {
		return this.tipoAlmac;
	}

	@Override
	public void setTipoAlmacenamiento(String tipoAlmac) {
		this.tipoAlmac=tipoAlmac;
		
	}

	@Override
	public int getCapacidadAlmacenamiento() {
		return this.capacidadAlmac;
	}

	@Override
	public int setCapacidadAlmacenamiento(int capacidadAlmac) {
		return this.capacidadAlmac=capacidadAlmac;
	}

	@Override
	public String getpantalla() {
		return this.pantalla;
	}

	@Override
	public void setpantalla(String pantalla) {
		this.pantalla=pantalla;
		
	}

	@Override
	public String setTipoBateria() {
		return this.bateria;
	}

	@Override
	public void getTipoBateria(String bateria) {
		this.bateria=bateria;
		
	}

	@Override
	public int setAutonimia() {
		return this.autonomia;
	}

	@Override
	public void getAutonomia(int autonomia) {
		this.autonomia=autonomia;
		
	}

	@Override
	public double setAncho() {
		return this.ancho;
	}

	@Override
	public void getAncho(double ancho) {
		this.ancho=ancho;
		
	}

	@Override
	public double setAlto() {
		return this.alto;
	}

	@Override
	public void getAlto(double alto) {
		this.alto=alto;
		
	}

	@Override
	public double setGrosor() {
		return this.grosor;
	}

	@Override
	public void getGrosor(double grosor) {
		this.grosor=grosor;
		
	}


}
