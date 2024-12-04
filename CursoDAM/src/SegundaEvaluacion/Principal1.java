package SegundaEvaluacion;

import java.util.Scanner;
import Utilidades.Pelis;
import Utilidades.Series;
import Utilidades.Temporadas;

public class Principal1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Crear películas
		Pelis pelicula1 = new Pelis("Harry Potter", "Fantasia", 2001, "2h 32m");
		Pelis pelicula2 = new Pelis("Torrente", "Acción", 1998, "1h 37m");

		// Crear series
		Series serie1 = new Series("YOU", "Suspenso", 2018);
		serie1.agregarTemporada(new Temporadas(1, 10));
		serie1.agregarTemporada(new Temporadas(2, 8));

		Series serie2 = new Series("DARK", "Suspenso", 2017);
		serie2.agregarTemporada(new Temporadas(1, 10));
		serie2.agregarTemporada(new Temporadas(2, 8));

		// Mostrar menú
		System.out.println("QUE DESEA HACER");
		System.out.println("1. Mostrar información de películas");
		System.out.println("2. Mostrar información de series. Incluye temporadas y capítulos");

		int opcion = sc.nextInt();

		if (opcion == 1) {
			// Mostrar información de películas
			System.out.println("PELICULA 1");
			System.out.println(pelicula1);
			System.out.println("\s");
			System.out.println("PELICULA 2");
			System.out.println(pelicula2);
		} else if (opcion == 2) {
			// Mostrar información de series
			System.out.println(serie1);
			System.out.println(serie2);
		} else {
			System.out.println("Opción no válida.");
		}

		sc.close();
	}
}


