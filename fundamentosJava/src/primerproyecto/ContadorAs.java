package primerproyecto;

import java.io.IOException;

public class ContadorAs {
	public static void main(String[] args) throws Exception, IOException {
		System.out.println("introduce lo que queires acaba con un '.' :");
		char letra = (char) System.in.read();
		int contador = 0;
		char[] leido = new char[0];
		
		while (letra != '.') {
			char[] auxi = new char[leido.length +1];
			for (int i = 0; i < leido.length; i++) {
				auxi[i] = leido[i];
			}
			auxi[auxi.length -1] = letra;
			leido = auxi;
			if (letra == 'a') {
				contador++;
			}
			letra = (char) System.in.read();
			
		}
		System.out.println("la sentencia leida es: " );
		for (int i = 0; i < leido.length; i++) {
			System.out.print(""+leido[i]);
		}
		System.out.println("\nhe leido "+ contador + " as.");
	}
}
