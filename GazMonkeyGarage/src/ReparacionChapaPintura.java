
public class ReparacionChapaPintura extends ReparacionMecanica {

	private double precioPiezas;

	
	public ReparacionChapaPintura(String descripcion) {
		super(descripcion);
		this.precioPiezas = 0;		
	}
    
	@Override
	public void aumentarPrecioPiezas(double nuevoPrecio) {

		this.precioPiezas =+ nuevoPrecio;
	}
	
	public obtenerCoste() {
		this.precioPiezas * 1.3)
	}
	
	@Override
	public String toString() {
		return " --------------------------------------\n"
			 + "| Trabajo ID: " + identificador + "\n"
			 + "| Descripcion: " + descripcion + "\n" 
			 + "| Precio: " + (getPrecio() + this.precioPiezas * 1.3) + "\n"
			 + " --------------------------------------\n";

	}
}
