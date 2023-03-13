package ejercicio2;

public class Libro {
	String titulo;
	String autor;
	int numEjemplares;
	int numPrestados;
//Constructor sin parametros
	Libro(){
		
	}
	//constructor con parametros
	Libro(String titulo, String autor, int numEjemplares, int numPrestados){
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numPrestados = numPrestados;
	}
	/**
	 * 
	 * @param cantidadPrestamo
	 * @return Devuelve si es posible prestar el libro
	 */
	public boolean prestamo(int cantidadPrestamo) {
		boolean posiblePrestar = false; 
		if (this.numEjemplares - numPrestados >= cantidadPrestamo) { //si los ejemplares menos la cantidad que se ha prestado es mayor que la cantidad a prestar
			//entonces se puede prestar el numero
			posiblePrestar =true;
			this.numPrestados+=cantidadPrestamo;//se suman a los libros prestados la cantidad que se va a prestar
		}
		return posiblePrestar;
	}//fin del metodo
	/**
	 * 
	 * @return Devuelve si es posible devolver un libro
	 */
	public boolean devolucion(){
	boolean posibleDevolver = false;//establecemos la variable de si es poible devolver a falso y en caso
		if (numPrestados>0) {//de que los libros prestados sean mayor a 0
		posibleDevolver = true; //será posible devolver
			numPrestados--;	//se decrementan los libros prestados
	}
	return posibleDevolver;
	}
}
