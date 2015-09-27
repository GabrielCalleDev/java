package ProgramarEnJava;

public class Moto {
	private String marca;
	private int cc;
	
	public Moto(String marca, int cc){
		this.marca = marca;
		this.cc = cc;
	}
	
	public String ObtenerMarca(){
		return marca;
	}
	public int ObtenerCC(){
		return cc;
	}
		
}