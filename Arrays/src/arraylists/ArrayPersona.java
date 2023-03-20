package arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayPersona {
	
		private ArrayList<Persona> personas = new ArrayList<Persona>();
		
		public ArrayPersona() {
			this.personas=new ArrayList<Persona>();
		}
		
		public void añadirPersona(Persona pers) {
			this.personas.add(pers);
		}

		public ArrayList<Persona> getPersonas() {
			return personas;
		}

		public void setPersonas(ArrayList<Persona> personas) {
			this.personas = personas;
		}
		
		public String consultar(int index) {
			 return this.personas.get(index).toString();
		 }
		public String consultarNombre(int index) {
			 return this.personas.get(index).getNombre();
		 }
		 public String consultarApellido(int index) {
			 return this.personas.get(index).getApellido();
		 }
		
		 public String consultar(Persona pers) {
			 int index = this.personas.indexOf(pers);
			 return this.personas.get(index).toString();
		 }
		 
		 public String consultarNombre(Persona pers) {
			 int index = this.personas.indexOf(pers);
			 return this.personas.get(index).getNombre();
		 }
		 
		 public String consultarApellido(Persona pers) {
			 int index = this.personas.indexOf(pers);
			 return this.personas.get(index).getApellido();
		 }
		 
		 public ArrayList<Persona> consultar() {
			 return this.personas;
		 }
		 
		 public ArrayList<String> consultarNombre() {
			 ArrayList<String> nombre = new ArrayList<String>();
			 for(int i=0; i<this.personas.size(); i++) {
				 nombre.add(this.personas.get(i).getNombre());
			 }
			 return nombre;
		 }
		 
		 public ArrayList<String> consultarApellido() {
			 ArrayList<String> apellido = new ArrayList<String>();
			 for(int i=0; i<this.personas.size(); i++) {
				 apellido.add(this.personas.get(i).getNombre());
			 }
			 return apellido;
		 }
		 
		 public void voltear() {
			 Collections.reverse(personas);
			 personas.toString();
		 }

		
}
