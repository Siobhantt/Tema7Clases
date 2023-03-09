package ejercicio1;

public class CuentaCorriente {
	String DNI;
	String nombre;
	double saldo;
	/*Las operaciones típicas de una cuenta corriente son:
Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente. Si es posible llevar a cabo la operación se resta la cantidad a sacar al saldo de la cuenta.
Ingresar dinero: se incrementa el saldo.
Mostrar información: muestra la información disponible de la cuenta corriente.
*/
	CuentaCorriente(String DNI, double saldo){
		this.DNI = DNI;
		this.saldo = saldo; 	
	}
	
	CuentaCorriente(String DNI, String nombre, double saldo){
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo; 
	}
	
	public boolean sacarDinero(double cantidad) {
		boolean posible=false;
		if(saldo>cantidad) {
			posible=true;
			saldo -= cantidad;
		}
		return posible;
	}
	
	public void ingresarDinero(double cantidad) {
		saldo+=cantidad;
	}
	
	public void mostrarInformacion() {
		System.out.print(DNI);
		System.out.print(nombre);
		System.out.print(saldo);
	}
}
