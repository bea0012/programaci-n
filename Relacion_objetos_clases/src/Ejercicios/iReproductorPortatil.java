package Ejercicios;

public interface iReproductorPortatil {
	public static final String CD="CD";
	public static final String DVD="DVD";
	public static final String MemoriaFlash="MemoriaFlash";
	public static final String MiniDisc="MiniDisc";
	public static final String ninguna="ninguna";
	public static final String texto="texto";
	public static final String monocromo="monocromo";
	public static final String color="color";
	public static final String pilas="pilas";
	public static final String LiOn="Li-On";
	
	
	public String getMarca();
	public void setMarca(String Marca);
	public String getModelo();
	public void setModelo(String Modelo);
	public boolean isReproduceSonido();
	public void setReproduceSonido(boolean sonido);
	public boolean isReproduceVideo();
	public void setReproduceVideo(boolean video);
	public String getTipoAlmacenamiento();
	public void setTipoAlmacenamiento(String tipoAlmac);
	public int getCapacidadAlmacenamiento();
	public int setCapacidadAlmacenamiento(int capacidadAlmac);
	public String getpantalla();
	public void setpantalla(String pantalla);
	public String setTipoBateria();
	public void getTipoBateria(String bateria);
	public int setAutonimia();
	public void getAutonomia(int autonomia);
	public double setAncho();
	public void getAncho(double ancho);
	public double setAlto();
	public void getAlto(double alto);
	public double setGrosor();
	public void getGrosor(double grosor);
	
	
	
	
	
}
