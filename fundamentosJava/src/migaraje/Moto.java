package migaraje;

import migaraje.Vehiculo.Tipo;

public class Moto extends Vehiculo{
	// atributos
	String marca;
	double deposito;
	int caballos;
	boolean sidecar;
	
	//constructores
	public Moto(Vehiculo v, String marca, double deposito, int caballos, boolean sidecar){
		super(v.tipo, v.numPlazas, v.peso);
		this.marca = marca;
		this.deposito = deposito;
		this.caballos = caballos;
		this.sidecar = sidecar;
	}
	public Moto(Tipo tipo, int numPlazas ,double peso, String marca, double deposito, int caballos, boolean sidecar){
		super(tipo, numPlazas, peso);
		this.marca = marca;
		this.deposito = deposito;
		this.caballos = caballos;
		this.sidecar = sidecar;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "los datos de la moto son los siguientes:\n";
		s+= "Marca: " +marca+"\n";
		s+= "capacidad de la moto : " +deposito+"\n";
		s+= "caballos: " +caballos+"\n";
		if(this.sidecar){
			s+= "la moto tiene sidecar \n";
		}
		return s;
	}
}
