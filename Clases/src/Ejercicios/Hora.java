package Ejercicios;

public class Hora {
	private int hora;
	private int min;
	private int seg;
	
	private Hora(){
		this.hora=0;
		this.min=0;
		this.seg=0;
	}
	
	private Hora(int hora, int min, int seg) {
		if (this.filtroHora(hora, min, seg)) {
			this.hora=hora;
			this.min=min;
			this.seg=seg;
		}
		
	}

	public int getHora() {
		return hora;
	}

	public boolean setHora(int hora) {
		boolean correcto=true;
		if(this.filtroHora(hora, this.min, this.seg)) {
			this.hora = hora;
		}else {
			correcto=false;
		}
		return correcto;
	}

	public int getMin() {
		return min;
	}

	public boolean setMin(int min) {
		boolean correcto=true;
		if(this.filtroHora(this.hora, min, this.seg)) {
			this.min = min;
		}else {
			correcto=false;
		}
		return correcto;
	}

	public int getSeg() {
		return seg;
	}

	public boolean setSeg(int seg) {
		boolean correcto=true;
		if(this.filtroHora(this.hora, this.min, seg)) {
			this.seg = seg;
		}else{
			correcto=false;
		}
		return correcto;
	}
	
	public boolean filtroHora(int hora, int min, int seg) {
		boolean correcto=true;
		if (hora<0 || hora>=24 || min<0 || min>59 || seg<0 || seg>59 ) {
			correcto=false;
		}
		return correcto;
	}
	
	public void incrementarTiempo() {
		if(this.filtroHora(hora, min, seg+1)) {
			this.seg++;
		}else {
			this.seg=0;
			if(this.filtroHora(hora, min+1, seg)) {
				this.min++;
			}else {
				this.min=0;
				if(this.filtroHora(hora+1, min, seg)) {
					this.hora++;
				}else {
					this.hora=0;
				}
			}
		}
	}
	
	public String ToString() {
		return this.hora + ":" + this.min + ":" + this.seg;
	}

}
