package modelo;

import java.time.LocalDate;

public class Entrenador {

	private String nombre;
	private String apellido;
	private int dni;
	private int idEntrenador;
	private LocalDate fechaNacimiento;
	private String estrategiaFavorita;
	private boolean activo = true;
	
	public Entrenador(String nombre, String apellido, int dni, int idEntrenador, LocalDate fechaNacimiento,
			String estrategiaFavorita) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.idEntrenador = idEntrenador;
		this.fechaNacimiento = fechaNacimiento;
		this.estrategiaFavorita = estrategiaFavorita;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getIdEntrenador() {
		return idEntrenador;
	}

	public void setIdEntrenador(int idEntrenador) {
		this.idEntrenador = idEntrenador;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEstrategiaFavorita() {
		return estrategiaFavorita;
	}

	public void setEstrategiaFavorita(String estrategiaFavorita) {
		this.estrategiaFavorita = estrategiaFavorita;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
}
