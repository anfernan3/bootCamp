package decodificador;

import java.util.Arrays;

public class Decodificador {

	public static void main(String[] args) {
		
		int num1,num2;
		String op;
		
		String cadena = "3+4+3,4-7*1=";
	
		int i;
		char[] subCadenas = cadena.toCharArray();
		String num = "";
		
		for( i=0; i< subCadenas.length; i++) {
			if(Character.isDigit(subCadenas[i])) {
				num += subCadenas[i];
				System.out.println(Arrays.toString(subCadenas));
			}else {
				System.out.println(num+ " " + subCadenas[i]);
				num="";
			}
		}
		
		//para mostrar el array literal
		//System.out.println(Arrays.toString(partes));
		
	}

}
