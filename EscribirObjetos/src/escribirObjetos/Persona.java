package escribirObjetos;

import java.io.Serializable;

public class Persona implements Serializable{

	int dni;
	char letra;
	String nombre;
	int telefono;
	
	public Persona(int dni, char letra, String nombre, int telefono){
		this.dni = dni;
		this.letra = letra;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	@Override
	public String toString(){
		String s = "";
		s += this.nombre + " Con DNI "+this.dni+" "+this.letra+" con telefono "+this.telefono+ ".";
		return s;
	}

}
