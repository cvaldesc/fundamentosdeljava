package rafobjetos;

import static java.lang.Math.*;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Puntos2D {
	//atributos
	private int x;
	private int y;
	//constructor
	public Puntos2D(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Puntos2D(){
		this.x = 0;
		this.y = 0;
	}
	//imprimir
	public String toString(){
		String s = "{"+ x +" . "+ y +"}";
		
		return s;
	}
	// raiz {x^2 + y^2}
	public double modulo(){
		return (double) sqrt( pow(x,2) + pow(y,2));
	}
	
	//calcular distancia entre dos punto 
	//d{p1, p2} = raiz ((x2 - x1)^2 + (y2-y1)^2)
	// p2 = p, p1= punto de mi clase
	public double distancia( Puntos2D p){
		double dx = pow(p.x - this.x,2);
		double dy = pow(p.y - this.y,2);
		return sqrt(dx + dy);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void escribirPuntos(String fichero,int inicio) throws IOException{
		RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
		raf.seek(inicio);
		raf.writeInt(this.x);
		raf.writeInt(this.y);
		raf.close();
		
	}
	public Puntos2D leerPuntos(String fichero,int inicio) throws IOException{
		RandomAccessFile raf = new RandomAccessFile(fichero, "r");
		raf.seek(inicio);
		int px = raf.readInt();
		int py = raf.readInt();
		raf.close();
		return new Puntos2D(px, py);
		
	}
}
