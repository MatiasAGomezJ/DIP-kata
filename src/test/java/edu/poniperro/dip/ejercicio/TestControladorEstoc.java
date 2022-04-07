package edu.poniperro.dip.ejercicio;

import edu.poniperro.dip.ejercicio.bbdd.InventarioBBDD;
import edu.poniperro.dip.ejercicio.negocio.ControladorEstoc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestControladorEstoc {

    @Test
    public void test_control_estoc() {
        ControladorEstoc controlador = new ControladorEstoc(new InventarioBBDD());

        assertFalse(controlador.necesitaReponer("tienda norte", "mesa"));
        assertTrue(controlador.necesitaReponer("tienda norte", "lampara"));
    }
}
