
public class Cuenta {

	String titular = "";
	double cantidad = 0.0;

//	METODOS

	public void ingresar(double cantidad) {
		if (cantidad <= 0) {
			System.out.println("La cantidad no puede ser menor o igual a 0");
		} else {
			setCantidad(cantidad);
		}
	}

	public void retirar(double cantidad) {
		
		if(cantidad <= 0) {
			
		}
		if(cantidad > 0) {
			setCantidad(getCantidad() - cantidad);
		}
		if(getCantidad() <= 0) {
			setCantidad(0);
		}

	}

	public void consulta() {
		System.out.println("La cantidad en cuenta actual es: " + getCantidad());
	}

//	CONSTRUCTOR

	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public Cuenta(String titular) {
		this.titular = titular;
	}

//	GETTER , SETTER Y TO STRING

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}

}
