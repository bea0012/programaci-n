package arraylists;

public class arraymeteo {
	
	import java.util.ArrayList;


		private ArrayList<Integer> mesesLLuvia;
		
		
		public void introducirLectura(int mes,int cantLLuvia) {
			int cant=0;
			cant=cantLLuvia + mesesLLuvia.get(mes);
			mesesLLuvia.add(mes, cant);	
		}
		public String lecturaMes(int mes) {
			String resultado="";
			resultado+=mesesLLuvia.get(mes);
			return resultado;
		}
		public String mesMasLLuvioso() {
			int resultado=0;
			int mayor=0;
			for (int i = 0; i < 12; i++) {
				if(mesesLLuvia.get(i)>mayor) {
					mayor=mesesLLuvia.get(i);
					resultado=i;
				}
			}
			String mes="";
			if(resultado==0) {
				mes="Enero";
			}
			if(resultado==1) {
				mes="Febrero";
			}
			if(resultado==2) {
				mes="Marzo";
			}
			if(resultado==3) {
				mes="Abril";
			}
			if(resultado==4) {
				mes="Mayo";
			}
			if(resultado==5) {
				mes="Junio";
			}
			if(resultado==6) {
				mes="Julio";
			}
			if(resultado==7) {
				mes="Agosto";
			}
			if(resultado==8) {
				mes="Septiembre";
			}
			if(resultado==9) {
				mes="Octubre";
			}
			if(resultado==10) {
				mes="Noviembre";
			}
			if(resultado==11) {
				mes="Diciembre";
			}
			return mes;
		}
		public String mesMasSeco() {
			int resultado=0;
			int menor=mesesLLuvia.get(0);
			for (int i = 0; i < 12; i++) {
				if(mesesLLuvia.get(i)<menor) {
					menor=mesesLLuvia.get(i);
					resultado=i;
				}
			}
			String mes="";
			if(resultado==0) {
				mes="Enero";
			}
			if(resultado==1) {
				mes="Febrero";
			}
			if(resultado==2) {
				mes="Marzo";
			}
			if(resultado==3) {
				mes="Abril";
			}
			if(resultado==4) {
				mes="Mayo";
			}
			if(resultado==5) {
				mes="Junio";
			}
			if(resultado==6) {
				mes="Julio";
			}
			if(resultado==7) {
				mes="Agosto";
			}
			if(resultado==8) {
				mes="Septiembre";
			}
			if(resultado==9) {
				mes="Octubre";
			}
			if(resultado==10) {
				mes="Noviembre";
			}
			if(resultado==11) {
				mes="Diciembre";
			}
			return mes;
		}
		public double mediaLLuvia(int mes1,int mes2){
			double media=0;
			media+=mesesLLuvia.get(mes1);
			media+=mesesLLuvia.get(mes2);
			media=media/2;
			return media;
		}
		public double mediaLLuviaAnual(){
			double mediaAnual=0;
			for (int i = 0; i < 12; i++) {
				mediaAnual+=mesesLLuvia.get(i);
			}
			mediaAnual=mediaAnual/12;
			return mediaAnual;
		}
		@Override
		public String toString() {
			String resultado="";
			
			for (int i = 0; i < 12; i++) {
				if(i==0) {
					resultado+="	Enero : " + mesesLLuvia.get(i);
				}
				if(i==1) {
					resultado+="	Febrero : " + mesesLLuvia.get(i);
				}
				if(i==2) {
					resultado+="	Marzo : " + mesesLLuvia.get(i);
				}
				if(i==3) {
					resultado+="	Abril : " + mesesLLuvia.get(i);
				}
				if(i==4) {
					resultado+="	Mayo : " + mesesLLuvia.get(i);
				}
				if(i==5) {
					resultado+="	Junio : " + mesesLLuvia.get(i);
				}
				if(i==6) {
					resultado+="	Julio : " + mesesLLuvia.get(i);
				}
				if(i==7) {
					resultado+="	Agosto : " + mesesLLuvia.get(i);
				}
				if(i==8) {
					resultado+="	Septiembre : " + mesesLLuvia.get(i);
				}
				if(i==9) {
					resultado+="	Octubre : " + mesesLLuvia.get(i);
				}
				if(i==10) {
					resultado+="	Agosto : " + mesesLLuvia.get(i);
				}
				if(i==11) {
					resultado+="	Diciembre : " + mesesLLuvia.get(i);
				}
			}
			
			return resultado;
		}
		public estacion() {
			super();
			this.mesesLLuvia = new ArrayList<Integer>();
		}
		
	}
}
