// Bloque Java 6.2: Static en Atributos y Metodos
public class B61Triangulo {
	private int area;
	private static String nombre;

	//Constructor
	public B61Triangulo(int area){
		this.area = area;
	}
	
	// Set and Get
	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		B61Triangulo.nombre = nombre;
	}
}
