
public class ReparacionMecanica extends Reparacion {

	private final double fijo = 1.1;

	public ReparacionMecanica(String descripcion) {
		super(descripcion);
	}


	@Override
	public double obtenerCoste() {
		precio = getPrecio() + precioPiezas * fijo;
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
