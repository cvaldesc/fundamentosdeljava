package algoritmosDeOrdenacion;

import java.util.Random;

public class AlgoritmosDeOrdenacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] numeros = {5,6,1,0,3};
		int[] numeros = new int[100000];
		for (int i = 0; i < numeros.length; i++) {
			Random r = new Random();
			numeros[i] = r.nextInt(10000000);
		}
		long start, end;
		
		
		start = System.currentTimeMillis();
		int[] ordenadoBurbuja = metodoOrdenarBurbuja(numeros);
		end = System.currentTimeMillis();
		System.out.println("algoritmo burbuja");
		//imprimir(ordenadoBurbuja);
		time(start, end);
		
		start = System.currentTimeMillis();
		int[] ordenadoBurbujaMejorado = metodoOrdenarBurbujaMejorado(numeros);
		end = System.currentTimeMillis();
		System.out.println("algoritmo burbuja");
		//imprimir(ordenadoBurbujaMejorado);
		time(start, end);
		
		start = System.currentTimeMillis();
		int[] ordenadoInsercion = metodoOrdenarInsercion(numeros);
		end = System.currentTimeMillis();
		System.out.println("algoritmo insercion");
		//imprimir(ordenadoInsercion);
		time(start, end);
		
		start = System.currentTimeMillis();
		int[] ordenadoSeleccion = metodoOrdenarSeleccion(numeros);
		end = System.currentTimeMillis();
		System.out.println("algoritmo seleccion");
		//imprimir(ordenadoSeleccion);
		time(start, end);
		
		start = System.currentTimeMillis();
		int[] ordenadoMezcla = mergesort(numeros, 0, numeros.length);
		end = System.currentTimeMillis();
		System.out.println("algoritmo mergesort");
		//imprimir(ordenadoMezcla);
		time(start, end);
		
		start = System.currentTimeMillis();
		int[] ordenadoQuick = quicksort(numeros, 0, numeros.length -1);
		end = System.currentTimeMillis();
		System.out.println("algoritmo quicksort");
		//imprimir(ordenadoQuick);
		time(start, end);
		
		
	}
	public static int[] quicksort(int[] numeros, int a, int b){
		int desde = a , hasta = b;
		int pivote = numeros[(desde+hasta)/2];
		int aux;
		while(desde <= hasta){
			while(numeros[desde]< pivote){
				desde++;
			}
			while(numeros[hasta] > pivote){
				hasta--;
			}
			if(desde <= hasta){
				aux = numeros[desde];
				numeros[desde]= numeros[hasta];
				numeros[hasta] = aux;
				desde++;
				hasta--;
			}
		}
		if(a < hasta){
			quicksort(numeros,a,hasta);
		}
		if(desde < b){
			quicksort(numeros,desde,b);
		}
		return numeros;
	}
	public static int[] mergesort(int[] numeros, int init, int n){
		//dividir
		int n1, n2;
		if(n > 1){
			n1 = n/2;
			n2 = n - n1;
			mergesort(numeros, init, n1); //para volver a aplicar mergesort en los elementos del primer subgrupo
			mergesort(numeros, init+n1, n2);//para volver a aplicar mergesort en los elementos del segundo subgrupo
			numeros = merge(numeros, init , n1, n2);
			
		}
		return numeros;
	}
	
	public static int[] merge(int[] numeros, int init, int n1, int n2){
		int[] auxiliar = new int[n1+n2];
		int temp= 0, temp1 = 0, temp2 = 0;
		while( (temp1 < n1) && (temp2 < n2)){
			if( numeros[init+temp1] < numeros[init+n1+ temp2]){
				auxiliar[temp++] = numeros[init+(temp1++)];
			}else{
				auxiliar[temp++] = numeros[init+(temp1++)];
			}
		}
		while(temp1 < n1){
			auxiliar[temp++] = numeros[init + (temp1++)];
		}
		while(temp2 < n2){
			auxiliar[temp++] = numeros[init + n1 +(temp2++)];
		}
		for(int i= 0; i < n1+n2; i++){
			numeros[init + i] = auxiliar[i];
		}
		return numeros;
	}
	
	public static int[] metodoOrdenarSeleccion(int[] numeros){
		int menor, posicion;
		for(int i = 0; i < numeros.length -1; i++){
			menor = numeros[i];
			posicion = i;
			for (int j = i+1; j < numeros.length; j++) {
				if (menor > numeros[j]) {
					menor = numeros[j];
					posicion = j;
				}
			}
			if (i != posicion) {
				numeros[posicion] = numeros[i];
				numeros[i] = menor;
			}
		}
		return numeros;
	}
	public static int[] metodoOrdenarInsercion(int[] numeros){
		int num, j;
		for (int i = 1; i < numeros.length; i++) {
			num = numeros[i];
			j = i - 1;
			while ((numeros[j] > num)&& (j >= 0 )) {
				numeros[j+1] = numeros[j];
				j--;
				
			}
			numeros[j+1] = num;
		}
		return numeros;
	}
	public static int[] metodoOrdenarBurbuja(int[] numeros) {
		// TODO Auto-generated method stub
		for (int i = 1; i < numeros.length; i++) { //para recorrer desde el 2 numero
			//System.out.println("iteracion "+ i +" numeros i: "+numeros[i]);
			for (int j = 0; j < numeros.length - 1; j++) {//para recorrer menos el ultimo numero
				//System.out.println(" iteracion "+ j+" numeros j: "+ numeros[j] + " numeros j+1: "+ numeros[j+1]);
				
				//comparacion
				if(numeros[j] > numeros[j+1]){
					
					//intercambiar los numeros
					int aux = numeros[j+1];// guardo el numero que es menor al numero que interactuo 
					numeros[j+1]=numeros[j]; //cambio de posicion j a j+1
					numeros[j]= aux; // cambio de posicion j+1 a j
					//System.out.println("  if valor = aux "+ aux+ " numeros[j]= "+ numeros[j] + " j+1 " + numeros[j+1]);
					//System.out.println(numeros[j]+ " "+ numeros[j+1]);
				}
				//System.out.println(numeros[j]);
			}
			//System.out.println(numeros[i]+ "valor i--");
		}
		
		
		return numeros;
	}
	public static int[] metodoOrdenarBurbujaMejorado(int[] numeros) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numeros.length; i++) { //para recorrer desde el 2 numero
			//System.out.println("iteracion "+ i +" numeros i: "+numeros[i]);
			for (int j = 0; j < i; j++) {//para recorrer menos el ultimo numero
				//System.out.println(" iteracion "+ j+" numeros j: "+ numeros[j] + " numeros j+1: "+ numeros[j+1]);
				
				//comparacion
				if(numeros[j] > numeros[j+1]){
					
					//intercambiar los numeros
					int aux = numeros[j+1];// guardo el numero que es menor al numero que interactuo 
					numeros[j+1]=numeros[j]; //cambio de posicion j a j+1
					numeros[j]= aux; // cambio de posicion j+1 a j
					//System.out.println("  if valor = aux "+ aux+ " numeros[j]= "+ numeros[j] + " j+1 " + numeros[j+1]);
					//System.out.println(numeros[j]+ " "+ numeros[j+1]);
				}
				//System.out.println(numeros[j]);
			}
			//System.out.println(numeros[i]+ "valor i--");
		}
		
		
		return numeros;
	}
	
	public static void time(long start, long end){
		System.out.println("Ha tardado en ordenarse "+ (end - start)+" ms. \n");
	}
	public static void imprimir(int[] numeros){
		System.out.println("el array de numeros ordenados: {");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+", ");
		}
		System.out.print(numeros[numeros.length-1]+"}\n");
	}
}
