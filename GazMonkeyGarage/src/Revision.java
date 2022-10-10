
public class Revision extends Trabajo {
	
	//private double precioRevision;

	public Revision(String descripcion) {
		super(descripcion);
        
	}
    
	@Override
	public String toString() {
		return " --------------------------------------\n"
		     + "|  \n"
			 + "| Trabajo ID: " + identificador + "\n"
			 + "| Descripcion: " + descripcion + "\n" 
	         + "| Precio: " + (fijo + 20)  + "\n"
	         + " ---------------------------------------\n";

	}
}
