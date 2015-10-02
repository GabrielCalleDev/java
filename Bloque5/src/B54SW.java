import java.util.Random;

public class B54SW {
	private int salud;
	private int fisico;
	private int fuerza;
	private int ph;
	private int nivel;
	private String nombre;
	
	// Se declara el objeto de la clase random
	private Random random = new Random(System.nanoTime());
	
	// Se generan los SET y GET para cada atributo.
	public int getSalud() {
		return salud;
	}
	public void setSalud(int salud) {
		this.salud = salud;
	}
	public int getFisico() {
		return fisico;
	}
	public void setFisico(int fisico) {
		this.fisico = fisico;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getPh() {
		return ph;
	}
	public void setPh(int ph) {
		this.ph = ph;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Se calculan los ataques con n�meros RANDOM.
	
	public int ataque_fisico(){
		int aleatorio = random.nextInt(2);
		return nivel * aleatorio;
	}
	
	public int ataque_fuerza(){
		if (ph>0){
			ph--;
			return nivel + fuerza;
		}
		else{
			return 0;
		}
	}
	
	public void daño(int salud){
		this.salud -= salud;		
	}
}