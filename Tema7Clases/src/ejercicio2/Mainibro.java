package ejercicio2;

public class Mainibro {

	public static void main(String[] args) {
		/*Los parametros de los libros son :  *titulo, autor, numEjemplares, numPrestados*/
		Libro l1 = new Libro("Ensayo sobre la ceguera", "J.Saramago",20,5);
		Libro l2 = new Libro("El cuaderno de Maya","Isabel Allende", 10, 2);
		
		
		System.out.println("Es posible prestar la cantidad de libros solicitada?: "+l1.prestamo(5));
		System.out.println(l1.devolucion());
	
		System.out.println("Es posible prestar la cantidad de libros solicitada?: "+l2.prestamo(10));
		System.out.println(l2.devolucion());
	}

}
