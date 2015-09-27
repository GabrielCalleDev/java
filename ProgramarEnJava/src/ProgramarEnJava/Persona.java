package ProgramarEnJava;

public class Persona {
	private String nombre, dni, descripcion;
	private int edad;
	private Moto moto;		// Se crea el objeto moto de la clase Moto
	private Bici bici;		// Se crea el objeto bici de la clase Bici
	private Coche coche;	// Se crea el objeto coche de la clase Coche
	
	// Constructores de la clase Persona con diferentes tipos de datos/objetos
	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	public Persona (String nom, int e, String modelo_bici, double precio){
		nombre = nom;
		edad = e;
		bici = new Bici(modelo_bici, precio);	 	// Se crea un objeto BICI dentro del objeto persona
	}
	public Persona (String nom, int e, String marca_moto, int cilindrada){
		nombre = nom;
		edad = e;
		moto = new Moto(marca_moto, cilindrada);	// Se crea un objeto MOTO dentro del objeto persona
	}
	public Persona (String nom, int e, String marca_coche, String modelo_coche, int año_coche){
		nombre = nom;
		edad = e;
		coche = new Coche(marca_coche, modelo_coche, año_coche); // Se crea un objeto COCHE dentro del objeto persona
	}
	
	// Metodos para obtener datos de la clase persona.
	// Tambien obtiene datos de otras clases: Bici, Moto, Coche
	public void IntroducirDNI(String dni){
		this.dni = dni;
	}
	public void IntroducirDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	public void CambiarEdad(int edad){
		this.edad = edad;
	}
	public Bici ObtenerBici(){
		return bici;
	}
	public Moto ObtenerMoto(){
		return moto;
	}
	public Coche ObtenerCoche(){
		return coche;
	}
	public void MostrarDatos(){
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Edad: " + edad);
		System.out.println("Descripcion: " + descripcion);
	}
}