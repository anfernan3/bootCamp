package naipes;

import java.util.ArrayList;

public class BarajaFrancesa extends Naipes implements Juego {

	private static final int NUM_CARTAS = 52;
	private Naipes naipes[];
	private int posSiguienteCarta;
	private ArrayList<Carta> cartas;

	
//	COSNTRUCTOR
	public BarajaFrancesa() {
		super();
		this.naipes = new Naipes[NUM_CARTAS];
		this.posSiguienteCarta = 0;
		crearBaraja();
	}
	

	public void mostrarBaraja() {		
		for (int i=0; i<cartas.size(); i++) {
			Carta carta = cartas.get(i);
			System.out.println(carta.nombreCarta);
		}
	}

	

	@Override
	public void crearBaraja() {
		cartas = new ArrayList<Carta>();
		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] palos = { "PICAS", "CORAZONES", "DIAMANTES", "TREBOLES" };
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				cartas.add(new Carta(numeros[j], palos[i]));
			}
		}
		System.out.println(cartas);
	}

	@Override
	public void barajar() {
		int posicionAleatoria = 0;
		Naipes n;

//	RECOOREMOS LAS CARTAS
		for (int i = 0; i < naipes.length; i++) {
			posicionAleatoria = generaNumeroEnteroAleatorio(0, NUM_CARTAS - 1);
			n = naipes[i];
			naipes[i] = naipes[posicionAleatoria];
			naipes[posicionAleatoria] = n;
		}
//	LA POSICION VUELVE AL INICIO
		this.posSiguienteCarta = 0;
		
	}

	@Override
	public Naipes[] repartir(int numNaipes) {
		if (numNaipes > NUM_CARTAS) {
			System.out.println(" No se puede dar mas cartas de las que hay");
		} else if (cartasDisponibles() < numNaipes) {
			System.out.println("No hay sufucientes cartas que mostrar");
		} else {

			Naipes[] naipesDar = new Naipes[numNaipes];

			// recorro el array para rellenarlo
			for (int i = 0; i < naipesDar.length; i++) {
				naipesDar[i] = siguienteNaipe();
			}
			// lo devuelvo
			return naipesDar;
		}
		return null;
	}

	@Override
	public int cartasDisponibles() {
		return NUM_CARTAS - posSiguienteCarta;
	}

	@Override
	public void cartasMonton() {
		if (cartasDisponibles() == NUM_CARTAS) {
			System.out.println("No se ha sacado ninguna carta");
		} else {
			for (int i = 0; i < posSiguienteCarta; i++) {
				System.out.println(naipes[i]);
			}
		}
		
	}

	@Override
	public void comparar() {
		// TODO Auto-generated method stub
		
	}
	
//	GENERA UN NUMERO ALEATORIO
	public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
		int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
		return num;
	}

	@Override
	public Naipes siguienteNaipe() {
		Naipes n = null;

		if (posSiguienteCarta == NUM_CARTAS) {
			System.out.println("Ya no hay mas cartas, baraja de nuevo");
		} else {
			n = naipes[posSiguienteCarta++];
		}
		return n;
	}

}
