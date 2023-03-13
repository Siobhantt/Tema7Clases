package ejercicio3;

public class Punto {
	int x;
	int y;

	Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void imprime() {
		System.out.print("Las coordenadas del punto actual -->");
		System.out.println("(" + this.x + "," + this.y + ")");
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	public int distancia(Punto p) {
	 int dist=0;//Inicio distancia a 0
	 dist =(int) (Math.pow((p.x-this.x),2) + Math.pow((p.y- this.y),2)); //Hago la operacion del teorema de pitagoras, el math pow tiene 2 parametros******
	dist =(int) Math.sqrt(dist); //de lo guardado en lo anterior le saco la raiz con math.sqrt y aqui termina el teorema
	 return dist; //devulevo lo que sea que haya sacado la operacion de arriba
 }
	public String toString() {
		String mensaje="(" + this.x + "," + this.y + ")";
		return mensaje;
	}
}
