package primerproyecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EjercicioArrayMinimoMayor {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		ArrayList <Integer> numeros = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("ingresa numeros y para finalizar ingresa 0");
		int num = Integer.parseInt(br.readLine());
		int mayor = 0, minimo = 0;
		while (num != 0) {
			numeros.add(num);
			
			num = Integer.parseInt(br.readLine());
			
			
		}
		for (int i = 0; i < numeros.size(); i++) {
			
			
				if( numeros.get(i) > mayor){
					mayor = numeros.get(i);
				}
				if(minimo == 0){
					minimo = numeros.get(i);
					
				}else {
					if(numeros.get(i) < minimo){
						minimo = numeros.get(i);
					}
				}
				
			
		}
		System.out.println(" mayor: "+ mayor + " menor: "+ minimo);
		
	}

}
