package ar.edu.unlam.pb2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CamionTest {

	@Test
	public void puedeTransportarUnPaqueteDentroDeLosLimites() {
		Camion camion = new Camion("CAM123");
		Paquete p1 = new Paquete(2.0, 2.0, 1.0, 1000.0);

		assertTrue(camion.transportarPaquete(p1, "Rosario"));
	}

	@Test
	public void noPuedeTransportarPorVolumenExcedido() {
		Camion camion = new Camion("CAM456");
		Paquete paqueteGrande = new Paquete(5.0, 2.0, 2.5, 1000.0); 

		assertFalse(camion.transportarPaquete(paqueteGrande, "Cordoba"));
	}

	@Test
	public void noPuedeTransportarPorPesoExcedido() {
		Camion camion = new Camion("CAM789");
		Paquete paquetePesado = new Paquete(2.0, 2.0, 2.0, 17000.0); 

		assertFalse(camion.transportarPaquete(paquetePesado, "Salta"));
	}

	@Test
	public void puedeTransportarMultiplesPaquetesSiNoExcedeLimites() {
		Camion camion = new Camion("CAM321");
		Paquete p1 = new Paquete(2.0, 2.0, 1.0, 2000.0); 
		Paquete p2 = new Paquete(1.0, 1.0, 1.0, 1000.0); 

		assertTrue(camion.transportarPaquete(p1, "Mendoza"));
		assertTrue(camion.transportarPaquete(p2, "Tucuman"));
	}

	@Test
	public void camionPuedeAgregarMuchosDestinos() {
		Camion camion = new Camion("CAM654");

		for (int i = 0; i < 10; i++) {
			Paquete p = new Paquete(1.0, 1.0, 1.0, 100.0);
			assertTrue(camion.transportarPaquete(p, "Ciudad" + i));
		}
	}

}
