package ejercicioescribiryleer;

import java.io.*;

public class EjercicioLecturaEscritura {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub4
		
		FileReader fr = new FileReader("letraMagoDeOz.txt");
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("textoTotalCaracteres.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String s = br.readLine();
		int total = 0;
		String totalCaracteres = "";
		while( s != null){
			
			int a  = s.length();
			s = br.readLine();
			total = a + total;
			
			System.out.println(total);
			totalCaracteres = Integer.toString(total);
			
		}
		bw.write("total de caracteres son: " + totalCaracteres);
		br.close();
		bw.close();
		
		//OTRA FORMA 
		/*int caracterASCII = br.read();
		int contador = 0;
		while(caracterASCII != -1){
			contador++;
			caracterASCII = br.read();
		}
		bw.write("He contado que en el fichero'letraMagoDeOz.txt' hay "+contador+" caracteres.");
		bw.close();*/
	}

}
