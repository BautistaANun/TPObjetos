package test;

import java.time.LocalDate;

import modelo.Equipo;
import modelo.Torneo;

	public class testTorneo{
    public static void main(String[] args ){

        Torneo torneo = new Torneo("Torneo Clausura", 2, "2025", LocalDate.now(), LocalDate.now().plusDays(40));
    torneo.deshabilitarTorneo();
    System.out.println(torneo);

    }
}