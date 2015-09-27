package ProgramarEnJava;

public class Bici {
	private String modelo;
	private double precio;
	
	public Bici(String modelo, double precio){
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public String ObtenerModelo(){
		return modelo;
	}
	public double ObtenerPrecio(){
		return precio;
	}
	
	
}
