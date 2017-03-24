package sistemaSolar;

public class Satelite {
	//nombre
	String nombre;
	// radio
	double radio;
	//gravedad
	double gravedad;
	
	public Satelite( String nombre, double radio, double gravedad) {
		this.nombre = nombre;
		this.radio = radio;
		this.gravedad = gravedad;
		
	}
	@Override 
	public String toString(){
		String s = "";
		s += "el satelite "+ this.nombre + " oribita a una distancia de "+ this.radio+ " de su platena. \n"+ " tiene una gravedad de "+this.gravedad+ ".\n";
		return s;
	}
}
