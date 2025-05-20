package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

public class Camion extends Vehiculo {
	private List<String> destinos = new LinkedList<String>();
	private static final double VOLUMEN_MAX = 20.0;
	private static final double PESO_MAX = 16000.0;

	public Camion(String patente) {
		this.patente = patente;
		this.capacidadVolumen = VOLUMEN_MAX;
		this.capacidadPeso = PESO_MAX;
	}

	public Camion() {
		this.capacidadVolumen = VOLUMEN_MAX;
		this.capacidadPeso = PESO_MAX;
	}



	@Override
	public boolean puedeTransportar(Paquete paquete, String destino) {
		double volumenActual = 0.0;
		double pesoActual = 0.0;

		for (Paquete x : paquetes) {
			volumenActual += x.calcularVolumen();
			pesoActual += x.getPeso();
		}

		volumenActual += paquete.calcularVolumen();
		pesoActual += paquete.getPeso();

		if (volumenActual <= VOLUMEN_MAX && pesoActual <= PESO_MAX) {
			return true;
		}

		return false;

	}
	
	public boolean transportarPaquete(Paquete paquete, String destino) {
		if (transportarPaquete(paquete, destino)) {
			paquetes.add(paquete);
			if (!destinos.contains(destino)) {
				destinos.add(destino);
			}
			return true;
		}
		return false;
	}

}
