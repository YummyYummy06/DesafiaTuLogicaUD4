package Default;

public class Avion {

	int idAvion, capAvion;
	String modAvion;
	Piloto piloto;

	Avion(int id, int capacidad, String modelo, Piloto piloto) {
		this.idAvion = id;
		this.capAvion = capacidad;
		this.modAvion = modelo;
		this.piloto = piloto;
	}

	int getId() {
		return idAvion;
	}

	int getCapacidad() {
		return capAvion;
	}

	String getModelo() {
		return modAvion;
	}

	void getPiloto() {
		piloto.mostrarPiloto();
	}

	void setId(int id) {
		this.idAvion = id;
	}

	void setCapacidad(int capacidad) {
		this.capAvion = capacidad;
	}

	void setModelo(String modelo) {
		this.modAvion = modelo;
	}

	void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	void mostrarAvion() {
		System.out.println("Información del avión: \n" + "--------------------------\n" + "ID: " + idAvion + "\n"
				+ "Modelo: " + modAvion + "\n" + "Capacidad: " + capAvion + " pasajero/s\n");
		piloto.mostrarPiloto();
	}

}
