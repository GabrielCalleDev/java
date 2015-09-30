package ProgramarEnJava;

public class Coche {
	private String marca, modelo;
	private int a�o;
	
	// Constructor de la clase Coche
	public Coche(String marca, String modelo, int a�o){
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
	}
	//  Metodo de obtenci�n de datos de la clase Coche
	public String ObtenerMarca(){
		return marca;
	}
	public String ObtenerModelo(){
		return modelo;
	}
	public int ObtenerA�o(){
		return a�o;
	}
}