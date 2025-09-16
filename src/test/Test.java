package test;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import modelo.Entrenador;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entrenador pep = new Entrenador( "Pepe", "Arias", 43445432, 120, LocalDate.of(1990,7,12), "4-4-2");
		Entrenador roman = new Entrenador( "Roman", "Cruz", 43545432, 125, LocalDate.of(2001,11,1), "4-3-3");
		Entrenador leo = new Entrenador( "Leo", "Faria", 43445444, 1, LocalDate.of(1978,4,19), "4-2-4");
	
		List<Entrenador> listaEntrenadores = new ArrayList<>();
		listaEntrenadores.add(pep);
		listaEntrenadores.add(roman);
		listaEntrenadores.add(leo);

		System.out.println("");
		System.out.println("Lista de entrenadores");
		System.out.println("");
		for(Entrenador entrenador : listaEntrenadores){
			System.out.println(entrenador);
		}

		pep.darDeBajaEntrenador(listaEntrenadores, 120);
	
		System.out.println("Lista de entrenadores");
		for(Entrenador entrenador : listaEntrenadores){
			System.out.println(entrenador);
		}

	}



}
