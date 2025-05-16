package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

public class GestionTranporte {
	private List<Vehiculo> vehiculos = new LinkedList<>();

	public GestionTranporte() {
		vehiculos = new LinkedList<Vehiculo>();

	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}
	
	public boolean asignarPaquete(Paquete paquete, String destino) {
        for (Vehiculo x : vehiculos) {
            if (x.puedeTransportar(paquete, destino)) {
                return true;
            }
        }
        return false;
    }

	public int cantidadVehiculos() {
		return vehiculos.size();
	}

}
