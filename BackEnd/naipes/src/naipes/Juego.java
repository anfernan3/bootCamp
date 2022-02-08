package naipes;

public interface Juego {
	
	public void barajar();
	public Cartas[] repartir(int numNaipes);
	public int cartasDisponibles();
	public void cartasMonton();
	public void mostrarBaraja();
	public void comparar();
	public Cartas siguienteNaipe();

}
