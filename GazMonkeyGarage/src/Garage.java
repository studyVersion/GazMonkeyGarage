import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Garage {

	Map<Integer, Trabajo> listaTrabajos = new HashMap<>();

	public Garage() {

		this.listaTrabajos = new HashMap<>();

	}

	/*
	 * los tipos : 1 parra revision ; 2 parra reparacion mecanica; 3 parra
	 * reparacion
	 */
	public int registrarTrabajo(int tipo, String descripcion) {
		int codigo = -1;

		if (tipo == 1) {
			Revision rev = new Revision(descripcion);
			listaTrabajos.put(rev.getIdentificador(), rev);
			codigo = rev.getIdentificador();

		} else if (tipo == 2) {
			ReparacionMecanica repMecanica = new ReparacionMecanica(descripcion);
			listaTrabajos.put(repMecanica.getIdentificador(), repMecanica);
			codigo = repMecanica.getIdentificador();
		} else if (tipo == 3) {
			ReparacionChapaPintura chapaPintura = new ReparacionChapaPintura(descripcion);
			listaTrabajos.put(chapaPintura.getIdentificador(), chapaPintura);
			codigo = chapaPintura.getIdentificador();
		}
		return codigo;

	}// registrarTrabajo

	/*
	 * Si el código = 0 las horas se incrementan, si 1 las horas son negativas, si 2
	 * el trabajo está terminado, si 3 la ID es incorrecta, si 4 es una revision
	 */
	public int aumentarHoras(int id, int horas) {
		int codigo = 0;

		if (horas > 0) {
			boolean existeTrabajo = listaTrabajos.containsKey(id);

			if (!existeTrabajo) {
				codigo = 3;

			} else if (existeTrabajo) {
				boolean finalizado = listaTrabajos.get(id).isFinalizado();

				if (finalizado) {
					codigo = 2;
				} else {
					for (Entry<Integer, Trabajo> trabajo : listaTrabajos.entrySet()) {

						if (trabajo.getKey().equals(id)) {
							trabajo.getValue().aumentarHoras(horas);
							codigo = 0;
							break;
							// }
						}
					}
				}
			}
		} else {
			codigo = 1;

		}

		return codigo;
	}// aumentarHoras

	/*
	 * si el código = 0 el precio de piezas se incrementa, si 1 el nuevo precio es
	 * negativo, si 2 el trabajo está terminado, si 3 la ID es incorrecta, si 4 no
	 * es una reparacion
	 */
	public int aumentarCostePiezas(int id, double nuevoPrecio) {
		int codigo = 0;

		if (nuevoPrecio > 0) {

			boolean existeTrabajo = listaTrabajos.containsKey(id);
			if (!existeTrabajo) {
				codigo = 3;

			} else if (existeTrabajo) {
				boolean finalizado = listaTrabajos.get(id).isFinalizado();

				if (finalizado) {
					codigo = 2;

				} else {
					for (Entry<Integer, Trabajo> trabajo : listaTrabajos.entrySet()) {

						if (trabajo.getKey().equals(id)) {
							if (trabajo.getValue() instanceof ReparacionMecanica) {
								ReparacionMecanica rm = (ReparacionMecanica) trabajo.getValue();
								rm.aumentarPrecioPiezas(nuevoPrecio);
								codigo = 0;
								break;
							} else if (trabajo.getValue() instanceof ReparacionChapaPintura) {
								ReparacionChapaPintura rcp = (ReparacionChapaPintura) trabajo.getValue();
								rcp.aumentarPrecioPiezas(nuevoPrecio);
								codigo = 0;
								break;
							} else {
								codigo = 4;
							}
						}
					}

				}
			}
		} else {
			codigo = 1;
		}
		return codigo;

	}// aumentarCostePiezas

	/*
	 * Si el codigo = -1 el trabajo no existe, si -2 el trabajo ya esta terminado,
	 * 
	 */
	public int finalizarTrabajo(int id) {
		int codigo = 0;
		boolean existeTrabajo = listaTrabajos.containsKey(id);

		if (!existeTrabajo) {
			codigo = -1;
		} else if (existeTrabajo) {

			boolean finalizado = listaTrabajos.get(id).isFinalizado();
			if (finalizado) {
				codigo = -2;

			} else {
				for (Entry<Integer, Trabajo> trabajo : listaTrabajos.entrySet()) {
					if (trabajo.getKey().equals(id)) {
						trabajo.getValue().finalizarTrabajo();
						codigo = 0;
					}
				}
			}
		}
		return codigo;

	}// finalizarTrabajo

	public String muestraTrabajo(int id) {
		String value = "";
		boolean existeTrabajo = listaTrabajos.containsKey(id);

		if (!existeTrabajo) {
			value = "";
		} else {
			for (Entry<Integer, Trabajo> trabajo : listaTrabajos.entrySet()) {
				if (trabajo.getKey().equals(id)) {
					value = trabajo.getValue().toString();
				}
			}
		}
		return value;

	}// muestraTrabajo

}
