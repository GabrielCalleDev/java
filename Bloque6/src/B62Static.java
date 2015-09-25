//Bloque Java 6.2: Static en Atributos y Metodos

public class B62Static {

	public static void main(String[] args) {
		B61Triangulo.setNombre("Empieza a programar");
		
		B61Triangulo t1 = new B61Triangulo(10);
		System.out.println("El valor del area es: "+t1.getArea()+" El valor del triangulo t1 es: " + B61Triangulo.getNombre());
	}
}