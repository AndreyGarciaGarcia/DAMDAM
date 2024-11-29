package Utilidades;

public class Pelis {

	public String nombre;
	public String genero;
	public int anio;
	public String duracion;

	public Pelis(String pNombre, String pGenero, int pAnio, String pDuracion) {

		nombre = pNombre;
		genero = pGenero;
		anio = pAnio;
		duracion = pDuracion;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String toString() {
		return "El nombre de la pelicula es: " + nombre + " \nsu genero es: " + genero + " \naño " + anio + " \ndura "
				+ duracion;
	}

}

