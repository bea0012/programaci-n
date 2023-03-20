package Ejercicios;

public class Fraccion {
	
	/* Cree una clase Fraccion con métodos para sumar, restar, multiplicar 
	 * y dividir fracciones.
	 */
	
	private int num;
	private int den;
	
		public Fraccion() {
			this.num=1;
			this.den=1;
		}
	
		public Fraccion(int num, int den) {
		this.num=num;
		this.den=den;
	}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public int getDen() {
			return den;
		}

		public void setDen(int den) {
			this.den = den;
		}
		
		public String ToString() {
			return this.num + "/" + this.den;
		}
		
		public Fraccion sumar(Fraccion B) {
			int Cnum = ((num*B.den) + (B.num*den));
			int Cden = den*B.den;
			Fraccion resultado= new Fraccion(Cnum, Cden);
			resultado.simplificar();
			return resultado;
		}
		
		public Fraccion restar(Fraccion B){
			int Cnum = ((num*B.den) - (B.num*den));
			int Cden = den*B.den;
			Fraccion resultado= new Fraccion(Cnum, Cden);
			resultado.simplificar();
			return resultado;
		}
		
		public Fraccion multiplicar(Fraccion B) {
			int Cnum = num*B.num;
			int Cden = den*B.den;
			Fraccion resultado= new Fraccion(Cnum, Cden);
			resultado.simplificar();
			return resultado;
		}
		
		public Fraccion dividir(Fraccion B) {
			int Cnum = num*B.den;
			int Cden = den*B.num;
			Fraccion resultado= new Fraccion(Cnum, Cden);
			resultado.simplificar();
			return resultado;
		}
		
		public void simplificar() {
			int aux=2;
			int menor;
			if(this.num<this.den) {
				menor=this.num;
			}else {
				menor=this.den;
			}
			int limite = menor;
			while(aux<=limite) {
				if (this.num%aux==0 && this.den%aux==0) {
					this.num/=aux;
					this.den/=aux;
				}
			}
			aux++;
		}
		
		

}
