package cartaMayor;

import naipes.BarajaEspa�ola;
import naipes.Cartas;

public class CartaMayor extends BarajaEspa�ola {
	
	

	public void iniciar() {
		BarajaEspa�ola b = new BarajaEspa�ola();
		barajar();
		repartir(1);
	}
	
	@Override
	public void barajar() {
		// TODO Auto-generated method stub
		super.barajar();
	}

	@Override
	public Cartas[] repartir(int numNaipes) {
		// TODO Auto-generated method stub
		return super.repartir(numNaipes);
	}

	@Override
	public int cartasDisponibles() {
		// TODO Auto-generated method stub
		return super.cartasDisponibles();
	}

	@Override
	public void cartasMonton() {
		// TODO Auto-generated method stub
		super.cartasMonton();
	}

	@Override
	public void mostrarBaraja() {
		// TODO Auto-generated method stub
		super.mostrarBaraja();
	}

	@Override
	public void comparar() {
		// TODO Auto-generated method stub
		super.comparar();
	}
	

	
	

}
