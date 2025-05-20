package ar.edu.unlam.pb2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GestionTransporteTest {

	@Test
	void agregarVehiculosTest() {
		GestionTranporte sad = new GestionTranporte();
		Auto auto1 = new Auto();
		Bicicleta bici1 = new Bicicleta();
		Camion camion1 = new Camion();
		sad.agregarVehiculo(auto1);
		sad.agregarVehiculo(bici1);
		sad.agregarVehiculo(camion1);

		assertEquals(3, sad.cantidadVehiculos());
	}

	@Test
	void noAgregarVehiculosDuplicadosTest() {
		GestionTranporte sad = new GestionTranporte();
		Auto auto1 = new Auto();
		sad.agregarVehiculo(auto1);
		sad.agregarVehiculo(auto1);

		assertEquals(1, sad.cantidadVehiculos());
	}

	@Test
	void encontrarVehiculoPorPatenteTest() {
		GestionTranporte sad = new GestionTranporte();
		Auto auto = new Auto("ABC123");
		sad.agregarVehiculo(auto);

		Vehiculo buscado = sad.buscarVehiculoPorPatente("ABC123");
		assertNotNull(buscado);
		assertEquals("ABC123", buscado.getPatente());
	}

	@Test
	void asignarPaqueteAVehiculoTest() {
		GestionTranporte sad = new GestionTranporte();
		Auto auto1 = new Auto();
		Bicicleta bici1 = new Bicicleta();
		Camion camion1 = new Camion();
		sad.agregarVehiculo(auto1);
		sad.agregarVehiculo(bici1);
		sad.agregarVehiculo(camion1);

		assertEquals(3, sad.cantidadVehiculos());
	}

}
