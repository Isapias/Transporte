package ar.edu.unlam.pb2;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AutoTest {

	@Test
	void queAceptePaqueteValido() {
		Auto auto = new Auto();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1);
		assertTrue(auto.agregar(p1, "Moron"));

	}

}
