package migaraje;

public class Vehiculo {
	//enumerado clase falsa
	public enum Tipo{ COCHE, MOTO, CAMION, BUS}
	// tipo, asientos, peso, n de ruedas 
	Tipo tipo;
	int numPlazas;
	double peso;
	int numRuedas;
	public Vehiculo(Tipo tipo, int numPlazas, double peso){
		this.tipo = tipo;
		this.numPlazas = numPlazas;
		this.peso = peso;
	}
	@Override
	public String toString(){
		String s = "es un"+ tipo.name()+" que tiene "+ numPlazas+ ".";
		s+= "\n";
		return s;
	}
}

