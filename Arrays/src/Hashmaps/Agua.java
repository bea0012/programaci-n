package Hashmaps;

public class Agua extends Casilla{
	
	private String id;

	public Agua(String id) {
		this.id = "Agua";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public boolean tocado() {
		return false;
		
	}
	
	
	
	

}
