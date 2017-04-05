package repeticionesCaracteres;

import java.io.*;

public class RepeticionesCaracteres {
	static String cancion = "letraMagoDeOz.txt";
	static String repeticionesLetras = "repeticiones.txt";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		programa();
	}
	public static void programa(){
		char caracteres[] = new char[0];
		int repeticiones[] = new int[0];
		try {
			FileReader fr = new FileReader(cancion);
			BufferedReader br = new BufferedReader(fr);
			int caracterASCII = br.read();
			while (caracterASCII != -1 ) {
				int i = 0;
				boolean encontrado = false;
				
				while (i < caracteres.length && !encontrado) {
					if(caracteres[i] == (char) caracterASCII){
						i--;
						encontrado = true;
						
					}
					i++;
					
				}
				if (encontrado) {
					repeticiones[i]++;
				}else{
					caracteres = ampliarCaracteres(caracteres, (char)caracterASCII);
					repeticiones = ampliarRepeticiones(repeticiones); 
				}
				caracterASCII = br.read();
				
			}
			File f = new File(repeticionesLetras);
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String s = "";
			for (int i = 0; i < caracteres.length; i++) {
				System.out.println(caracteres[i]);
				/*if(caracteres[i] == CR){
					s = "El caracter 'intro' ha aparecido "+repeticiones[i]+" veces.\n";
				}else{
					s = "El caracter '"+ caracteres[i]+"' ha aparecido "+repeticiones[i]+" veces.\n";
				}*/
				s = "El caracter '"+ caracteres[i]+"' ha aparecido "+repeticiones[i]+" veces.\n";
				
				//System.out.println(s);
				bw.write(s);
			}
			bw.close();
			
			
		} catch (IOException ioe) { 
			// TODO: handle exception
			System.err.println("Ha habido un error en el fichero de lectura");
			
		}
	}
	public static char[] ampliarCaracteres(char[] caracteres, char nuevo){
		char[] auxCaracteres = new char[caracteres.length+1];
		
		for (int i = 0; i < caracteres.length; i++) {
			auxCaracteres[i] = caracteres[i];
		}
		auxCaracteres[auxCaracteres.length-1] = nuevo;
		return auxCaracteres;
		
	}
	public static int[] ampliarRepeticiones( int[] repeticiones){
		int[] auxRepeticiones = new int[repeticiones.length+1];
		
		for (int i = 0; i < repeticiones.length; i++) {
			auxRepeticiones[i] = repeticiones[i];
		}
		auxRepeticiones[auxRepeticiones.length-1]= 1;
		return auxRepeticiones;
	}
}
