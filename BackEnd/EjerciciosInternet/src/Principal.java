
public class Principal {

	public static void main(String[] args) {
		
//		Cuenta cuenta1 = new Cuenta("paco");
//		Cuenta cuenta2 = new Cuenta("Lopez", 800.00);
//		
////		INGRESAMOS EFECTIVO A LAS CUENTAS
//		cuenta1.ingresar(300);
//		cuenta2.ingresar(320.22);
//		
////		RETIRAMOS EFECTIVO DE LAS CUENTAS
//		cuenta1.retirar(124);
//		cuenta2.retirar(322);
//		
////		MOSTRAMOS LA INFORMACION DE LA CUENTA
//		System.out.println(cuenta1);
//		System.out.println(cuenta2);
		
		Cuenta cuenta_1 = new Cuenta("DiscoDurodeRoer");
        Cuenta cuenta_2 = new Cuenta("Fernando", 300);
         
        //Ingresa dinero en las cuentas
        cuenta_1.ingresar(300);
        cuenta_2.ingresar(400);
         
        //Retiramos dinero en las cuentas
        cuenta_1.retirar(100);
        cuenta_2.retirar(100);
         
        //Muestro la informacion de las cuentas
        System.out.println(cuenta_1); // 0 euros
        System.out.println(cuenta_2); // 600 euros
	}

}
