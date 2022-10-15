
public class Revision extends Trabajo {
	
	
	public Revision(String descripcion) {
		super(descripcion);
        
	}
    
	@Override
	public double obtenerCoste() {
		precio = fijo + 20;
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

