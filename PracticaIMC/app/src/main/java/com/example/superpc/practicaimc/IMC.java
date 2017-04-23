package com.example.superpc.practicaimc;

/**
 * Created by SuperPc on 23/04/2017.
 */

public class IMC {
    public float calcular(float kg,float cm) {
        float m = (cm / 100);
        float bmi = (kg / (m * m));
        return bmi;
    }
}
