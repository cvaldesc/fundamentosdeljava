package primerproyecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListPalabras {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//declarar el array list
		ArrayList <String> palabras = new ArrayList<>();
		//leer la primera palabra
		System.out.println("ingrese palabra y para terminar fin: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String leer = br.readLine();
		//evaluar que no venga fin
		while (!"fin".equals(leer)) {
			//agregar una palabra al arreglo
			palabras.add(leer);
			//lee la nueva palabra
			leer = br.readLine();
		}
		//lee el arreglo plabra
		for (int i = 0; i < palabras.size(); i++) {
			//imprime el arreglo
			System.out.println(palabras.get(i));
		}
	}

}
