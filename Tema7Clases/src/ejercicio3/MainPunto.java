package ejercicio3;

public class MainPunto {

	public static void main(String[] args) {
		Punto sitio = new Punto(2,3);
		Punto otroSitio = new Punto (5,7);
		
		sitio.setXY(4, 8);
		otroSitio.setXY(2, 4);
		
		sitio.desplaza(1, 1);
		otroSitio.desplaza(1, 1);
		
		System.out.println(sitio.distancia(otroSitio));

		sitio.imprime();
		otroSitio.imprime();
		
		System.out.println(sitio);
	}

}
