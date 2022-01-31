package naipes;

public class Baraja {
	
	private Naipes naipes[]; 
	private int posSiguienteCarta;
	
	public static final int NUM_CARTAS=40;
	
//	METODOS
	
	public Baraja() {
		this.naipes = new Naipes[NUM_CARTAS];
		this.posSiguienteCarta=0;
		crearBaraja();
		barajar();
		
	}
	
	private void crearBaraja() {
		
		String[] palos=Naipes.PALOS;
		
//		recorro los palos
		for(int i=0; i<palos.length; i++) {
			
//			recorro los numeros
			for(int j=0; j<Naipes.LIMITE_CARTA_PALO; j++) {
				
				//las posiciones 8 y 9 del array son el 7 y 8.
				if(!( j==7 || j==8)) {
					if(j >= 9) {
						//solo para la sota, caballo y rey
						naipes[((i * (Naipes.LIMITE_CARTA_PALO-2)) + (j-2))] = new Naipes(j+1, palos[i]);
					}else {
						//para los casos de 1 a 7
						naipes[((i * (Naipes.LIMITE_CARTA_PALO-2)) + j)] = new Naipes(j + 1, palos[i]);
					}
				}
				
			}
		}
	}
	

	
	public void barajar() {
		int posicionAleatoria = 0;
		Naipes n;
		
		//recorro las cartas
		for( int i=0; i<naipes.length; i++ ) {
			posicionAleatoria = generaNumeroEnteroAleatorio(0, NUM_CARTAS-1);
			n=naipes[i];
			naipes[i] = naipes[posicionAleatoria];
			naipes[posicionAleatoria] = n;
		}
		//la posicion vuelve al inicio
		this.posSiguienteCarta = 0;
	}
	
	private Naipes siguienteNaipe() {
		Naipes n = null;
		
		if (posSiguienteCarta == NUM_CARTAS){
			System.out.println("Ya no hay mas cartas, baraja de nuevo");
		}else {
			n = naipes[posSiguienteCarta++];
		}
		return n;
	}
	
	public Naipes[] repartir(int numNaipes) {
		
		if(numNaipes > NUM_CARTAS) {
			System.out.println(" No se puede dar mas cartas de las que hay");
		}else if (cartasDisponibles() < numNaipes) {
				System.out.println("No hay sufucientes cartas que mostrar");
			}else {
				
				Naipes[] naipesDar = new Naipes[numNaipes];
				
				//recorro el array para rellenarlo
				for( int i=0; i<naipesDar.length; i++ ) {
					naipesDar[i] = siguienteNaipe();
				}
				//lo devuelvo
				return naipesDar;
			}
		return null;
	}
	
	public int cartasDisponibles() {
		return NUM_CARTAS-posSiguienteCarta;
	}
	
	public void cartasMonton() {
			
			if(cartasDisponibles() == NUM_CARTAS) {
				System.out.println("No se ha sacado ninguna carta");
			}else {
				for (int i=0; i<posSiguienteCarta; i++) {
					System.out.println(naipes[i]);
				}
			}
			
	}
	
	public void mostrarBaraja() {
		
		if(cartasDisponibles() == 0) {
			System.out.println("No hay cartas que mostrar");
		}else {
			for(int i=posSiguienteCarta; i<naipes.length; i++) {
				System.out.println(naipes[i]);
			}
		}
	}
	

	public void comparar() {
		
	}
	
	
	

	


	
	public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
        int num = (int) (Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }

}
