package puntos;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Puntos3D extends Puntos2D{
	//atributos
	int z;
	
	//constructores
	public  Puntos3D(){
		
		super();//llamar los constructores de la clase padre
		this.z = 0;
	}
	public Puntos3D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	public Puntos3D(int z, Puntos2D p){
		super(p.x, p.y);
		this.z = z;
		
	}
	// raiz {x^2 + y^2}
	//sobreescribir el modulo original
	@Override
	public double modulo(){
		return (double) sqrt( pow(Puntos3D.super.x,2) + pow(Puntos3D.super.y,2) + pow(this.z,2));
	}
	//sobreescribir el toString() original
	@Override
	public String toString() {
		String s = "{"+ Puntos3D.super.x +" , " + Puntos3D.super.y +" , "+ this.z +"}";
		return s;
	}
	public double distancia( Puntos3D p){
		double dx = pow(p.x - Puntos3D.super.x,2);
		double dy = pow(p.y - Puntos3D.super.y,2);
		double dz = pow(p.z - this.z,2);
		return sqrt(dx + dy + dz);
	}
	
}
