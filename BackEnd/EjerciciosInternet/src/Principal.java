
public class Principal {

	public static void main(String[] args) {
		
		Cuenta c = new Cuenta("paco");
		c.ingresar(12.25);
		c.consulta();
		c.retirar(12);
		c.consulta();
	}

}
