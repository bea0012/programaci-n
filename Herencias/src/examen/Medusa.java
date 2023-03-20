package examen;

public class Medusa extends Animal{

	public Medusa(String familia, String especie, String reino) {
		super(familia, especie, reino);
		// TODO Auto-generated constructor stub
	} /* constructor heredado para rellenar variables de esta clase*/

	@Override
	public String sonido() {
		String frase="glub brr, glub brr, glub brr";
		return frase;
	}

	@Override
	public String comer() {
		String comida="Mmmm placton, que rico dios mío, digo glub brr";
		return comida;
	}

	@Override
	public boolean reproducción() {
		boolean reproducirse=true;
		return reproducirse;
	} /*cada metodo relleno con ideas simples pero graciosas, espero que te rias :)*/

}
