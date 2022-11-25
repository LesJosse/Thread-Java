package com.iudigital.uxz;

import java.security.SecureRandom;

public class Inventario extends Thread {

    private static final int TAMANIO = 1000000;
    SecureRandom rm = new SecureRandom();
    int[] C = new int[TAMANIO];
    int mayor = 0;
    long time = System.currentTimeMillis();

    
    public void proceso() {
        int result = 0;
        for (int i = 0; i < TAMANIO; i++) {
            if (Producto.vectorA[i] == Pedido.vectorB[i]) {
                result = Producto.vectorA[i];
//                System.out.println("Procesando c " + result);
            } else if (Pedido.vectorB[i] > Producto.vectorA[i]) {
                result = 2 * (Pedido.vectorB[i] - Producto.vectorA[i]);
//                System.out.println("Procesando c " + result);
            } else if (Producto.vectorA[i] > Pedido.vectorB[i]) {
                result = Pedido.vectorB[i];
//                System.out.println("Procesando c " + result);
            } else {
                System.out.println("No hay compras");
            }
            C[i] = result;
        }
    }

    public void pedidoMayor() {
        for (int i = 0; i < TAMANIO; i++) {
            if (C[i] > mayor) {
                mayor = C[i];
            }
        }
        System.out.println("El pedido mayor es = " + mayor);
    }
}
