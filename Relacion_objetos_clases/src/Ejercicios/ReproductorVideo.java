package Ejercicios;

public class ReproductorVideo extends ReproductorPortatil implements iReproductorVideo{
	
	private boolean reproduceWMV;
	private boolean reproduceDIVX;
	private boolean reproduceMPG;
	private boolean reproduceDVD;
	private boolean reproduceJPG;
	private double tamayoPantalla;
	private boolean television;

	public ReproductorVideo(String marca, String modelo, String tipoAlmac) {
		super(marca, modelo, tipoAlmac);
		// TODO Auto-generated constructor stub
	}
	
	

	public ReproductorVideo(String marca, String modelo, String tipoAlmac, double tamayoPantalla) {
		super(marca, modelo, tipoAlmac);
		this.tamayoPantalla = tamayoPantalla;
	}



	@Override
	public boolean isReproduceWMV() {
		return this.reproduceWMV;
	}

	@Override
	public void setReproduceWMV(boolean reproduceWMV) {
		this.reproduceWMV=reproduceWMV;
		
	}

	@Override
	public boolean isReproduceDIVX() {
		return this.reproduceDIVX;
	}

	@Override
	public void setReproduceDIVX(boolean reproduceDIVX) {
		this.reproduceDIVX=reproduceDIVX;
		
	}

	@Override
	public boolean isReproduceMPG() {
		return this.reproduceMPG;
	}

	@Override
	public void setReproduceMPG(boolean reproduceMPG) {
		this.reproduceMPG=reproduceMPG;
		
	}

	@Override
	public boolean isReproduceDVD() {
		return this.reproduceDVD;
	}

	@Override
	public void setReproduceDVD(boolean reproduceDVD) {
		this.reproduceDVD=reproduceDVD;
		
	}

	@Override
	public boolean isReproduceJPG() {
		return this.reproduceJPG;
	}

	@Override
	public void setReproduceJPG(boolean reproduceJPG) {
		this.reproduceJPG=reproduceJPG;
		
	}

	@Override
	public double getTamayoPantalla() {
		return this.tamayoPantalla;
	}

	@Override
	public void setTamayoPantalla(double tamayoPantalla) {
		this.tamayoPantalla=tamayoPantalla;
		
	}

	@Override
	public boolean getTelevision() {
		return this.television;
	}

	@Override
	public void setTelevision(boolean television) {
		this.television=television;
		
	}

}
