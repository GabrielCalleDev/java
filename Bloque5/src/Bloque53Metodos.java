//Bloque Java 5.3: ¿Que son los Metodos?

public class Bloque53Metodos {
	public static void main(String[] args) {
		B53Guerrero g1 = new B53Guerrero();
		B53Guerrero g2 = new B53Guerrero();
		
		g1.setNombre("Gabriel");
		g2.setNombre("Santiago");
		
		System.out.println(g1.getNombre());
		System.out.println(g2.getNombre());
	}

}
