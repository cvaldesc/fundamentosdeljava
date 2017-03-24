package sistemaSolar;

public class Planeta extends CuerpoCeleste{
	//atributos
	double periodoOrbital;
	double velocidadOrbital;
	double radioOrbital;
	double periodoRotacional;
	String composicionAtmosfera;
	Satelite[] satelites;
	
	public Planeta(String nombre, double diametro, double superficie, double volumen, double masa, double densidad,
			double gravedad, double temperatura, double periodoOrbital, double velocidadOrbital, double radioOrbital,
			double periodoRotacional , String composicionAtmosfera) {
		super(nombre, diametro, superficie, volumen, masa, densidad, gravedad, temperatura);
		this.periodoOrbital = periodoOrbital;
		this.velocidadOrbital = velocidadOrbital;
		this.radioOrbital = radioOrbital;
		this.periodoRotacional = periodoRotacional;
		this.composicionAtmosfera = composicionAtmosfera;
		this.satelites = new Satelite[0];
	}
	
	public void setSatelites( Satelite[] satelites) {
		this.satelites = satelites;

	}
	public void setSatelite(Satelite satelite){
		Satelite[] auxiliar = new Satelite[this.satelites.length +1];
		for (int i = 0; i < this.satelites.length; i++) {
			auxiliar[i] = satelites[i];		
		}
		auxiliar[auxiliar.length -1] = satelite;
		this.satelites = auxiliar;
	}
	
	@Override
	public String toString(){
		String s = "";
		
		s += "\nEl planeta "+ this.nombre + " tiene las caracteristicas siguiente:\n";
		s+= " - Diametro " +this.diametro + " km.\n";
		s+= " - Superficie " +this.superficie + " km^2.\n";
		s+= " - volumen " +this.volumen + " km^3.\n";
		s+= " - Masa " +this.masa + " kg.\n";
		if("Saturno".equals(this.nombre)){
			s+= " - Densidad " +this.densidad + " kg/m^3.\n";
		}else{
			s+= " - Densidad " +this.densidad + " g/cm^3.\n";
		}
		
		s+= " - Gravedad " +this.gravedad + " m/s^2.\n";
		s+= " - Temperatura " +this.temperatura + " C.\n\n";
		s+= " - periodo orbital " +this.periodoOrbital + " Km/s.\n";
		s+= " - velocidad orbital media  " +this.temperatura + " Km/s.\n";
		return s;
		
	}
	
	

}
