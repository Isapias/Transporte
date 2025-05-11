package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

public class Bicicleta {

	private String destino;
	private List<Paquete> paquete = new LinkedList<Paquete>();

	public boolean agregar(Paquete paquete, String destino) {

		if (this.destino == null) {
			this.destino = destino;
		}

		if (paquete.calcularVolumen() <= 0.125 && paquete.getPeso() <= 15 && this.paquete.size() < 2 && this.destino.equals(destino)) {
			this.paquete.add(paquete);
			return true;
		}

		return false;
	}

}
