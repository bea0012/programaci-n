package simulacro;

public abstract class Profesor {
	
	protected String nombre;
	protected int edad;
	protected String asignatura;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	public abstract String fraseCarasterística(String frase);
	public abstract String horaDeLlegada(String hora);
	public abstract boolean descansito(boolean descansito);

}
