package modelo;

import java.util.List;

public class Sistema {

	private List<Entrenador> entrenadores;
	private List<Equipo> equipos;
	private List<Jugador> jugadores;
	private List<Torneo> torneos;
	
	public Sistema(List<Entrenador> entrenadores, List<Equipo> equipos, List<Jugador> jugadores, List<Torneo> torneos) {
		super();
		this.entrenadores = entrenadores;
		this.equipos = equipos;
		this.jugadores = jugadores;
		this.torneos = torneos;
	}

	public List<Entrenador> getEntrenadores() {
		return entrenadores;
	}

	public void setEntrenadores(List<Entrenador> entrenadores) {
		this.entrenadores = entrenadores;
	}

	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public List<Torneo> getTorneos() {
		return torneos;
	}

	public void setTorneos(List<Torneo> torneos) {
		this.torneos = torneos;
	}
	
	public void darDeBajaJugador(String nombre, String apellido){
		for (Jugador j : jugadores {
			if(j.getNombre().equalsIgnoreCase(nombre) && j.getApellido().equalsIgnoreCase(apellido){
				j.setActivo(false);
				System.out.println("Jugador " + nombre + apellido "dado de baja");
			}
		}
	}
}
