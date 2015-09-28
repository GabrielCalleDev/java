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
		persona1.IntroducirDescripcion("Este es Fausto y es buena persona pero tiene que aprender a ser más resolutor.");
		
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
		// Se obtiene tambien los datos asociados, en este caso desde el objeto 'bici' que se crea en el constructor del objeto persona.
		f.InsertarSaltoDeLinea(); // Se inserta un salto de linea.
		persona2.MostrarDatos();
		System.out.println("Bici: " + persona2.ObtenerBici().ObtenerModelo());
		System.out.println("Precio: " + persona2.ObtenerBici().ObtenerPrecio());
				
		// persona3
		// Se obtiene tambien los datos asociados, en este caso desde el objeto 'moto' que se crea en el constructor del objeto persona
		f.InsertarSaltoDeLinea();
		persona3.MostrarDatos();
		System.out.println("Moto: " + persona3.ObtenerMoto().ObtenerMarca());
		System.out.println("CC: " + persona3.ObtenerMoto().ObtenerCC());

		// persona4
		// Se obtiene tambien los datos asociados, en este caso desde el objeto 'coche' que se crea en el constructor del objeto persona
		f.InsertarSaltoDeLinea();
		persona4.MostrarDatos();
		System.out.println("Marca: " + persona4.ObtenerCoche().ObtenerMarca());
		System.out.println("Modelo: " + persona4.ObtenerCoche().ObtenerModelo());
		System.out.println("Año: " + persona4.ObtenerCoche().ObtenerAño());
		
		// Prueba de funciones
		f.InsertarSaltoDeLinea(2); // Se insertara 2 saltos de linea
		f.ImprimirResultadoSuma(f.Suma(2, 3)); // No hace falta explicarlo.. xddd
		f.InsertarSeparador("-", 43); // Se insertara una linea de 43 caraceteres del tipo "-" Seguida de un salto de linea
	}
}