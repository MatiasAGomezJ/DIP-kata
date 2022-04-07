package edu.poniperro.dip.ejercicio.bbdd;

import edu.poniperro.dip.ejercicio.negocio.MiControlador;

public class InventarioBBDD implements MiControlador {


    // Metodo de consulta a la base de datos

    @Override
    public int numeroProductos(String tienda, String producto) {
        return BBDD.stocs.get(tienda).get(producto);
    }
}
