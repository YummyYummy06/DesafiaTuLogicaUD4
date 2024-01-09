package Default;

public class Combate extends Avion {

	boolean esFurtivo = false;

	Combate(int id, int capacidad, String modelo, Piloto piloto, boolean esFurtivo) {
		super(id, capacidad, modelo, piloto);

		this.esFurtivo = esFurtivo;

	}
	
	void setEsFurtivo(boolean es)
	{
		this.esFurtivo = es;
	}
	
	boolean getEsFurtivo()
	{
		return esFurtivo;
	}

}
