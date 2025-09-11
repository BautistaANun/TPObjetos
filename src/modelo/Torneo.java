package modelo;

import java.time.LocalDate;
import java.util.List;


public class Torneo {

	private String nombre;
	private int idTorneo;
	private String temporada;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private List<Equipo> equipos;
	
	
	public Torneo(String nombre, int idTorneo, String temporada, LocalDate fechaInicio, LocalDate fechaFin,
			List<Equipo> equipos) {
		super();
		this.nombre = nombre;
		this.idTorneo = idTorneo;
		this.temporada = temporada;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.equipos = equipos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdTorneo() {
		return idTorneo;
	}
	public void setIdTorneo(int idTorneo) {
		this.idTorneo = idTorneo;
	}
	public String getTemporada() {
		return temporada;
	}
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public List<Equipo> getEquipos() {
		return equipos;
	}
	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}
	
	
}
