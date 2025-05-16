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
		if (this.destino == null) {
			this.destino = destino;
		}

		if (paquete.calcularVolumen() <= 0.125 && paquete.getPeso() <= 15 && this.paquetes.size() < 2
				&& this.destino.equals(destino)) {
			this.paquetes.add(paquete);
			return true;
		}
		return false;
	}

}
