package Utilidades;

public class Temporadas {

	public int numero;
	public int capitulos;

	public Temporadas(int pNumero, int pCapitulos) {

		numero = pNumero;
		capitulos = pCapitulos;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}

	public String toString() {
		return "Temporada: " + numero + "\ncapitulos: " + capitulos;
	}

}

