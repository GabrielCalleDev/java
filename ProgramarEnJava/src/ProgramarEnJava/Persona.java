package ProgramarEnJava;
//import menuJava.*

public class Persona {
	private String nombre, dni, descripcion;
	private int edad;
	private Moto moto;
	private Bici bici;
	private Coche coche;
	
	// Constructores
	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	public Persona (String nom, int e, String modelo_bici, double precio){
		nombre = nom;
		edad = e;
		bici = new Bici(modelo_bici, precio);
	}
	public Persona (String nom, int e, String marca_moto, int cilindrada){
		nombre = nom;
		edad = e;
		moto = new Moto(marca_moto, cilindrada);
	}
	public Persona (String nom, int e, String marca_coche, String modelo_coche, int año_coche){
		nombre = nom;
		edad = e;
		coche = new Coche(marca_coche, modelo_coche, año_coche);
	}
	
	// Metodos
	
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
