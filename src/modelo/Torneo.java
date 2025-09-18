package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Torneo {

	private String nombre;
	private int idTorneo;
	private String temporada;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private List<Equipo> equipos; ///SEGUIR ESTE PATRON
	private boolean activo = true;
	

	
	public Torneo(String nombre, int idTorneo, String temporada, LocalDate fechaInicio, LocalDate fechaFin) {
		super();
		this.nombre = nombre;
		this.idTorneo = idTorneo;
		this.temporada = temporada;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.equipos = new ArrayList<Equipo>(); ///SEGUIR ESTE PATRON EN  LAS DEMAS CLASES 
		
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
	
	public boolean isActivo() {
    return activo;
	}

	public void setActivo(boolean activo) {
    this.activo = activo;
	}

	public void deshabilitarTorneo() {
    this.activo = false;
}

	public String toString(){
		String listaEquipos = equipos.stream()
		.map(equipo-> equipo.getNombre())
		.collect(Collectors.joining(", "));

		return "El torneo "+ nombre +", id "+ getIdTorneo() +", de la temporada "+temporada+", fecha de inicio "+fechaInicio +
		", fecha de cierre "+fechaFin + ", tiene estos equipos: "+ listaEquipos;
	}


	
	
}
