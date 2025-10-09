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
	//agregar
	public boolean agregarJugador  (){
		int =1;
		if(!this.lstJugador.isEmpty()){
			id=this.lstJugador.get(this.lstJugador.size()){
				id=this.lstJugador.get(this.lstJugador.size()-1.getIdJugador()+1;
			}
			return this.lstJugador.add(new Jugador(,,,));
		}
		
		
	}
	
}
