package ProgramarEnJava;

public class Bici {
	private String modelo;
	private double precio;
	
	// Constructor de la clase Bici
	public Bici(String modelo, double precio){
		this.modelo = modelo;
		this.precio = precio;
	}
	// Metodo de obtenci�n de datos de la clase Bici
	public String ObtenerModelo(){
		return modelo;
	}
	public double ObtenerPrecio(){
		return precio;
	}
	
	
}
