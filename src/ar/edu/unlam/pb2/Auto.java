package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

public class Auto extends Vehiculo {

	private List<String> destinos = new LinkedList<String>();

	@Override
	public boolean puedeTransportar(Paquete paquete, String destino) {
		Boolean resultado = false;
		Boolean compatible = false;
		if ((!this.destinos.contains(destino) && this.destinos.size() < 3) || (this.destinos.contains(destino))) {
			compatible = true;
		}

		if (paquete.calcularVolumen() + this.capacidadPeso <= 2.0 && paquete.getPeso() <= 500
				&& this.paquetes.size() < 2 && this.destinos.equals(destino)) {
			resultado = true;
		}
		return resultado;

	}

}
