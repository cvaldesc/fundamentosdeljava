package rafobjetos;

import java.io.IOException;
import rafobjetos.Puntos2D;

public class RAFObjetos {
	public static String fichero = "fichero.txt";
	
	public static void main(String[] args) throws IOException {
		
		
		Puntos2D p = new Puntos2D(5, 6);
		Puntos2D q = new Puntos2D();
		p.escribirPuntos( fichero, 0);
		q = p.leerPuntos(fichero, 0);
		System.out.println(q.toString());
	}

}
