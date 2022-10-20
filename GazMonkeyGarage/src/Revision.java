
public class Revision extends Trabajo {
	
	private final int fijo = 20;
	
	public Revision(String descripcion) {
		super(descripcion);
        
	}
    
	@Override
	public double obtenerCoste() {
		precio = getPrecio() + fijo;
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

