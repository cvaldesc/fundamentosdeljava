package sistemaSolar;

public class Estrella extends CuerpoCeleste{
	/*String nombre;
	double diametro;
	double superficie;
	double volumen;
	double masa;
	int densidad;
	int gravedad;
	int temperatura;*/
	String galaxia;
	
	//Contructores
	public Estrella(String nombre, double diametro, double superficie, double volumen, double masa, int densidad, int gravedad, int temperatura, String galaxia){
		super( nombre, diametro, superficie, volumen, masa, densidad, gravedad, temperatura);
		this.galaxia = galaxia;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "";
		s+= "la estrella "+ nombre+" pertenece a la galaxia "+ galaxia + ".\n";
		s+= "Sus caracteristicas son: \n";
		s+= " - Diametro " +diametro + " km.\n";
		s+= " - Superficie " +superficie + " km^2.\n";
		s+= " - volumen " +volumen + " km^3.\n";
		s+= " - Masa " +masa + " kg.\n";
		s+= " - Densidad " +densidad + " kg/m^3.\n";
		s+= " - Gravedad " +gravedad + " m/s^2.\n";
		s+= " - Temperatura " +temperatura + " C.\n\n";
		return s;
	}
	
}
