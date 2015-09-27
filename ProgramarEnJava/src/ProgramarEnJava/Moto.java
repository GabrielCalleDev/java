package ProgramarEnJava;

public class Moto {
	private String marca;
	private int cc;
	
	// Constructor de la clase Moto
	public Moto(String marca, int cc){
		this.marca = marca;
		this.cc = cc;
	}
	//  Metodo de obtención de datos de la clase Moto
	public String ObtenerMarca(){
		return marca;
	}
	public int ObtenerCC(){
		return cc;
	}	
}