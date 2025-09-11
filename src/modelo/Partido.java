package modelo;

import java.time.LocalDate;

public class Partido {

	private LocalDate fecha;
	private String estadio;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private boolean activo= true;
	
	public Partido(LocalDate fecha, String estadio, Equipo equipoLocal, Equipo equipoVisitante) {
		super();
		this.fecha = fecha;
		this.estadio = estadio;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getEstadio() {
		return estadio;
	}
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
	public Equipo getEquipoLocal() {
		return equipoLocal;
	}
	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}
	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}
	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
}
