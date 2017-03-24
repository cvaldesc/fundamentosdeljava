package sistemaSolar;

import java.io.IOException;
import static java.lang.Math.pow;

public class SistemaSolar {
	
	public static Estrella sol;
	public static Planeta mercurio, venus, tierra, marte, jupiter, saturno, urano, neptuno;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		imprimirMenu();
		
		//menu
		char salir = 's';
		char intro = '\n';
		
		crearSistemaSolar();
		
		System.out.print("introduce una opcion: ");
		char opcion = (char) System.in.read();
		
		while (opcion != salir) {
			
			
			char segundoCaracter = (char) System.in.read();
			
			
			while(segundoCaracter != intro){
				
				//opcion = 'z';
				segundoCaracter = (char) System.in.read();
				
			}
			
			switch (opcion){
					
				case 'a': 
					System.out.println("el sistema sola"
							+"\nel sistema sola bla bla");
					break;
				case 'b': 
					System.out.println(sol.toString());
					break;
				case 'c':
					verPlaneta();
					break;
				case 'd':
					verSatelites();
					break;
				case 'e': 
					break;
				case 'f':
					break;
				case 'g':
					break;
				case 'h':
					break;
				case 'i': 
					imprimirMenu(); 
					break;
				default: 
					System.out.println("la opcion introducida no es correcta.");
					break;
			}
			
			System.out.print("introduce una opcion: ");
			opcion = (char) System.in.read();
		}
		System.out.println("la ejecucion finalizo");
	}
	
	private static void verSatelites() throws IOException {
		verMenuSatelites();
		System.out.println("\nintroduce una opcion de satelites: ");
		char opcion = (char) System.in.read();
		char intro = (char) System.in.read();
		if (intro != '\n'){
			System.out.println("if");
			switch (opcion) {
				case 'z':
					imprimirSatelitesDePlaneta(mercurio);
					break;
				case 'j':
					imprimirSatelitesDePlaneta(tierra);
				case 'i':
					
					break;
				default:
					System.out.println("la opcion intrudcida no es valida.\n");
					verSatelites();
					break;
			}
		}else{
			System.out.println("else");
			while (intro != '\n') {
				intro = (char) System.in.read();
				
			}
			System.out.println("la opcion introducida no es valida");
			verSatelites();
		}
		
	}
	public static void imprimirSatelitesDePlaneta(Planeta planeta){
		if (planeta.satelites.length == 0) {
			System.out.println(planeta.nombre + " no tiene satelites");
		}else{
			System.out.println("los satelites de la "+ planeta.nombre + " son");
			for (int j = 0; j < planeta.satelites.length; j++) {
				System.out.println(planeta.satelites[j].toString());
			}
		}
	}
	public static void verPlaneta() throws IOException{
		verMenuPlaneta();
		System.out.println("\nintroduce una opcion: ");
		char opcion = (char) System.in.read();
		char intro = (char) System.in.read();
		if (intro != '\n'){
			System.out.println("if");
			switch (opcion) {
				case 'z':
					System.out.println(mercurio.toString());
					break;
				case 'j':
					System.out.println(tierra.toString());
				case 'i':
					System.out.println(tierra.toString());
					break;
				default:
					System.out.println("la opcion intrudcida no es valida.\n");
					verPlaneta();
					break;
			}
		}else{
			System.out.println("else");
			while (intro != '\n') {
				intro = (char) System.in.read();
				
			}
			System.out.println("la opcion introducida no es valida");
			verPlaneta();
		}
	}
	
	

	private static void crearSistemaSolar() {
		crearSol();
		CrearPlanetas();
		CrearSatelites();
		
	}

	private static void CrearSatelites() {
		//mercurio y venus no tienen satelite
		//tierra tiene la luna
		Satelite[] Satelites = new Satelite[1];
		Satelites[0] = new Satelite("luna", 384400, 10.62);
		tierra.setSatelite(Satelites[0]);
		
	}

	public static void crearSol(){
		double superficie = pow(10, 12);
		superficie = 6.0877 * superficie;
		
		double volumen = pow(10, 18);
		volumen = 1.4123* volumen;
		
		double masa = pow(10, 30);
		masa = 1.9891 * masa;
		
		sol = new Estrella("sol", 1392000, superficie, volumen, masa, 1411, 274, 5505, "sistema solar");
	}
	public static void CrearPlanetas() {
		double superficie = 510072000;
		double volumen = 1.08321 * pow(10, 12);
		double masa = 5.9736 * pow(10,24);
		double diametro = 12756;
		double densidad = 9.8;
		double gravedad = 9.8;
		double temperatura = 14.05;
		double periodoOrbital = 365.2563630004;
		double velocidad = 107200;
		double radio = 149597870.691;
		double periodoRotacional = 1;
		String composicion = "78 % nitrogeno. 21 % oxigeno, 1 % argon";
		
		tierra = new Planeta("Tierra", diametro, superficie, volumen, masa, densidad,gravedad,temperatura,periodoOrbital, velocidad,radio ,periodoRotacional, composicion  );
		
		superficie = 4.6 * pow(10,8);
		 volumen = 9.28 * pow(10, 11);
		 masa = 4.896 * pow(10,24);
		 diametro = 12100;
		 densidad = 5.24;
		 gravedad = 8.87;
		 temperatura = 463.85;
		 periodoOrbital = 0.615 * 365.256363004;
		 velocidad = 35.0214;
		 radio = 10808930;
		 periodoRotacional = 243;
		 composicion = "96 % c02, 3 % nitrogeno. 0.1 % agua";
		
		mercurio = new Planeta("mercurio", diametro, superficie, volumen, masa, densidad,gravedad,temperatura,periodoOrbital, velocidad,radio ,periodoRotacional, composicion  );

		
	}
	private static void verMenuSatelites() {
		// TODO Auto-generated method stub
		System.out.println("\n********************** MENU ********************************");
		System.out.println("opcion z: info satelites de mercurio");
		System.out.println("opcion j: info satelites de tierra");
		
	}
	private static void verMenuPlaneta() {
		// TODO Auto-generated method stub
		System.out.println("\n********************** MENU ********************************");
		System.out.println("opcion z: info mercurio");
		System.out.println("opcion j: info tierra");
		
	}
	public static void imprimirMenu(){
		System.out.println("\n********************** MENU ********************************");
		System.out.println("opcion a: info general del sistema solar ");
		System.out.println("opcion b: info del sol ");
		System.out.println("opcion c: info general de los planetas");
		System.out.println("opcion d: info general de los satelites");
		System.out.println("opcion e: info sobre otros cuerpos celestes(asteroides, cometas y meteoroides)");
		System.out.println("opcion f: ver informacion sobre un planeta");
		System.out.println("opcion g: sistema solar mas cercano");
		System.out.println("opcion h: composicion de las estrellas");
		System.out.println("opcion i: imprimir menu");
		System.out.println("opcion s: programa cerro");
		
	}
	

}
