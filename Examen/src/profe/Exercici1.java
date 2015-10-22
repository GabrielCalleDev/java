package profe;

import java.util.ArrayDeque;
import java.util.ArrayList;

// Exercici 1 (2 punts)
// Crea una estructura dinàmica de dades que emmagatzemi amb una cua LIFO i una cua FIFO
// els animals que estan esperant a ser atesos pel veterinari.
// Simula el bucle d'atenció als animals.
// L'ordre és el mateix que el de l'estructura inicial.
// 1 punt: creació de la bona estructura
// 0,5 punt: bucle FIFO
// 0,5 punt: bucle LIFO

public class Exercici1 {

	public static void main(String[] args) {

		// Aquesta estructura és perquè carreguis els objectes amb el mètode
		// correspondent
		// Tots alhora.

		ArrayList<Animal> LlistaInicial = new ArrayList<Animal>(11);
		LlistaInicial.add(new Animal(32, "frisona", 412.3, 4, 2.71));
		LlistaInicial.add(new Animal(22, "frisona", 472.3, 4, 2.71));
		LlistaInicial.add(new Animal(82, "pirineu", 422.1, 4, 2.91));
		LlistaInicial.add(new Animal(51, "pirineu", 438.1, 4, 2.91));
		LlistaInicial.add(new Animal(28, "pirineu", 399.5, 4, 2.91));
		LlistaInicial.add(new Animal(393, "potablava", 3.55, 2, 1.55));
		LlistaInicial.add(new Animal(394, "potablava", 3.85, 2, 1.55));
		LlistaInicial.add(new Animal(398, "potablava", 3.39, 2, 1.55));
		LlistaInicial.add(new Animal(441, "potablava", 3.45, 2, 1.55));
		LlistaInicial.add(new Animal(394, "empordanesa", 3.95, 2, 1.17));
		LlistaInicial.add(new Animal(398, "empordanesa", 3.41, 2, 1.17));

		// Declara les cues aquí
		ArrayDeque<Animal> llistaFifo = new ArrayDeque<Animal>(11);
		ArrayDeque<Animal> llistaLifo = new ArrayDeque<Animal>(11);
		
		// Afegeix els elements de la llista a les dues cues aquí:
		llistaFifo.addAll(LlistaInicial);
		llistaLifo.addAll(LlistaInicial);
			
		Animal mostra = new Animal();

		// Imprimeix la cua LIFO
		System.out.println("Cua LIFO");
		while(!llistaLifo.isEmpty()){
			mostra = llistaLifo.pollLast();
			if (mostra != null){
				System.out.println(mostra.getCodi() + " " + mostra.getBreed() + " " + mostra.getPotes() + " " + mostra.valorMercat());
			}
		}

		// Imprimeix la cua FIFO
		System.out.println("Cua FIFO");
		while(!llistaFifo.isEmpty()){
			mostra = llistaFifo.poll();
			if (mostra != null){
				System.out.println(mostra.getCodi() + " " + mostra.getBreed() + " " + mostra.getPotes() + " " + mostra.valorMercat());
			}
		}
	}

}
