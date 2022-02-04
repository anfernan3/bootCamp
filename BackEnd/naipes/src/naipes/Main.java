package naipes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

// 		CREAMOS LA BARAJA
		Baraja b = new Baraja();

		System.out.println("--------------------------");
		System.out.println("MENU");
		System.out.println("--------------------------");

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion; // Guardaremos la opcion del usuario

		while (!salir) {

			System.out.println("1. Barajar");
			System.out.println("2. Repartir");
			System.out.println("3. Mostrar cartas");
			System.out.println("4. Salir");

			System.out.println("Escribe una de las opciones");
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
		}

//// 		MOSTRAMOS LAS CARTAS DISPONIBLES (40)
//
//		System.out.println("Hay " + b.cartasDisponibles() + " cartas disponibles");
//		b.mostrarBaraja();
//
//		System.out.println("--------------------------");
//
////		BARAJAMOS LAS CARTAS
//		b.barajar();
//
//		System.out.println("--------------------------");
//
////		REPARTIMOS 5 CARTAS
//		b.repartir(5);
//
////		MOSTRAMOS LAS CARTAS DISPONIBLES
//		System.out.println("Hay " + b.cartasDisponibles() + " cartas disponibles");
//
//		System.out.println("--------------------------");
//
//		System.out.println("Cartas sacadas de momento");
//		b.cartasMonton();
//
//		System.out.println("--------------------------");
//
//		// barajamos de nuevo
//		b.barajar();
//
//		Naipes[] n = b.repartir(5);
//
//		System.out.println("Cartas sacadas despues de barajar");
//		for (int i = 0; i < n.length; i++) {
//			System.out.println(n[i]);
//		}
	}

}
