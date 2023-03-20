package Hashmaps;

public abstract class Casilla {
	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public abstract boolean tocado();
	
	

}
