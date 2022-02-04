package adivina2;

import java.util.Scanner;

public class JuegoDelNumero {

	private static int intento = 1;
	private static int numeroUsuario;
	private static int numeroRandom;
	
	
	public static int getIntento() {
		return intento;
	}

	public static void setIntento(int intento) {
		JuegoDelNumero.intento = intento;
	}

	public static int getNumeroUsuario() {
		return numeroUsuario;
	}

	public static void setNumeroUsuario(int numeroUsuario) {
		JuegoDelNumero.numeroUsuario = numeroUsuario;
	}

	public static int getNumeroRandom() {
		return numeroRandom;
	}

	public static void setNumeroRandom(int numeroRandom) {
		JuegoDelNumero.numeroRandom = numeroRandom;
	}

	
	public static int iniciar() {
		
		numeroRandom = (int) (Math.random()*100+1);
		return numeroRandom;
		
	}
	
	public static void jugada() {
		
		Scanner s = new Scanner(System.in);
		iniciar();
		
		do {
			System.out.println("Introduce un numero: ");
			numeroUsuario = s.nextInt();
			intento++;
			System.out.println("Intento: " + intento);
			
			if(numeroUsuario < numeroRandom) System.out.println("El numero a adivinar es mayor");
			if(numeroUsuario > numeroRandom) System.out.println("El numero a adivinar es menor");
			if(numeroUsuario == numeroRandom) System.out.println("¡Has ganado!");
			if(intento > 9) System.out.println("¡Has perdido!");
			
		} while (numeroUsuario != numeroRandom && intento <= 9);
		s.close();
	}
	
	
}
