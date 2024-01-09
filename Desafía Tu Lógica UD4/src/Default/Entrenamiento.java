package Default;

public class Entrenamiento  extends Avion{
	
	boolean tieneDobleMando=false;

	Entrenamiento(int id, int capacidad, String modelo, Piloto piloto,boolean dobleMando) {
		super(id, capacidad, modelo, piloto);
		this.tieneDobleMando = dobleMando;
		
	}
	
	boolean getTieneDobleMando()
	{
		return tieneDobleMando;
	}
	
	void setTieneDobleMando(boolean tieneDobleMando)
	{
		this.tieneDobleMando = tieneDobleMando;
	}

	

	

}
