package ejercicio2;

public class Mainibro {

	public static void main(String[] args) {
		Libro l1 = new Libro("Ensayo sobre la ceguera", "J.Saramago",0,5);
		
		
		System.out.println("Es posible prestar la cantidad de libros solicitada?: "+l1.prestamo(5));
		System.out.println(l1.devolucion());
	}

}
