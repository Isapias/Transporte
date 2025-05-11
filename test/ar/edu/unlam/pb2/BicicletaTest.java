package ar.edu.unlam.pb2;

<<<<<<< HEAD
import static org.junit.Assert.assertTrue;
=======
>>>>>>> 0a26283a7a9fec9b6c4e564596ceecb7cac47ee8
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BicicletaTest {

	@Test
<<<<<<< HEAD
	void queAceptePaqueteValido() {
		Bicicleta bicicleta = new Bicicleta();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1);
		assertTrue(bicicleta.agregar(p1, "Moron"));

	}

	@Test
	void queAcepteDosPaquetesValidos() {
		Bicicleta bicicleta = new Bicicleta();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1);
		Paquete p2 = new Paquete(0.1, 0.1, 0.1, 1);
		Paquete p3 = new Paquete(0.1, 0.1, 0.1, 1);
		assertTrue(bicicleta.agregar(p1, "Moron"));
		assertTrue(bicicleta.agregar(p2, "Moron"));
		assertFalse(bicicleta.agregar(p3, "Moron"));

	}

	@Test
	void queRechacePaqueteExcedidoEnVolumen() {
		Bicicleta bicicleta = new Bicicleta();
		Paquete p1 = new Paquete(0.5, 0.5, 0.6, 1);
		assertFalse(bicicleta.agregar(p1, "Moron"));

	}

	@Test
	void queRechacePaqueteExcedidoEnPeso() {
		Bicicleta bicicleta = new Bicicleta();
		Paquete p1 = new Paquete(0.5, 0.5, 0.5, 16);
		assertFalse(bicicleta.agregar(p1, "Moron"));

	}

	@Test
	void queRechaceTresPaquetesValidos() {
		Bicicleta bicicleta = new Bicicleta();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1);
		Paquete p2 = new Paquete(0.1, 0.1, 0.1, 1);
		Paquete p3 = new Paquete(0.1, 0.1, 0.1, 1);
		assertTrue(bicicleta.agregar(p1, "Moron"));
		assertTrue(bicicleta.agregar(p2, "Moron"));
		assertFalse(bicicleta.agregar(p3, "Moron"));

	}
	
	@Test
	void queRechaceTresPaquetes() {
		Bicicleta bicicleta = new Bicicleta();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1);
		Paquete p2 = new Paquete(0.1, 0.1, 0.1, 1);
		Paquete p3 = new Paquete(0.1, 0.1, 0.1, 1);
		bicicleta.agregar(p1, "Moron");
		bicicleta.agregar(p2, "Moron");
		assertFalse(bicicleta.agregar(p3, "Moron"));

	}
	
	

	
	
	
//	
//	@Test
//	void queAceptePaqueteValido() {
//		Bicicleta bicicleta = new Bicicleta();
//		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 0.1);
//		assertTrue(bicicleta.agregar(p1, "Moron"));
//		
//	}

=======
	void test() {
		assertTrue(true);;
	}

>>>>>>> 0a26283a7a9fec9b6c4e564596ceecb7cac47ee8
}
