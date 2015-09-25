// Bloque Java 6.1: ¿Que es un Constructor?
// https://www.youtube.com/watch?v=UjgqB5WAWPA&index=30&list=PLw8RQJQ8K1yQDqPyDRzt-h8YlBj96OwMP

public class B61Coche {
	private int velocidad;
	private int aceleracion;
	private String nombre;
	
	// Constructores normalmente se asignan al principio del codigo.
	public B61Coche(int velocidad, int aceleracion, String nombre){
		this.velocidad = velocidad;
		this.aceleracion = aceleracion;
		this.nombre = nombre;
	}
	
	// Set and Get
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getAceleracion() {
		return aceleracion;
	}
	public void setAceleracion(int aceleracion) {
		this.aceleracion = aceleracion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void acelerar(int aceleracion){
		this.aceleracion = aceleracion;
		velocidad += this.aceleracion;
	}
	
	public void frenar(){
		velocidad = 0;
	}
	
}
