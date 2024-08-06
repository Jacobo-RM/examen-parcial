package cic.ejercicio1Examen.Herencia;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArmarioTest {

    private Armario armario;

    @BeforeEach
    public void setUp() {
        armario = new Armario(true, 180);
    }

    @Test
    public void testGetAltura() {
        assertEquals(180, armario.getAltura());
    }

    @Test
    public void testSetAltura() {
        armario.setAltura(200);
        assertEquals(200, armario.getAltura());
    }

    @Test
    public void testSuperConPuerta() {
        assertTrue(armario.isConPuerta());
    }
}
