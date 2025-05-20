package ar.edu.unlam.pb2;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class AutoTest {

	@Test
	void queAceptePaqueteValidoTest() {
		Auto auto = new Auto("CDF456");
		Paquete p1 = new Paquete(1.0, 0.5, 0.5, 200.0);

		assertTrue(auto.transportarPaquete(p1, "Moron"));
	}

	@Test
	public void noTransportarPorExcesoDeVolumenTest() {
		Auto auto = new Auto("CDF456");
		Paquete p1 = new Paquete(1.5, 1.0, 1.0, 100.0);
		Paquete p2 = new Paquete(1.0, 1.0, 1.0, 100.0);
		assertTrue(auto.transportarPaquete(p1, "Cordoba"));

		assertFalse(auto.transportarPaquete(p2, "Cordoba"));
	}

	@Test
	public void noTransportarPaquetePorExcesoDePesoTest() {
		Auto auto = new Auto("ABC123");
		Paquete paquete = new Paquete(1.0, 1.0, 1.0, 600.0);

		assertFalse(auto.transportarPaquete(paquete, "Buenos Aires"));
	}

	@Test
	public void noPermitirMasDeTresDestinosTest() {
		Auto auto = new Auto("XYZ789");
		// Agregar paquetes con 3 destinos diferentes
		assertTrue(auto.transportarPaquete(new Paquete(0.5, 0.5, 0.5, 100.0), "Cordoba"));
		assertTrue(auto.transportarPaquete(new Paquete(0.5, 0.5, 0.5, 100.0), "Buenos Aires"));
		assertTrue(auto.transportarPaquete(new Paquete(0.5, 0.5, 0.5, 100.0), "La Plata"));

		assertFalse(auto.transportarPaquete(new Paquete(0.5, 0.5, 0.5, 100.0), "Rosario"));
	}

}
