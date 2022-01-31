/**
 * 
 */
package com.example;

import com.example.Factura.Estado;

/**
 * @author afernan3
 * Ejemplos de sintaxis
 */

public class Principal {

	/**
	 * 
	 * @param args
	 * 
	 * 
	 */
	
	
	
public static void ej1(String[] args) {		
		
		Dias dias = Dias.DOMINGO;
		System.out.println(dias);
		

		for (int i=1; i<=10; i++) {
			System.out.println(i);
		};
		
		Calculadora c = new Calculadora();
		System.out.println("RESULTADO SUMA");
		System.out.println(c.suma(2, 4));
		System.out.println("RESULTADO MEDIA");
		System.out.println(c.avg(1,2,3,4,5));
		
		CalculadoraCientifica cc = new CalculadoraCientifica();
		System.out.println("RESULTADO DIVISION");
		System.out.println(cc.divide(12.2, 2));
		System.out.println("RESULTADO METODO HEREDADO");
		System.out.println(cc.suma(2, 2));
		
	}


public static void main(String[] args) {		
	
	Factura f = new Factura(1);
	f.addLinea("comida", 1, 9.0);
	
	if(f.getEstado() == Factura.Estado.CANCELADO) {
		f.cancelar();
	}
	
	Grafico grafico = f;
	
	grafico.pintate();
	
	
	
	
	
}
}
