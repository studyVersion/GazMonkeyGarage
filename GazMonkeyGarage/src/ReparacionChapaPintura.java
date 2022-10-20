
public class ReparacionChapaPintura extends Reparacion {

    private final double fijo = 1.3;
	
	public ReparacionChapaPintura(String descripcion) {
		super(descripcion);
	}
    
	
	@Override
	public double obtenerCoste() {
		precio = getPrecio() + this.precioPiezas * fijo;
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
