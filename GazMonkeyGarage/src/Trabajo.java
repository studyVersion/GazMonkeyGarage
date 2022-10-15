
public abstract class Trabajo {

	protected int identificador;
	protected String descripcion;
	protected int horasEmpleadas;
	protected final int fijo;
	protected double precio;
	protected boolean finalizado;
	private static int count = 1;

	public Trabajo(String descripcion) {

		this.fijo = 30;
		this.identificador = count++;
		this.descripcion = descripcion;
		this.horasEmpleadas = 0;
		this.precio = 0;
		this.finalizado = false;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getHorasEmpleadas() {
		return horasEmpleadas;
	}

	public void setHorasEmpleadas(int horasEmpleadas) {
		this.horasEmpleadas = horasEmpleadas;
	}

	public double getPrecio() {

		this.precio = this.horasEmpleadas * this.fijo;

		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void finalizarTrabajo() {
		this.finalizado = true;
	}

	public void aumentarHoras(int horas) {

		this.horasEmpleadas += horas;
	}
    
	public abstract double obtenerCoste();

	// obtener el estado
	public String estado() {
		String estado = "";
		enum Estado {
			Completado, EnProceso
		}

		if (finalizado) {
			estado = Estado.Completado.toString();
		} else {
			estado = Estado.EnProceso.toString();
		}
		return estado;

	}

}