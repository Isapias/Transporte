package ar.edu.unlam.pb2;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BicicletaTest {

	@Test
	void queAceptePaqueteValidoTest() {
		Bicicleta bicicleta = new Bicicleta();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		assertTrue(bicicleta.transportarPaquete(p1, "Moron"));

	}

	@Test
	void queAcepteDosPaquetesYRechaceElTerceroTest() {
		Bicicleta bicicleta = new Bicicleta();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p2 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p3 = new Paquete(0.1, 0.1, 0.1, 1.0);
		assertTrue(bicicleta.transportarPaquete(p1, "Moron"));
		assertTrue(bicicleta.transportarPaquete(p2, "Moron"));
		assertFalse(bicicleta.transportarPaquete(p3, "Moron"));

	}

	@Test
	void queRechacePaqueteExcedidoEnVolumenTest() {
		Bicicleta bicicleta = new Bicicleta();
		Paquete p1 = new Paquete(0.5, 0.5, 0.6, 1.0);
		assertFalse(bicicleta.transportarPaquete(p1, "Moron"));

	}

	@Test
	void queRechacePaqueteExcedidoEnPesoTest() {
		Bicicleta bicicleta = new Bicicleta();
		Paquete p1 = new Paquete(0.5, 0.5, 0.5, 16.0);
		assertFalse(bicicleta.transportarPaquete(p1, "Moron"));

	}

	@Test
	void queRechaceTresPaquetesValidosTest() {	
		Bicicleta bicicleta = new Bicicleta();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p2 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p3 = new Paquete(0.1, 0.1, 0.1, 1.0);
		assertTrue(bicicleta.transportarPaquete(p1, "Moron"));
		assertTrue(bicicleta.transportarPaquete(p2, "Moron"));
		assertFalse(bicicleta.transportarPaquete(p3, "Moron"));

	}
}
