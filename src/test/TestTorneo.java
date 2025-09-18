package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import modelo.Equipo;
import modelo.Torneo;




public class TestTorneo {
    public static void main(String[] args) {
         List<Equipo> equiposEjemplo = new ArrayList<>();
        equiposEjemplo.add(new Equipo("Real Madrid"));
        equiposEjemplo.add(new Equipo("Barcelona"));
        equiposEjemplo.add(new Equipo("Valencia"));

        // 2. Crea una instancia de tu objeto Torneo
        Torneo torneoVerano = new Torneo(
            "Apertura", 
            1, 
            "Verano", 
            LocalDate.of(2023, 8, 1), 
            LocalDate.of(2023, 12, 15), 
            equiposEjemplo
        );

        System.out.println(torneoVerano);
    }
}
