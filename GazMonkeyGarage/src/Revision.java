
public class Revision extends Trabajo {
	
	
	public Revision(String descripcion) {
		super(descripcion);
        
	}
    
	@Override
	public String toString() {
		return " --------------------------------------\n"
			 + "| Trabajo ID: " + identificador + "\n"
			 + "| Descripcion: " + descripcion + "\n" 
	         + "| Precio: " + (fijo + 20)  + "\n"
	         + " --------------------------------------\n";

	}

	@Override
	public void obtenerCoste() {
		// TODO Auto-generated method stub
		
	}
}
