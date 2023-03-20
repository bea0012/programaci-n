package Ejercicios;

public interface iReproductorVideo extends iReproductorPortatil {
	
	public static final String WMV = "WMV";
	public static final String DIVX = "WMV";
	public static final String MPG = "MPG";
	public static final String DVD = "DVD";
	public static final String JPG = "JPG";
	
	public boolean isReproduceWMV();
	public void setReproduceWMV(boolean reproduceWMV);
	public boolean isReproduceDIVX();
	public void setReproduceDIVX(boolean reproduceDIVX);
	public boolean isReproduceMPG();
	public void setReproduceMPG(boolean reproduceMPG);
	public boolean isReproduceDVD();
	public void setReproduceDVD(boolean reproduceDVD);
	public boolean isReproduceJPG();
	public void setReproduceJPG(boolean reproduceJPG);
	public double getTamayoPantalla();
	public void setTamayoPantalla(double tamayoPantalla);
	public boolean getTelevision();
	public void setTelevision(boolean television);



}
