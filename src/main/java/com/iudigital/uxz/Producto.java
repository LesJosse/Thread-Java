package com.iudigital.uxz;

import java.security.SecureRandom;

public class Producto extends Thread {

    SecureRandom sr = new SecureRandom();
    private static final int TM = 1000000;
    static int[] vectorA = new int[TM];
    long time = System.currentTimeMillis();

    @Override
    public void run() {

        for (int i = 0; i < TM; i++) {
            vectorA[i] = sr.nextInt(100);
            System.out.println("Llenando A " + vectorA[i] + " Time:  " + (System.currentTimeMillis() - time) / 1000 + " seg");
        }
    }
}
