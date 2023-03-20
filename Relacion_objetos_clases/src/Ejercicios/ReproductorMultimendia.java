package Ejercicios;

public class ReproductorMultimendia extends ReproductorPortatil implements iReproductorAudio, iReproductorVideo{
	
	private boolean reproduceWMV;
	private boolean reproduceDIVX;
	private boolean reproduceMPG;
	private boolean reproduceDVD;
	private boolean reproduceJPG;
	private double tamayoPantalla;
	private boolean television;
	public boolean reproduceAudioCDS, reproduceMP3, reproduceWMA, reproduceVorbis, accesoCarpeta, radio, grabacionVoz;

	public ReproductorMultimendia(String marca, String modelo, String tipoAlmac) {
		super(marca, modelo, tipoAlmac);
		// TODO Auto-generated constructor stub
	}

	public ReproductorMultimendia(String marca, String modelo, String tipoAlmac, boolean reproduceWMV,
			boolean reproduceDIVX, boolean reproduceMPG, boolean reproduceDVD, boolean reproduceJPG,
			double tamayoPantalla, boolean television, boolean reproduceAudioCDS, boolean reproduceMP3,
			boolean reproduceWMA, boolean reproduceVorbis, boolean accesoCarpeta, boolean radio, boolean grabacionVoz) {
		super(marca, modelo, tipoAlmac);
		this.reproduceWMV = reproduceWMV;
		this.reproduceDIVX = reproduceDIVX;
		this.reproduceMPG = reproduceMPG;
		this.reproduceDVD = reproduceDVD;
		this.reproduceJPG = reproduceJPG;
		this.tamayoPantalla = tamayoPantalla;
		this.television = television;
		this.reproduceAudioCDS = reproduceAudioCDS;
		this.reproduceMP3 = reproduceMP3;
		this.reproduceWMA = reproduceWMA;
		this.reproduceVorbis = reproduceVorbis;
		this.accesoCarpeta = accesoCarpeta;
		this.radio = radio;
		this.grabacionVoz = grabacionVoz;
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

	@Override
	public boolean isReproduceAudioCDS() {
		return this.reproduceAudioCDS;
	}

	@Override
	public void setReproduceAudioCDS(boolean reproduceAudioCDS) {
		this.reproduceAudioCDS=reproduceAudioCDS;
		
	}

	@Override
	public boolean isReproduceMP3() {
		return this.reproduceMP3;
	}

	@Override
	public void setReproduceMP3(boolean reproduceMP3) {
		this.reproduceMP3=reproduceMP3;
		
	}

	@Override
	public boolean isReproduceWMA() {
		return this.reproduceWMA;
	}

	@Override
	public void setReproduceWMA(boolean reproduceWMA) {
		this.reproduceWMA=reproduceWMA;
		
	}

	@Override
	public boolean isReproduceVorbis() {
		return this.reproduceVorbis;
	}

	@Override
	public void setReproduceVorbis(boolean reproduceVorbis) {
		this.reproduceVorbis=reproduceVorbis;
		
	}

	@Override
	public boolean isAccesoCarpetas() {
		return this.accesoCarpeta;
	}

	@Override
	public void setAccesoCarpetas(boolean accesoCarpeta) {
		this.accesoCarpeta=accesoCarpeta;
		
	}

	@Override
	public boolean isRadio() {
		return this.radio;
	}

	@Override
	public void setRadio(boolean radio) {
		this.radio=radio;
	}

	@Override
	public boolean isGrabacionVoz() {
		return this.grabacionVoz;
	}

	@Override
	public void setGrabacionVoz(boolean grabacionVoz) {
		this.grabacionVoz=grabacionVoz;
		
	}

}
