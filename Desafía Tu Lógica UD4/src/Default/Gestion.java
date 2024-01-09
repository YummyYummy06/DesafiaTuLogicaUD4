package Default;

import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {

		/*
		 * Crea tres objetos de la clase Piloto y pasa los datos correspondientes
		 * mediante su constructor(que habrás creado y que tiene todos los parámetros)
		 * de los siguientes pilotos. El número de identificación es a libre elección.
		 * 
		 * Pete Maverick, es capitán, con 10.000 horas de vuelo.  Natasha Phoenix,
		 * teniente, con 3.000 horas de vuelo. Bradley Rooster, teniente, con 3.500
		 * horas de vuelo.
		 */

		Piloto piloto1 = new Piloto(001, 10000, "Capitán", "Pete Maverick");
		Piloto piloto2 = new Piloto(002, 3000, "Teniente", "Natasha Phoenix");
		Piloto piloto3 = new Piloto(003, 3500, "Teniente", "Bradley Rooster");

		/*
		 *   A continuación, pide al usuario que introduzca los datos de otros dos
		 * pilotos, crea los objetos correspondientes y pasa dicha información
		 * igualmente al constructor (de todos los parámetros).
		 */

		Piloto piloto4 = new Piloto(0, 0, "", "");
		Piloto piloto5 = new Piloto(0, 0, "", "");
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Introduce los datos del primer piloto que quieras crear,\n dándome inicialmente su id seguido de las horas de vuelo\n su rango y por último su nombre");
		int id1 = sc.nextInt();
		int experiencia = sc.nextInt();
		String rango = sc.next();
		String nombre = sc.next();
		piloto4.setId(id1);
		piloto4.setExperiencia(experiencia);
		piloto4.setRango(rango);
		piloto4.setNombre(nombre);
		System.out.println("\n\n");

		System.out.println(
				"Introduce los datos del segundo piloto que quieras crear,\n dándome inicialmente su id seguido de las horas de vuelo\n su rango y por último su nombre");
		int id2 = sc.nextInt();
		int experiencia2 = sc.nextInt();
		String rango2 = sc.next();
		String nombre2 = sc.next();
		piloto5.setId(id2);
		piloto5.setExperiencia(experiencia2);
		piloto5.setRango(rango2);
		piloto5.setNombre(nombre2);
		System.out.println("\n\n");

		/*
		 * Muestra la información del piloto Maverick y de Rooster utilizando el método
		 * mostrarPiloto(), que debes haber implementado ya.
		 */

		piloto1.mostrarPiloto();
		System.out.println("\n\n");
		piloto3.mostrarPiloto();
		System.out.println("\n\n");

		/*
		 * Muestra la información de los dos pilotos cuya información te ha
		 * proporcionado el usuario, utilizando el método mostrarPiloto().
		 */

		piloto4.mostrarPiloto();
		System.out.println("\n\n");
		piloto5.mostrarPiloto();
		System.out.println("\n\n");

		/*
		 * Realiza los pasos 1 a 2 pero con la clase Avion.(y asigna Piloto a dichos
		 * aviones, usa los que ya tienes creados en puntos anteriores) a. Para ello
		 * crea tres objetos Avion, de los cuales uno será
		 * de entrenamiento y dos de combate. b. Después pedirás al usuario que
		 * introduzca la información de dos Aviones, que serán ambos de entrenamiento.
		 */

		Entrenamiento avion1 = new Entrenamiento(010001, 100, "X-10", piloto1, true);
		Combate avion2 = new Combate(010002, 2, "A-101", piloto2, true);
		Combate avion3 = new Combate(010003, 2, "A-102", piloto3, true);

		System.out.println(
				"Introduce los datos del primer avión que quieras registrar,\n diciendome en primer lugar su id, seguido de la capacidad de personas que puede llevar,\n el modelo, el piloto que quieras que lo lleve (elige un número del 1 al 5 para poder asignar un piloto existente).\n Ambos serán aviones de entrenamiento"
						+ "\n");

		Entrenamiento avion4 = new Entrenamiento(0, 0, "", null, true);
		int ida1 = sc.nextInt();
		int capacidad1 = sc.nextInt();
		String modelo1 = sc.next();
		Piloto pilotox;
		avion4.setId(ida1);
		avion4.setCapacidad(capacidad1);
		avion4.setModelo(modelo1);
		int opcion = 0;

		do {
			opcion = sc.nextInt();
			System.out.println("\n\n");

			switch (opcion) {
			case 1:
				pilotox = piloto1;
				System.out.println("Ha escogido el piloto: " + piloto1.getNombre() + "\n\n");
				avion4.setPiloto(pilotox);
				break;
			case 2:
				pilotox = piloto2;
				System.out.println("Ha escogido el piloto: " + piloto2.getNombre() + "\n\n");
				avion4.setPiloto(pilotox);
				break;
			case 3:
				pilotox = piloto3;
				System.out.println("Ha escogido el piloto: " + piloto3.getNombre() + "\n\n");
				avion4.setPiloto(pilotox);
				break;
			case 4:
				pilotox = piloto4;
				System.out.println("Ha escogido el piloto: " + piloto4.getNombre() + "\n\n");
				avion4.setPiloto(pilotox);
				break;
			case 5:
				pilotox = piloto5;
				System.out.println("Ha escogido el piloto: " + piloto5.getNombre() + "\n\n");
				avion4.setPiloto(pilotox);
				break;
			default:
				System.out.println("Prueba de nuevo, no has escogido un piloto válido" + "\n\n");
				break;
			}

		} while (opcion <= 0 || opcion > 5);

		System.out.println(
				"Introduce los datos del segundo avión que quieras registrar,\n diciendome en primer lugar su id, seguido de la capacidad de personas que puede llevar,\n el modelo, el piloto que quieras que lo lleve (elige un número del 1 al 5 para poder asignar un piloto existente).\n Ambos serán aviones de entrenamiento");

		Entrenamiento avion5 = new Entrenamiento(0, 0, "", null, true);
		int ida2 = sc.nextInt();
		int capacidad2 = sc.nextInt();
		String modelo2 = sc.next();
		Piloto pilotoy;
		avion5.setId(ida2);
		avion5.setCapacidad(capacidad2);
		avion5.setModelo(modelo2);
		int opcion2 = 0;

		do {
			opcion2 = sc.nextInt();
			System.out.println("\n\n");
			switch (opcion2) {
			case 1:
				pilotoy = piloto1;
				System.out.println("Ha escogido el piloto: " + piloto1.getNombre() + "\n\n");
				avion5.setPiloto(pilotoy);
				break;
			case 2:
				pilotoy = piloto2;
				System.out.println("Ha escogido el piloto: " + piloto2.getNombre() + "\n\n");
				avion5.setPiloto(pilotoy);
				break;
			case 3:
				pilotoy = piloto3;
				System.out.println("Ha escogido el piloto: " + piloto3.getNombre() + "\n\n");
				avion5.setPiloto(pilotoy);
				break;
			case 4:
				pilotoy = piloto4;
				System.out.println("Ha escogido el piloto: " + piloto4.getNombre() + "\n\n");
				avion5.setPiloto(pilotoy);
				break;
			case 5:
				pilotoy = piloto5;
				System.out.println("Ha escogido el piloto: " + piloto5.getNombre() + "\n\n");
				avion5.setPiloto(pilotoy);
				break;
			default:
				System.out.println("Prueba de nuevo, no has escogido un piloto válido" + "\n\n");
				break;
			}
		} while (opcion2 <= 0 || opcion2 > 5);

		sc.close();

		/*
		 * Muestra toda la información de los aviones, tanto los Aviones cuyos datos has
		 * asignado tú, como la de los Aviones que ha introducido por teclado el
		 * usuario.
		 */

		System.out.println("Informacion de todos los aviones: \n ----------------------------------\n");
		avion1.mostrarAvion();
		System.out.println("\n\n");
		avion2.mostrarAvion();
		System.out.println("\n\n");
		avion3.mostrarAvion();
		System.out.println("\n\n");
		avion4.mostrarAvion();
		System.out.println("\n\n");
		avion5.mostrarAvion();

	}

}
