
public abstract class Reparacion extends Trabajo{

	protected double precioPiezas;

	
	
	public Reparacion(String descripcion) {
		super(descripcion);
		this.precioPiezas = 0;
	}

	
	
	public void aumentarPrecioPiezas(double nuevoPrecio) {

		this.precioPiezas = +nuevoPrecio;
	}






	
}
