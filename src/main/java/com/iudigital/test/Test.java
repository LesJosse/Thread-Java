package com.iudigital.test;

import com.iudigital.uxz.Inventario;
import com.iudigital.uxz.Pedido;
import com.iudigital.uxz.Producto;

public class Test {

    public static void main(String[] args) {

        Producto hilo1 = new Producto();
        Pedido hilo2 = new Pedido();
        Inventario hilo3 = new Inventario();

        long start = System.currentTimeMillis();
        hilo1.start();
        hilo2.start();
        while(hilo1.isAlive()|| hilo2.isAlive()){}
        hilo3.proceso();
        hilo3.pedidoMayor();

        long end = System.currentTimeMillis();
        long total = (end - start)/1000;
        System.out.println("Tiempo final : " + total + " seg ");
    }
}
