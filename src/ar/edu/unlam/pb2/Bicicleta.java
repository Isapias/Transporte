package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

public class Bicicleta extends Vehiculo {

	private static final double VOLUMEN_MAX = 0.125;
	private static final double PESO_MAX = 15;
	private String destino;

	public Bicicleta() {
		this.capacidadVolumen = VOLUMEN_MAX * 2;
		this.capacidadPeso = PESO_MAX * 2;
	}

	@Override
	public boolean puedeTransportar(Paquete paquete, String destino) {
		if (this.destino != null && !this.destino.equals(destino)) {
			return false;
		}

		if (paquetes.size() >= 2) {
			return false;
		}

		double volumenActual = 0.0;
		double pesoActual = 0.0;

		for (Paquete x : paquetes) {
			volumenActual += x.calcularVolumen();
			pesoActual += x.getPeso();
		}

		volumenActual += paquete.calcularVolumen();
		pesoActual += paquete.getPeso();

		return volumenActual <= VOLUMEN_MAX && pesoActual <= PESO_MAX;
	}

	public boolean transportarPaquete(Paquete paquete, String destino) {
		if (puedeTransportar(paquete, destino)) {
			paquetes.add(paquete);
			if (this.destino == null) {
				this.destino = destino;
			}
			return true;
		}
		return false;
	}

}
