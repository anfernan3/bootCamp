package naipes;

import java.util.ArrayList;
import java.util.Collections;


public class BarajaPokemon extends Cartas implements Juego {

//	ATRIBUTOS

	private static final int NUM_CARTAS = 150;
	private int posSiguienteCarta;
	private ArrayList<Cartas> CartasPokemon;
	private int i = 1;

//	CONSTRUCTOR

	public BarajaPokemon() {
		CartasPokemon = new ArrayList<Cartas>();
		this.posSiguienteCarta = 0;
		crearBaraja();
	}

//	METODOS

	@Override
	public void crearBaraja() {

		String[] nombrePokemon = { "Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard",
				"Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree", "Weedle", "Kakuna",
				"Beedrill", "Pidgey", "Pidgeotto", "Pidgeot", "Rattata", "Raticate", "Spearow", "Fearow", "Ekans",
				"Arbok", "Pikachu", "Raichu", "Sandshrew", "Sandslash", "Nidoran", "Nidorina", "Nidoqueen", "Nidoran",
				"Nidorino", "Nidoking", "Clefairy", "Clefable", "Vulpix", "Ninetales", "Jigglypuff", "Wigglytuff",
				"Zubat", "Golbat", "Oddish", "Gloom", "Vileplume", "Paras", "Parasect", "Venonat", "Venomoth",
				"Diglett", "Dugtrio", "Meowth", "Persian", "Psyduck", "Golduck", "Mankey", "Primeape", "Growlithe",
				"Arcanine", "Poliwag", "Poliwhirl", "Poliwrath", "Abra", "Kadabra", "Alakazam", "Machop", "Machoke",
				"Machamp", "Bellsprout", "Weepinbell", "Victreebel", "Tentacool", "Tentacruel", "Geodude", "Graveler",
				"Golem", "Ponyta", "Rapidash", "Slowpoke", "Slowbro", "Magnemite", "Magneton", "Farfetch'd", "Doduo",
				"Dodrio", "Seel", "Dewgong", "Grimer", "Muk", "Shellder", "Cloyster", "Gastly", "Haunter", "Gengar",
				"Onix", "Drowzee", "Hypno", "Krabby", "Kingler", "Voltorb", "Electrode", "Exeggcute", "Exeggutor",
				"Cubone", "Marowak", "Hitmonlee", "Hitmonchan", "Lickitung", "Koffing", "Weezing", "Rhyhorn", "Rhydon",
				"Chansey", "Tangela", "Kangaskhan", "Horsea", "Seadra", "Goldeen", "Seaking", "Staryu", "Starmie",
				"Mr. Mime", "Scyther", "Jynx", "Electabuzz", "Magmar", "Pinsir", "Tauros", "Magikarp", "Gyarados",
				"Lapras", "Ditto", "Eevee", "Vaporeon", "Jolteon", "Flareon", "Porygon", "Omanyte", "Omastar", "Kabuto",
				"Kabutops", "Aerodactyl", "Snorlax", "Articuno", "Zapdos", "Moltres", "Dratini", "Dragonair",
				"Dragonite", "Mewtwo", "Mew" };

		for (String pokemon : nombrePokemon)
			CartasPokemon.add(new Cartas(i++, pokemon));
	}

	@Override
	public void barajar() {
		Collections.shuffle(CartasPokemon);
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
				System.out.println(CartasPokemon.get(i));
			}
		}

	}

	@Override
	public void mostrarBaraja() {
		if (cartasDisponibles() == 0) {
			System.out.println("No hay cartas que mostrar");
		} else {
			for (int i = posSiguienteCarta; i < CartasPokemon.size(); i++) {
				System.out.println(CartasPokemon.get(i));
			}
		}

	}

	@Override
	public void comparar() {
		// TODO Auto-generated method stub

	}

	@Override
	public Cartas siguienteNaipe() {
		// TODO Auto-generated method stub
		return null;
	}

}
