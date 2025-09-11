package modelo;

public class EstadisticasPartido {

	private int goles;
	private int asistencias;
	private double minutosJugados;
	private Jugador jugador;
	
	
	public EstadisticasPartido(int goles, int asistencias, double minutosJugados, Jugador jugador) {
		super();
		this.goles = goles;
		this.asistencias = asistencias;
		this.minutosJugados = minutosJugados;
		this.jugador = jugador;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	public int getAsistencias() {
		return asistencias;
	}
	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}
	public double getMinutosJugados() {
		return minutosJugados;
	}
	public void setMinutosJugados(double minutosJugados) {
		this.minutosJugados = minutosJugados;
	}
	public Jugador getJugador() {
		return jugador;
	}
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	} 
	
}
