package lecturafichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFichero {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try{
			FileReader fr = new FileReader("fichero.txt");
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			while( s != null){
				System.out.println(s);
				s = br.readLine();
			}
					
			
			//String s = br.readLine();
			//System.out.println(s);
			
		}catch(FileNotFoundException e){
			System.err.println("el fichero no se ha podido encontrar: " + e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
