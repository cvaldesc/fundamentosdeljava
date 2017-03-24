package migaraje;

public class MiGaraje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array de vehicles
		Vehiculo[] vehiculos = new Vehiculo[5];
		
		Coche c1 = new Coche(Vehiculo.Tipo.COCHE, 5, 400, "lamborgini", "Aventur", "negro", 70, true);
		vehiculos[0] = c1;
		
		Coche c2 = new Coche(Vehiculo.Tipo.COCHE, 2, 600, "ford", "mustang", "gris", 60, false);
		vehiculos[1] = c2;
		
		Moto m1 = new Moto(Vehiculo.Tipo.MOTO,2,80, "kawasaki", 30.5, 120,false);
		vehiculos[2] = m1;
		
		Moto m2 = new Moto(Vehiculo.Tipo.MOTO,3,60, "kawasaki", 30.5, 120,true);
		vehiculos[3] = m2;
		
		Vehiculo v = new Vehiculo(Vehiculo.Tipo.BUS, 30, 1000);
		vehiculos[4]= v;
		
		for (int i = 0; i < vehiculos.length; i++) {
			System.out.println(vehiculos[i].toString());
		}
		
	}

}
