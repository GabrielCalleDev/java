package ProgramarEnJava;

public class Coche {
	private String marca, modelo;
	private int año;
	
	// Constructor de la clase Coche
	public Coche(String marca, String modelo, int año){
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
	}
	//  Metodo de obtenci�n de datos de la clase Coche
	public String ObtenerMarca(){
		return marca;
	}
	public String ObtenerModelo(){
		return modelo;
	}
	public int ObtenerAño(){
		return año;
	}
}