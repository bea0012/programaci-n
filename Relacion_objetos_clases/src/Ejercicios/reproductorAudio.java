package Ejercicios;

public class reproductorAudio extends ReproductorPortatil implements iReproductorAudio{
	
	public boolean reproduceAudioCDS, reproduceMP3, reproduceWMA, reproduceVorbis, accesoCarpetas, radio, grabacionVoz;

	public boolean isReproduceAudioCDs() {
		return reproduceAudioCDS;
		}

		public void setReproduceAudioCDs(boolean reproduceAudioCDS) throws Exception {
		if(this.getTipoAlmacenamiento().equals(CD)) {
		this.reproduceAudioCDS = reproduceAudioCDS;
		}else {
		throw new Exception("No reproduce CD");
		}
		}

		public boolean isReproduceMP3() {
		return reproduceMP3;
		}

		public void setReproduceMP3(boolean reproduceMP3) {
		this.reproduceMP3 = reproduceMP3;
		}

		public boolean isReproduceWMA() {
		return reproduceWMA;
		}

		public void setReproduceWMA(boolean reproduceWMA) {
		this.reproduceWMA = reproduceWMA;
		}

		public boolean isReproduceVorbis() {
		return reproduceVorbis;
		}

		public void setReproduceVorbis(boolean reproduceVorbis) {
		this.reproduceVorbis = reproduceVorbis;
		}

		public boolean isAccesoCarpetas() {
		return accesoCarpetas;
		}

		public void setAccesoCarpetas(boolean accesoCarpetas) {
		this.accesoCarpetas = accesoCarpetas;
		}

		public boolean isRadio() {
		return radio;
		}

		public void setRadio(boolean radio) {
		this.radio = radio;
		}

		public boolean isGrabacionVoz() {
		return grabacionVoz;
		}

		public void setGrabacionVoz(boolean grabacionVoz) {
		this.grabacionVoz = grabacionVoz;
		}



	public reproductorAudio(String marca, String modelo, String tipoAlmac, boolean reproduceAudioCDS,
			boolean reproducMP3, boolean reproduceMWA, boolean reproduceVorbis) {
		super(marca, modelo, tipoAlmac);
		this.reproduceAudioCDS = reproduceAudioCDS;
		this.reproduceMP3 = reproducMP3;
		this.reproduceWMA = reproduceMWA;
		this.reproduceVorbis = reproduceVorbis;
	}

	@Override
	public boolean isReproduceAudioCDS() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setReproduceAudioCDS(boolean reproduceAudioCDS) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
