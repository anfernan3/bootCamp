package naipes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;

		System.out.println("--------------------------");
		System.out.println("MENU");
		System.out.println("--------------------------");

		System.out.println("Escribe una de las opciones");

		System.out.println("1. Baraja Española");
		System.out.println("2. Baraja Francesa");

		opcion = sn.nextInt();

		switch (opcion) {
			case 1: {
	
	//		 		CREAMOS LA BARAJA ESPAÑOLA
				BarajaEspañola b = new BarajaEspañola();
	
				System.out.println("--------------------------");
				System.out.println("¡BARAJA ESPAÑOLA!");
				System.out.println("--------------------------");
				System.out.println("MENU");
				System.out.println("--------------------------");
	
				do {
					System.out.println("Escribe una de las opciones");
					System.out.println("1. Barajar");
					System.out.println("2. Repartir");
					System.out.println("3. Mostrar cartas");
					System.out.println("4. Salir");
					opcion = sn.nextInt();
					
					if (opcion == 1) {
						b.barajar();
						System.out.println("Barajado");
						System.out.println("--------------------------");
					}
					if (opcion == 2) {
						System.out.println("¿Cuantas cartas quieres?");
						int nCartas;
						nCartas = sn.nextInt();
						b.repartir(nCartas);
						System.out.println("--------------------------");
					}
					if (opcion == 3) {
						b.cartasMonton();
						System.out.println("--------------------------");
					}
					if (opcion == 4) {
						System.out.println("--------------------------");
						System.out.println("¡Adios!");
						System.out.println("--------------------------");
						break;
					}
				} while (opcion != 4);
				sn.close();
				break;
			}
			case 2: {
	
	//				CREAMOS LA BARAJA FRANCESA
				BarajaFrancesa bf = new BarajaFrancesa();
	
				System.out.println("--------------------------");
				System.out.println("MENU");
				System.out.println("¡BARAJA FRANCESA!");
				System.out.println("--------------------------");
	
				do {
					System.out.println("Escribe una de las opciones");
					System.out.println("1. Barajar");
					System.out.println("2. Repartir");
					System.out.println("3. Mostrar cartas");
					System.out.println("4. Salir");
					opcion = sn.nextInt();
					
					if (opcion == 1) {
						bf.barajar();
						System.out.println("Barajado");
						System.out.println("--------------------------");
					}
					if (opcion == 2) {
						System.out.println("¿Cuantas cartas quieres?");
						int nCartas;
						nCartas = sn.nextInt();
						bf.repartir(nCartas);
						System.out.println("--------------------------");
					}
					if (opcion == 3) {
						bf.cartasMonton();
						System.out.println("--------------------------");
					}
					if (opcion == 4) {
						System.out.println("--------------------------");
						System.out.println("¡Adios!");
						System.out.println("--------------------------");
						break;
					}
				} while (opcion != 4);
				
			}
		}
	}
}

