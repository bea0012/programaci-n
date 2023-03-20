package simulacro;

public interface iLista {
	
	public int[] getArrayEnteros();
	public void setArrayEnteros(int [] array);
	public int getCapacidad();
	public void setCapacidad(int capacidad);
	public boolean isFull();
	public boolean isEmpty();
	public void Push(int num);
	public int pop();
}
