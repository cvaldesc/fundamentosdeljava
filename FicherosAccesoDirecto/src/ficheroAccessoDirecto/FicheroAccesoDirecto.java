package ficheroAccessoDirecto;

import java.io.*;

public class FicheroAccesoDirecto {

	public static String fichero = "fichero.txt";
	
	public static void main(String[] args) throws IOException {
		// escribir "escribir"
		//String datos = "Estoy probano el fichero de acceso directo";
		char datos = 'a';
		
		//escribir ocupa "longitud"
		//int longitud = datos.length();
		int longitud = 5;
		
		//escribimos
		escribir(datos,fichero, 0);
		
		//String leido = leer(fichero, longitud,0);
		//leido lo escrito
		char leido = leer(fichero, longitud,0);
		
		//imprimimos lo leido
		System.out.println(leido);
		
		
	}
	public static void escribir(char datos,String fichero, int inicio ) throws IOException{
		RandomAccessFile raf = new RandomAccessFile(fichero, "rw");//abrir fichero
		raf.seek(inicio);//posicionamiento donde vamos a escribir
		raf.writeChar(datos);//escribir en bytes
		raf.close();
	}
	
	public static char leer(String fichero, int longitud, int inicio) throws IOException{
		//byte bytes[] = new byte[longitud];
		char leer;
		RandomAccessFile raf = new RandomAccessFile(fichero, "r");
		raf.seek(inicio);
		leer = raf.readChar();
		raf.close();
		//String leido = new String(bytes);
		return leer;
	}

}
