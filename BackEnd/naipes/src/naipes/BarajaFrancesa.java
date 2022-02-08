package naipes;

import java.util.ArrayList;
import java.util.Collections;

public class BarajaFrancesa extends Cartas implements Juego {

	private static final int NUM_CARTAS = 52;
	private int posSiguienteCarta;
	private ArrayList<Cartas> cartas;
	

	
//	COSNTRUCTOR
	public BarajaFrancesa() {
		super();
		cartas = new ArrayList<Cartas>();
		this.posSiguienteCarta = 0;
		crearBaraja();
	}
	

	public void mostrarBaraja() {		
		for (int i=0; i<cartas.size(); i++) {
			Cartas carta = cartas.get(i);
			System.out.println(carta.getNombreCarta());
		}
	}

	

	@Override
	public void crearBaraja() {
		String[] palos = { "PICAS", "CORAZONES", "DIAMANTES", "TREBOLES" };
		
		for(String palo:palos)
			for(int i=1; i<=13;i++)
				cartas.add(new Cartas(i,palo));
	}

	@Override
	public void barajar() {
		Collections.shuffle(cartas);		
	}

	@Override
	public Cartas[] repartir(int numNaipes) {
		if (numNaipes > NUM_CARTAS) {
			System.out.println(" No se puede dar mas cartas de las que hay");
		} else if (cartasDisponibles() < numNaipes) {
			System.out.println("No hay sufucientes cartas que mostrar");
		} else {

			Cartas[] naipesDar = new Cartas[numNaipes];

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
				System.out.println(cartas.get(i));
			}
		}
		
	}

	@Override
	public void comparar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Cartas siguienteNaipe() {
		Cartas c = null;

		if (posSiguienteCarta == NUM_CARTAS) {
			System.out.println("Ya no hay mas cartas, baraja de nuevo");
		} else {
			c = cartas.get(posSiguienteCarta++);
		}
		return c;
	}

}
