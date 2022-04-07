# DIP

En este ejercicio teneis un "complicado" proyecto que mejorar segun el principio del
Dependency Inversion

Este proyecto gestiona un conjunto de tiendas, cada una con su inventario. La parte critica 
de la aplicacion es un algoritmo que hemos inventado que determina cuando es necesario reponer
un producto en una tienda.

En src hay dos packages org.formacion.di.negocio, con las reglas de negocio que nos van a
hacer millonarios, y org.formacion.di.bbdd, con el codigo tecnico que necesitamos para acceder
a las base de datos.

Actualmente, hay una dependencia del package negocio, al package bbdd, ya que el ControladorEstoc
necesita saber cual es el estoc actual en una tienda, y esto lo hace InventarioBBDD.

Vuestro trabajo: 

Hacer que el package negocio no tenga ninguna dependencia al package bbdd. 
Cread una interface en negocio que capture lo que se necesita de la logica de inventario y
haced que controladorEstoc se exprese con esta interface.

Hecho este cambio, el test debe funcionar sin modificar nada !