package puntos;

import static java.lang.Math.*;

public class Puntos2D {
	//atributos
	int x;
	int y;
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
}
