/**
 * 
 */
package adivina;

import java.util.Random;
import java.util.Scanner;

/**
 * @author afernan3
 *
 */
public class Main {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		var rnd = new Random();
		
		int numAAdivinar =rnd.nextInt(10)*10+1;
		int numIntroducido;
		int intento=0;
		do {
			System.out.println("Introduce un numero");
			numIntroducido = s.nextInt();
			if(numIntroducido != numAAdivinar)
				intento++;
		}
		while (numIntroducido != numAAdivinar && intento <= 9);
			if( numIntroducido == numAAdivinar) 
				System.out.println("Has adivinado el numero");
			if (intento > 9)
				System.out.println("Te has quedado sin intentos");
	}

}
