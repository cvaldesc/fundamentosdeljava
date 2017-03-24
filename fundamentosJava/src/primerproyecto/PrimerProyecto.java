package primerproyecto;

import static java.lang.Math.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimerProyecto {

	public static void main(String[] args) {

		// ecuacion de primer grado
		// ax + b = 0 -> ax = -b -> x = -b/a
		int a = 1, b = -5;
		double x = (double) -b / a;
		System.out.println("ecuacion 1er grado " + x);

		// ecuacion de segundo grado
		// a(x^2) + bx + c = 0
		// x1 = (-b + sqrt (b^2 - 4ac)) / 2a
		// x2 = (-b - sqrt (b^2 - 4ac)) / 2a

		int c = 6;
		double x1, x2;
		// calcular b^2 -4ac
		x1 = pow(b, 2) - (4 * a * c);
		// calcular raiz cuadrada de (b^2 - 4ac)
		x1 = sqrt(x1);
		x2 = x1;
		// calcular -b + raiz
		x1 = -b + x1; // otras formas x1 = x1-b; x1-= b
		// calcular x1
		x1 = (double) x1 / (2 * a);
		// imprimir solucion
		System.out.println("solucion 1 de la ecuacion 2do grado " + x1);

		// solucion 2
		// x2 = pow(b,2) - (4*a*c);
		// x2 = sqrt(x2);
		x2 = -b - x2;
		x2 = (double) x2 / (2 * a);
		System.out.println("solucion 2 de la ecuacion 2do grado " + x2);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		System.out.print("escribe algo para leerlo a travez del teclado :");
		try {
			s = br.readLine(); // readline para leer liena

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("error de lectura");
		}
		System.out.println("has escrito: " + s);
		
		

	}

}
