package escribirObjetos;

import java.io.*;

public class EscribirObjetos {

	static String fichero = "escribirObjetos.txt";
	public static void main(String[] args) {
		programa();
	}
	public static void programa(){
		File f = new File(fichero);
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		FileInputStream fis;
		ObjectInputStream ois;
		
		
		Persona p1 = new Persona(87654321, 'A', "cristian valdes", 123456789);
		Persona p2 = new Persona(12356478, 'B', "Andres Asedo", 685978597);
		try {
			fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);			
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.close();
			
			fis = new FileInputStream(fichero);
			ois = new ObjectInputStream(fis);
			try {
				p1 = (Persona) ois.readObject();
				p2 = (Persona) ois.readObject();
				System.out.println(p1.toString());
				System.out.println(p2.toString());
			} catch (ClassNotFoundException e) {
				System.err.println("no se ha encotrado la clase persona.");
			}
			ois.close();
		} catch (IOException e) {
			System.err.println("el programa ha dado un error.");
		}
	}

}
