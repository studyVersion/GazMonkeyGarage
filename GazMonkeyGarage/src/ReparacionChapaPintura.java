
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
	
	@Override
	public double obtenerCoste() {
		precio = getPrecio() + this.precioPiezas * 1.3;
		return precio;
	}
	
	@Override
	public String toString() {
		return    " --------------------------------------\n"
				+ "| Trabajo ID: " + identificador +"\n"
				+ "| Descripcion: " + descripcion +"\n"
				+ "| Precio: " + obtenerCoste() +"\n"
                + "| Estado: "+ estado()+ "\n"
				+ " --------------------------------------\n";
	}
}
