package com.example.EvaluacionJonnathanRivera;

public class Ejercicio1 {

public static void main(String[] args) {
        

        for(int i=1; i<=100; i++){
            if(i%3==0 && i%5==0){
                System.out.println("SOMOS BA");
            } else {
                if(i%3==0){
                    System.out.println("SOMOS");
                } else {
                    if(i%5==0){
                        System.out.println("BA");
                    } else {
                        System.out.println(i);
                    }
                }
            }
        }
    }

}
