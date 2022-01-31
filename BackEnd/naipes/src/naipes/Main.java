package naipes;

public class Main {

	public static void main(String[] args) {

		
		//creamos la baraja
		Baraja b = new Baraja();
		
		//mostramos las cartas disponibles (40)
		System.out.println("Hay " + b.cartasDisponibles()+" cartas disponibles");
		//b.mostrarBaraja();
		
		

	}

}
