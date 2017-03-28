package escrituraFichero;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraFichero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("escribir.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String escribir = " esto es lo que quiero escribir en el fichero";
		bw.write(escribir);
		bw.close();
	}

}
