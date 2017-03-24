package primerproyecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModificarTamanoArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("ingresa las palabras que quieras y para terminar fin: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String leer = br.readLine();
		String[] leido = new String[0];
		while (!"fin".equals(leer)) {
			//calcula el tamano de leido
			int tam = leido.length;
			
			//asigno a un auxiliar el tamano de leido +1
			String[] aux = new String[tam + 1];
			for (int i = 0; i < leido.length; i++) {
				//voy recorriendo el arreglo y asigno el tamano de leido a aux
				aux[i] = leido[i];
			}
			//le asigno el tamano del aux a leido
			leido = aux;
			
			//anadir la nueva palabra a; array en la ultima posicion
			leido[leido.length -1 ] = leer;
			
			//leer la siguiente posiscion
			leer = br.readLine();
			
		}
		for (int i = 0; i < leido.length; i++) {
			System.out.println("leido en la posision "+ leido[i]);
		}
	}

}
