package migaraje;

public class Coche extends Vehiculo{
	

	// atributos del coche
	String marca;
	String modelo;
	String color;
	int deposito;
	boolean descapotable;
	
	public Coche(Vehiculo v, String marca, String modelo, String color, int deposito, boolean descapotable) {
		super(v.tipo, v.numPlazas, v.peso);
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.deposito = deposito;
		this.descapotable = descapotable;
	}
	public Coche(Tipo tipo, int numPlazas, double peso, String marca, String modelo, String color, int deposito, boolean descapotable) {
		super(tipo, numPlazas, peso);
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.deposito = deposito;
		this.descapotable = descapotable;
	}
	@Override
	public String toString() {
		String s = "Los datos del coche son los siguientes: \n";
		s += "marca "+ this.marca +"\n";
		s += "modelo "+ this.modelo +"\n";
		s += "color "+ this.color +"\n";
		s += "capacidad del deposito "+ this.deposito + " l." +"\n";
		if(this.descapotable){
			s += "es descapotable "+"\n";
		}else{
			s += "no es descapotable "+"\n";
		}
		return s;
	}
}
