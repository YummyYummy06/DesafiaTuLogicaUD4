package Default;

public class Piloto {

	int idNumerico, horasVueloPiloto;
	String nomPiloto,rangoPiloto;

	Piloto(int id, int experiencia, String rango, String nombre) {
		this.idNumerico = id;
		this.horasVueloPiloto = experiencia;
		this.rangoPiloto = rango;
		this.nomPiloto = nombre;
	}

	int getId() {
		return idNumerico;
	}

	int getExperiencia() {
		return horasVueloPiloto;

	}

	String getRango() {
		return rangoPiloto;
	}

	public String getNombre() {
		return nomPiloto;
	}

	void setId(int id) {
		this.idNumerico = id;
	}

	void setExperiencia(int experiencia) {
		this.horasVueloPiloto = experiencia;
	}

	void setRango(String rango) {
		this.rangoPiloto = rango;
	}

	void setNombre(String nombre) {
		this.nomPiloto = nombre;
	}

	void mostrarPiloto() {
		System.out.println("Información del Piloto: \n" + "--------------------------\n" + "ID: " + idNumerico + "\n"
				+ "Nombre: " + nomPiloto + "\n" + "Rango: " + rangoPiloto + "\n" + "Experiencia: " + horasVueloPiloto
				+ " horas de vuelo acumuladas");
	}
}
