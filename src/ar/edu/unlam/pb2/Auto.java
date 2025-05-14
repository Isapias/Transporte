package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

public class Auto {

	private List<Paquete> paquete = new LinkedList<Paquete>();
	private List<String> destinos = new LinkedList<String>();
	private Double volumenTotal = 0.0;
	private Double pesoTotal = 0.0;

	public boolean agregar(Paquete paquete, String destino) {
		Boolean resultado = false;
		Boolean compatible = false;
		if ((!this.destinos.contains(destino) && this.destinos.size() < 3) 
			|| (this.destinos.contains(destino))) {
			compatible = true;
		}
		
		if(paquete.calcularVolumen() + this.volumenTotal <= 2.0 && paquete.getPeso() <= 500 && this.paquete.size() < 2
				&& this.destinos.equals(destino)) {
			resultado=true;
		}
		return resultado;
	}

}
