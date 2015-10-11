import java.util.Random;

// Clase llamada: B54SW
public class Bloque54JuegoStarWars {

	public static void main(String[] args) {
		
		int aleatorio;
		int salud;
		boolean jedi = true, sith = true;
		// Se crean los objetos	
		// B54SW = personaje 
		B54SW luke = new  B54SW();
		B54SW yoda = new  B54SW();
		B54SW dvader = new  B54SW();
		
		Random random = new Random(System.nanoTime());
		
		luke.setFisico(15);
		luke.setFuerza(10);
		luke.setNivel(2);
		luke.setNombre("Luke");
		luke.setPh(2);
		luke.setSalud(300);
				
		yoda.setFisico(5);
		yoda.setFuerza(60);
		yoda.setNivel(10);
		yoda.setNombre("Yoda");
		yoda.setPh(10);
		yoda.setSalud(200);
		
		dvader.setFisico(10);
		dvader.setFuerza(60);
		dvader.setNivel(5);
		dvader.setNombre("Darth Vader");
		dvader.setPh(4);
		dvader.setSalud(500);
		
		System.out.println(luke.getNombre()+" Tiene una vida de: "+luke.getSalud());
		System.out.println(yoda.getNombre()+" Tiene una vida de: "+yoda.getSalud());
		System.out.println(dvader.getNombre()+" Tiene una vida de: "+dvader.getSalud());
		System.out.println("****** EL JUEGO HA INICIADO *******\n");
		
		do{
			aleatorio = random.nextInt(2);
			if(aleatorio == 0){
				salud = luke.ataque_fisico();
			}
			else{
				salud = luke.ataque_fuerza();
			}
			System.out.println(luke.getNombre()+" Ha realizado un ataque de: "+salud);
			dvader.daño(salud);
			
			aleatorio = random.nextInt(2);
			if(aleatorio == 0){
				salud = yoda.ataque_fisico();
			}
			else{
				salud = yoda.ataque_fuerza();
			}
			System.out.println(yoda.getNombre()+" Ha realizado un ataque de: "+salud);
			dvader.daño(salud);
			
			// Si Darth vader aun tiene salud puede atacar.
			if(dvader.getSalud() > 0){
				aleatorio = random.nextInt(2);
				if(aleatorio == 0){
					salud = dvader.ataque_fisico();
				}
				else{
					salud = dvader.ataque_fuerza();
				}
				System.out.println(dvader.getNombre()+" Ha realizado un ataque de: "+salud);
				
				aleatorio = random.nextInt(2);
				System.out.println("?????????????????????????" + aleatorio);
				//aleatorio = 1;
				if(aleatorio == 0){
					luke.daño(salud);
					System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
				}
				else{
					yoda.daño(salud);
					System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
				}
				
				// Se comprueba si los jedi aun tienen vida
				if(luke.getSalud() <= 0 && yoda.getSalud() <=0 ){
					System.out.println("********** HAN MUERTO LOS JEDI *****************");
					jedi = false;
				}
				
			}
			else{
				System.out.println("********** HA MUERTO EL SITH *****************");
				sith = false;
			}
			
			System.out.println(luke.getNombre()+" Tiene una vida de: "+luke.getSalud());
			System.out.println(yoda.getNombre()+" Tiene una vida de: "+yoda.getSalud());
			System.out.println(dvader.getNombre()+" Tiene una vida de: "+dvader.getSalud());
			System.out.println("*********************************************");
			
			try{
				System.in.read();
			}catch(Exception e){}
			
			
		}while( jedi && sith);		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
