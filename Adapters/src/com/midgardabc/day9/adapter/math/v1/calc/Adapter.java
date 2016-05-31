package com.midgardabc.day9.adapter.math.v1.calc;

import com.midgardabc.day9.adapter.math.Arifmetika;

/**
 * Created by Сергей on 31.05.2016.
 */
public class Adapter extends Calculator {
    private Arifmetika arifmetika;

    public Adapter() {
        arifmetika = new Arifmetika();
    }

    @Override
    public int multiply(int a, int b) {
        return arifmetika.multiply(a, b);
    }

    @Override
    public int summa(int a, int b) {
        return arifmetika.summa(new int[] {a, b});
    }

}
