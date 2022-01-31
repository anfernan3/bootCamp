package com.example;

import java.io.Serializable;

public class Factura implements Grafico, Persistente, Serializable{
	
	public static enum Estado { PAGADO, CANCELADO, PENDIENTE}
	public class Linea {
		private String concepto;
		private int cantidad;
		private double precio;
		
//		CONSTRUCTOR
		public Linea(String concepto, int cantidad, double precio) {
			super();
			this.concepto = concepto;
			setCantidad(cantidad);
			this.precio = precio;
		}

//		GETTER Y SETTER
		public String getConcepto() {
			return concepto;
		}

		public void setConcepto(String concepto) {
			this.concepto = concepto;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			if(this.cantidad == cantidad) return;
			if(this.cantidad < 1) throw new IllegalArgumentException("La cantidad debe ser mayor de 0.");
			this.cantidad = cantidad;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
//		METODO
		public double getTotal() {
			return cantidad * precio;
		}
		
		public double getNumeroFactura() {
			return numero;
		}
		
		
	}
	private int numero;
	private String direccion;
	private Estado estado;
	private Linea[] lineas;
	
	public Factura(int numero) {
		super();
		this.numero = getNumero();
		lineas = new Linea[100];
		
	}
	
	public Factura(int numero, String direccion, Estado estado, Linea[] lineas) {
		super();
		this.numero = numero;
		this.direccion = direccion;
		this.estado = Estado.PENDIENTE;
		lineas = new Linea[100];
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Linea[] getLineas() {
		return lineas;
	}

	public void setLineas(Linea[] lineas) {
		this.lineas = lineas;
	}
	
	public void addLinea(Linea linea) {
		
	}
	
	public void addLinea(String concepto, int cantidad, double precio) {
		
	}
	
	public void pagada() {
		setEstado(Estado.PAGADO);
	}
	
	public void cancelar() {
		setEstado(Estado.CANCELADO);
	}

	@Override
	public void pintate() {
		
//		CUERPO DEL METODO PINTATE
		
		System.out.println("Soy una facutra " + numero);
		
	}

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void leer() {
		// TODO Auto-generated method stub
		
	}
}
