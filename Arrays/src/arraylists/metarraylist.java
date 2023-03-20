package arraylists;

import java.util.ArrayList;

public class metarraylist {
	private ArrayList<ArrayList<Integer>> metarray;

	public metarraylist() {
		this.metarray = new ArrayList<ArrayList<Integer>>();
	}

	public ArrayList<ArrayList<Integer>> getMetarray() {
		return metarray;
	}

	public void setMetarray(ArrayList<ArrayList<Integer>> metarray) {
		this.metarray = metarray;
	}
	
	public void rellenar() {
		for(int i=0; i<3; i++) {
			this.metarray.add(new ArrayList<Integer>());
		}for(int j=0; j<3; j++) {
			this.metarray.get(j).add((int) Math.random()*10);
		}
	}
	
	
	
	
	
	
}
