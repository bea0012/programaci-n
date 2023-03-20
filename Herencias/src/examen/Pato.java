package examen;

public class Pato extends Animal{

	public Pato(String familia, String especie, String reino) {
		super(familia, especie, reino);
		// TODO Auto-generated constructor stub
	} /* constructor heredado para rellenar variables de esta clase*/

	@Override
	public String sonido() {
		String frase="quack quack";
		return frase;
	}

	@Override
	public String comer() {
		String comida="ñam ñam rico";
		return comida;
	}

	@Override
	public boolean reproducción() {
		boolean reproducirse=true;
		return reproducirse;
	} /*cada metodo relleno con ideas simples*/

}
