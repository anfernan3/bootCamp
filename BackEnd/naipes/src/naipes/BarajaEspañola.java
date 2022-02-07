package naipes;

public class BarajaEspañola extends Naipes {

	private Naipes naipes[];
	private int posSiguienteCarta;

	public static final String[] PALOS = { "ORO", "COPAS", "ESPADAS", "BASTOS" };

// NUMERO DE CARTAS
	public static final int NUM_CARTAS = 40;
	public static final int LIMITE_CARTA_PALO=12;

//	METODOS

	public BarajaEspañola() {
		super();
		this.naipes = new Naipes[NUM_CARTAS];
		this.posSiguienteCarta = 0;
		crearBaraja();

	}

//	CREAMOS LA BARAJA ORDENADA
	private void crearBaraja() {

		String[] palos = PALOS;

//	RECORRE LOS PALOS
		for (int i = 0; i < palos.length; i++) {

//	RECORRE LOS NUMEROS
			for (int j = 0; j < LIMITE_CARTA_PALO; j++) {
				if (!(j == 7 || j == 8)) {
					if (j >= 9) {
						naipes[((i * (LIMITE_CARTA_PALO - 2)) + (j - 2))] = new Naipes(j + 1, palos[i]);
					} else {
						naipes[((i * (LIMITE_CARTA_PALO - 2)) + j)] = new Naipes(j + 1, palos[i]);
					}
				}

			}
		}
	}

//	BARAJAMOS LAS CARTAS
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

	private Naipes siguienteNaipe() {
		Naipes n = null;

		if (posSiguienteCarta == NUM_CARTAS) {
			System.out.println("Ya no hay mas cartas, baraja de nuevo");
		} else {
			n = naipes[posSiguienteCarta++];
		}
		return n;
	}

//	REPARTIMOS UN NUMERO CONCRETO DE CARTAS
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

//	MOSTRAMOS LAS CARTAS DISPONIBLES
	public int cartasDisponibles() {
		return NUM_CARTAS - posSiguienteCarta;
	}

//	MOSTRAMOS LAS CARTAS QUE ESTAN EN EL MONTON
	public void cartasMonton() {

		if (cartasDisponibles() == NUM_CARTAS) {
			System.out.println("No se ha sacado ninguna carta");
		} else {
			for (int i = 0; i < posSiguienteCarta; i++) {
				System.out.println(naipes[i]);
			}
		}

	}

//	MOSTRAMOS LA BARAJA COMPLETA
	public void mostrarBaraja() {

		if (cartasDisponibles() == 0) {
			System.out.println("No hay cartas que mostrar");
		} else {
			for (int i = posSiguienteCarta; i < naipes.length; i++) {
				System.out.println(naipes[i]);
			}
		}
	}

	public void comparar() {

	}

//	GENERA UN NUMERO ALEATORIO
	public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
		int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
		return num;
	}

}
