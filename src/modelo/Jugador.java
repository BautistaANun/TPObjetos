package modelo;

import java.time.LocalDate;

public class Jugador {
	private String nombre;
	private String apellido;
	private int dni;
	private int idJugador;
	private LocalDate fechaNacimiento;
	private double estatura;
	private double peso;
	private String posicion;
	private int nroDeCamiseta ;
	private boolean activo = true;
	
	public Jugador(String nombre, String apellido, int dni, int idJugador, LocalDate fechaNacimiento, double estatura,
			double peso, String posicion, int nroDeCamiseta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.idJugador = idJugador;
		this.fechaNacimiento = fechaNacimiento;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
		this.nroDeCamiseta = nroDeCamiseta;
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

	public int getIdJugador() {
		return idJugador;
	}

	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getNroDeCamiseta() {
		return nroDeCamiseta;
	}

	public void setNroDeCamiseta(int nroDeCamiseta) {
		this.nroDeCamiseta = nroDeCamiseta;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
}
