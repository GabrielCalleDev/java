// Bloque Java 6.1: ¿Que es un Constructor?
// https://www.youtube.com/watch?v=UjgqB5WAWPA&index=30&list=PLw8RQJQ8K1yQDqPyDRzt-h8YlBj96OwMP

public class Bloque61Constructor {

	public static void main(String[] args) {
		//Instancias objecto
		/* con un constructor se omite definir los valores de esta manera:
		toyota.setAceleracion(0);
		toyota.setVelocidad(0);
		toyota.setNombre("Prius");
		*/
		B61Coche toyota = new B61Coche(0, 0, "Prius");
				
		System.out.println("El nombre de mi coche es: " + toyota.getNombre() + " y tiene una velocidad de: " + toyota.getVelocidad());

	}

}
