package examen;

public class Fracción implements iOperable {
	
	private int numerador;
	private int denominador; /*variables para la fracción del usuario*/
	
	public Fracción(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	} /*constructor para que se pueda inicializar*/

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	} /*getters y setter de las variables */

	@Override
	public void Sumar(int num) {
		this.numerador=this.numerador+(this.denominador*num);
		this.denominador=this.numerador*1;
		
	}

	@Override
	public void Restar(int num) {
		this.numerador=this.numerador-(this.denominador*num);
		this.denominador=this.numerador*1;
		
	}

	@Override
	public void Multiplicar(int num) {
		this.numerador*=num;
		this.denominador*=1;
		
	}

	@Override
	public void Dividir(int num) {
		this.numerador*=1;
		this.denominador*=num;
		
	} /*calculo en cada método como se calcula con la variable por parametro, gracias por poner como se calcula con fracciones, las mates no son lo mio, yo hice artes :)*/

}
