package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

abstract class Vehiculo {
	protected List<Paquete> paquetes = new LinkedList<>();
    protected double capacidadVolumen;
    protected double capacidadPeso;
	
	
	public abstract boolean puedeTransportar(Paquete paquete, String destino);
	
	
	

	

}
