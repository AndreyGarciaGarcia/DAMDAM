package Utilidades;

import java.util.ArrayList;

public class Series {

	public String nombre;
	public String genero;
	public ArrayList<Temporadas> temporadas;
	public int anio;

	public Series(String pNombre, String pGenero, int pAnio) {

		nombre = pNombre;
		genero = pGenero;
		temporadas = new ArrayList<>();
		anio = pAnio;

	}

	public void agregarTemporada(Temporadas temporada) {
		temporadas.add(temporada);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nombre de la serie: ").append(nombre).append("\n");
		sb.append("Género: ").append(genero).append("\n");
		sb.append("Año de lanzamiento: ").append(anio).append("\n");

		for (Temporadas temporada : temporadas) {
			sb.append("Temporada: ").append(temporada.getNumero()).append("\n");
			sb.append("Capítulos: ").append(temporada.getCapitulos()).append("\n");
		}

		return sb.toString();
	}
}
