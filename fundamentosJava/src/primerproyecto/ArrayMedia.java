package primerproyecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayMedia {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		ArrayList <Integer> numeros = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("ingresa numeros y para finalizar ingresa 0");
		int num = Integer.parseInt(br.readLine());
		
		int suma = 0;
		double media = 0;
		while (num != 0) {
			numeros.add(num);
			
			num = Integer.parseInt(br.readLine());
			
			
		}
		for (int i = 0; i < numeros.size(); i++) {
			suma = suma + numeros.get(i);
			System.out.println(numeros.size() - 1);
			
			
		}
		int size =  numeros.size();
		System.out.println(suma + " " + size);
		media = (double)suma / size;
		System.out.println("la media es : " + media );
	}

}
