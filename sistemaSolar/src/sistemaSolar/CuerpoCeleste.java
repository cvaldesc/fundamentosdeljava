package sistemaSolar;

public class CuerpoCeleste {
	//atributos
	String nombre;
	double diametro;
	double superficie;
	double volumen;
	double masa;
	double densidad;
	double gravedad;
	double temperatura;
	
	//constructor
	public CuerpoCeleste(String nombre, double diametro, double superficie, double volumen, double masa, double densidad,
			double gravedad, double temperatura) {
		super();
		this.nombre = nombre;
		this.diametro = diametro;
		this.superficie = superficie;
		this.volumen = volumen;
		this.masa = masa;
		this.densidad = densidad;
		this.gravedad = gravedad;
		this.temperatura = temperatura;
	}
	
}
