package ProgramarEnJava;

public class Programa {
	public static void main(String[] args) {
		// Se importa la clase Funciones en el objeto f
		Funciones f = new Funciones();
		//Se importa la clase persona en cada objeto persona1, persona2, persona3, etc..
		Persona persona1 = new Persona("Fausto", 25);
		Persona persona2 = new Persona("Ismail", 23, "Decathlon 5.1", 59.99);
		Persona persona3 = new Persona("Gabriel", 23, "Honda CBR", 599);
		Persona persona4 = new Persona("Ilias", 21, "Mercedes", "Vito", 2004);
		
		// Introduciendo datos de las personas
		persona1.IntroducirDNI("13245678H");
		persona1.IntroducirDescripcion("Este es Fausto y es buena persona pero tiene que aprender a ser m�s resolutor.");
		
		persona2.IntroducirDNI("13245678H");
		persona2.IntroducirDescripcion("Este es Ismail y tiene una decathlon, un amigo agradable");
		
		persona3.IntroducirDNI("13245678H");
		persona3.IntroducirDescripcion("Yo soy Gabriel y tenia una CBR, actualmente estoy programando en Java todo lo que puedo.");
		
		persona4.IntroducirDNI("13245678H");
		persona4.IntroducirDescripcion("Este es Ilias y tiene un coche grande, es un buen amigo :)");
		// Mostrando datos de las personas
		
		// persona1
		persona1.MostrarDatos();
				
		// persona2
		f.InsertarSaltoDeLinea();
		persona2.MostrarDatos();
		System.out.println("Bici: " + persona2.ObtenerBici().ObtenerModelo());
		System.out.println("Precio: " + persona2.ObtenerBici().ObtenerPrecio());
				
		// persona3
		f.InsertarSaltoDeLinea();
		persona3.MostrarDatos();
		System.out.println("Moto: " + persona3.ObtenerMoto().ObtenerMarca());
		System.out.println("CC: " + persona3.ObtenerMoto().ObtenerCC());

		// persona3
		f.InsertarSaltoDeLinea();
		persona4.MostrarDatos();
		System.out.println("Marca: " + persona4.ObtenerCoche().ObtenerMarca());
		System.out.println("Modelo: " + persona4.ObtenerCoche().ObtenerModelo());
		System.out.println("A�o: " + persona4.ObtenerCoche().ObtenerA�o());
		
		// Prueba de funciones
		f.InsertarSaltoDeLinea();
		int a = 23;
		int b= 12;
		f.InsertarSeparador("-", 43);
		f.ImprimirResultadoSuma(f.Suma(a, b));
	}
}