package com.midgardabc.day9.adapter.math.v2.calc;

import com.midgardabc.day9.adapter.math.Arifmetika;

/**
 * Created by Сергей on 31.05.2016.
 */
public class Adapter extends Arifmetika implements Calculator {

    @Override
    public int summa(int a, int b) {
        return summa(new int[] {a,b});
    }
    @Override
    public int multiply(int a, int b) {
        return multiply(a,b);
    }

}
