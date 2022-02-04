package ej2;

public class Persona {

//	public static enum Sexo {
//		HOMBRE, MUJER
//	}
	private final static char SEXO_DEF = 'H';

//	ATRIBUTOS
	private String nombre;
	private int edad;
	private String dni;
//	private Sexo sexo;
	private char sexo;
	private double peso;
	private double altura;

//	CONSTRUCTOR
	public Persona() {
		this("", 0, SEXO_DEF, 0, 0);
	}

	public Persona(String nombre, int edad, char sexo) {
		this(nombre, edad, sexo, 0, 0);
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		generarDNI();
		comprobarSexo(getSexo());
	}

//	GETTER Y SETTER
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public static char getSexoDef() {
		return SEXO_DEF;
	}

	
//	METODOS
	
	private double calcularPow(){
		int num=2;

		return Math.pow(getAltura(),num);
		
	}
	
	private int calcularIMC() {
		
		if(getPeso()/calcularPow() < 20) return -1;
		if(getPeso()/calcularPow() >=20) return 0;
		if(getPeso()/calcularPow() <=25) return 0;
		if(getPeso()/calcularPow() >25) return 1;
		
		return 0;
		
	}
	
	

	private boolean esMayorDeEdad()	{
		
		if(edad >= 18) return true;
		return false;
		
	}
		
	private String generarDNI() {
		dni=Math.round(Math.random()*8+1) + "l";
		return dni;
	}
	
	private void comprobarSexo(char sexo) {
		if(sexo != 'H') {
			setSexo(SEXO_DEF);
		};
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + 
				"\n" +
				"Edad: " + edad +
				"\n" +
				"DNI: " + dni + 
				"\n" +
				"Sexo: " + sexo + 
				"\n" +
				"Peso: " + peso + 
				"\n" +
				"Altura: " + altura;
	}
	
	
	

}
