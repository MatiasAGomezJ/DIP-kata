package edu.poniperro.dip.ejercicio.negocio;

import edu.poniperro.dip.ejercicio.interfaces.IControlador;
import edu.poniperro.dip.ejercicio.interfaces.IInventario;

public class ControladorEstoc implements IControlador {

    private final IInventario inventario;

    public ControladorEstoc(IInventario inventario) {
        this.inventario = inventario;
    }

    /**
     * Nuestros sesudos estudios han descubierto que los clientes compran mas
     * productos cuando el nombre de este producto es mas largo
     * Por eso, el estoc no puede ser inferior a 100 * la longitud del nombre del producto
     * p.e: necesitamos al menos 400 mesas (mesa : 4 letras) y
     * al menos 700 lamparas (lampara: 7 letras)
     */
    public boolean necesitaReponer(String tienda, String producto) {
        int cantidadActual = inventario.numeroProductos(tienda, producto);

        return cantidadActual < producto.length() * 100;
    }

}
