package decodificador;

import java.util.Arrays;

public class Decodificador {

	public static void main(String[] args) {	

		
		String cadenaInicial = "3+4+3,4-7*1=";
		String[] separado = cadenaInicial.split("(?<=[-+*/()])");		
		
		for(int i = 0; i < separado.length; i++){
			separado[i] = separado[i].replace(",", ".");
			Double operando = Double.parseDouble(separado[i].substring(0, separado[i].length()-1));
			char operador = separado[i].charAt(separado[i].length()-1);
			System.out.println(operando+ " " + operador);
			Calculadora c = new Calculadora();
			c.calculo(operando, operador);
		}
		
		
		
	}

}
