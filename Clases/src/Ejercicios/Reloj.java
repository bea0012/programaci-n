package Ejercicios;

public class Reloj {
	private Fecha fechita;
	private Hora horita;
	
	public Reloj(Fecha fechita, Hora horita) {
		this.fechita=fechita;
		this.horita=horita;
	}
	
	public void incrementarReloj() {
		horita.incrementarTiempo();
		if(horita.getHora()==0 && horita.getMin()==0 && horita.getSeg()==0) {
			fechita.incrementarFecha();
		}
	}

}
