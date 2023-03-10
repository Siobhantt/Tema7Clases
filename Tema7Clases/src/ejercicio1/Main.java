package ejercicio1;

public class Main {

	public static void main(String[] args) {
	//pruebas
		//Debo crear el objeto y asignarle los valores
		CuentaCorriente cuenta =  new CuentaCorriente("Y6371330E", "Luisa", 6);
		 //y luego con el objeto creado llamo a los metodos
		cuenta.sacarDinero(4);
		cuenta.ingresarDinero(100);
		cuenta.mostrarInformacion();
	}

}
