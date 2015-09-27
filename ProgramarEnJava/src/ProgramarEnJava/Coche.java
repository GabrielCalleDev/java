package ProgramarEnJava;

public class Coche {
	private String marca, modelo;
	private int año;
		
	public Coche(String marca, String modelo, int año){
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
	}
	
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
