
public class ReparacionMecanica extends Trabajo {

	private double precioPiezas;

	public ReparacionMecanica(String descripcion) {
		super(descripcion);
		this.precioPiezas = 0;
	}

	public void aumentarPrecioPiezas(double nuevoPrecio) {

		this.precioPiezas =+ nuevoPrecio;
	}

	

	@Override
	public double obtenerCoste() {
		precio = getPrecio() + this.precioPiezas * 1.1;
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
