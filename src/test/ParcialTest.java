package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

class ParcialTest {

	private Parcial parcial;

    @BeforeEach
    void setUp() throws Exception {
        parcial = new Parcial(1, -5, 6);
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testGetA() {
        assertEquals(1, parcial.getA(), "El valor de a no es el esperado.");
    }

    @Test
    void testGetB() {
        assertEquals(-5, parcial.getB(), "El valor de b no es el esperado.");
    }
    
    @Test
    void testGetC() {
        assertEquals(6, parcial.getC(), "El valor de c no es el esperado.");
    }
    
    @Test
    void testRaices() throws Exception {
        assertEquals("x = 3, x = 2", parcial.raices(1, -5, 6), "El valor de las raices no es el esperado.");
    }

}
