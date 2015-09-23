//Bloque Java 5.1: Introduccion a la Programacion Orientada a Objetos

public class Bloque51POO {
	public static void main(String[] args) {
		Guerrero g1 = new Guerrero();
		Guerrero g2 = new Guerrero();
		
		g1.nombre = "Goku";
		g1.fuerza = 99;
		g1.salud = 99;
		
		g2.nombre = "Vegeta";
		g2.fuerza = 80;
		g2.salud = 80;
		
		System.out.println("El nombre de mi Guerrero es: " + g1.nombre);
		System.out.println("El nombre de mi Guerrero es: " + g2.nombre);
	}
}