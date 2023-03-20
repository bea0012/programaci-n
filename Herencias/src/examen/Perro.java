package examen;

public class Perro extends Animal{

	public Perro(String familia, String especie, String reino) {
		super(familia, especie, reino);
		// TODO Auto-generated constructor stub
	} /* constructor heredado para rellenar variables de esta clase*/

	@Override
	public String sonido() {
		String frase="gua gua gua";
		return frase;
	}

	@Override
	public String comer() {
		String comida="dame jamoncito perro, digo ñam pienso rico";
		return comida;
	}

	@Override
	public boolean reproducción() {
		boolean reproducirse=true;
		return reproducirse;
	} /*cada metodo relleno con ideas simples pero graciosas*/

}
