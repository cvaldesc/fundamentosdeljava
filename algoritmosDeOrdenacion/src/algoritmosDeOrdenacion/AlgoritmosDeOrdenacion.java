package algoritmosDeOrdenacion;

public class AlgoritmosDeOrdenacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = {5,6,1,0,3};
		int[] ordenadoBurbuja = metodoOrdenarBurbuja(numeros);
		System.out.println("el array de numeros ordenados: ");
		for (int i = 0; i < ordenadoBurbuja.length; i++) {
			System.out.print(ordenadoBurbuja[i]+"\n");
		}
	}

	public static int[] metodoOrdenarBurbuja(int[] numeros) {
		// TODO Auto-generated method stub
		for (int i = 1; i < numeros.length; i++) { //para recorrer desde el 2 numero
			System.out.println("iteracion "+ i +" numeros i: "+numeros[i]);
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
				System.out.println(numeros[j]);
			}
			System.out.println(numeros[i]+ "valor i--");
		}
		
		
		return numeros;
	}

}