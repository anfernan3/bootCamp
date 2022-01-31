package naipes;

public class Main {

	public static void main(String[] args) {

		
		//creamos la baraja
		Baraja b = new Baraja();
		
		//mostramos las cartas disponibles (40)
		System.out.println("Hay " + b.cartasDisponibles()+" cartas disponibles");
//		b.mostrarBaraja();
		
		//saco 5 cartas
		b.repartir(5);
		
		//mostramos las cartas disponibles
		System.out.println("Hay " + b.cartasDisponibles()+" cartas disponibles");
		
		System.out.println("Cartas sacadas de momento");
		b.cartasMonton();
		
		//barajamos de nuevo		
		b.barajar();
		
		Naipes[] n = b.repartir(5);
		
		System.out.println("Cartas sacadas despues de barajar");
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		
		

	}

}
