package clases;

import java.awt.Color;

public class Coche {
	//atributos
	String marca;


	String modelo;
	Color color;
	int diaCompra;
	int mesCompre;
	int anyoCompra;
	String marcaRuedas;
	
	//contructor
	public Coche(){
		
	}
	
	public Coche(String marca, String modelo, Color color, int diaCompra, int mesCompre, int anyoCompra,
			String marcaRuedas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.diaCompra = diaCompra;
		this.mesCompre = mesCompre;
		this.anyoCompra = anyoCompra;
		this.marcaRuedas = marcaRuedas;
	}
	
}
