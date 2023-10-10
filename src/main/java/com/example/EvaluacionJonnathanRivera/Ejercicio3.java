package com.example.EvaluacionJonnathanRivera;

import java.util.Arrays;

public class Ejercicio3 {

	public static void main(String[] args) {     
        int arreglo [] = {50,5,10,36,25,85,23,65};
        Arrays.sort(arreglo);

        for (int i = arreglo.length-1; i>=0; i--) {
        	System.out.println(""+arreglo[i]);
        }
    }
}
