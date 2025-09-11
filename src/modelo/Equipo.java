package modelo;

import java.util.List;

public class Equipo {
	private String nombre;
	private String codigo;
	private int idEquipo;
	private List<Jugador> jugador;
	private Entrenador entrenador;
	private boolean activo = true;
	
	public Equipo(String nombre, String codigo, int idEquipo, List<Jugador> jugador, Entrenador entrenador) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.idEquipo = idEquipo;
		this.jugador = jugador;
		this.entrenador = entrenador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public List<Jugador> getJugador() {
		return jugador;
	}

	public void setJugador(List<Jugador> jugador) {
		this.jugador = jugador;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
	
	
	
	
	
}
