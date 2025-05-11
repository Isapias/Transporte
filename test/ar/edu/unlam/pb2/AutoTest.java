package ar.edu.unlam.pb2;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AutoTest {

	@Test
	void queAceptePaqueteVálido() {
		Auto auto = new Auto();
		Paquete p1 = new Paquete(0, 0, 0, 0);
		assertTrue(Auto.agregar(p1, "Moron"));
	}

}
