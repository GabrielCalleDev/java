package ProgramarEnJava;

public class Coche {
	private String marca, modelo;
	private int a�o;
		
	public Coche(String marca, String modelo, int a�o){
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
	}
	
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
