package examen;

public class Vector implements iOperable{
	
	private int[] vector; /*creo una variable para el user*/
	
	
	public Vector(int[] vector) {
		super();
		this.vector = vector;
	} /*creo constructor para inicializarlo*/

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	} /*tu get y set util y obligatorio vamos*/
	
	@Override
	public void Sumar(int num) {
		for(int i=0; i<this.vector.length; i++) {
			this.vector[i]+=num;
		} 
	
	}

	@Override
	public void Restar(int num) {
		for(int i=0; i<this.vector.length; i++) {
			this.vector[i]-=num;
		}
	}

	@Override
	public void Multiplicar(int num) {
		for(int i=0; i<this.vector.length; i++) {
			this.vector[i]*=num;
		}
		
	}

	@Override
	public void Dividir(int num) {
		for(int i=0; i<this.vector.length; i++) {
			this.vector[i]/=num;
		}
		
	} /*utilizo un for para recorrer el array y ya hago la operación que me pida cada método, espero que el for este bien y no la haya liado :)*/

}
