package com.example.EvaluacionJonnathanRivera;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio2 {
	
	public static boolean isAnagram(String X, String Y)
    {
        if (X == null || Y == null) {
            return false;
        }
        if (X.length() != Y.length()) {
            return false;
        }
        Map<Character, Integer> freq = new HashMap<>();
        for (char c: X.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (char c: Y.toCharArray())
        {
            if (!freq.containsKey(c)) {
                return false;
            }
            freq.put(c, freq.get(c) - 1);
            if (freq.get(c) == 0) {
                freq.remove(c);
            }
        }
        return freq.isEmpty();
    }
 
    public static void main(String[] args)
    {
        String X = "ACUERDO";
        String Y = "ECUADOR";    
 
        if (isAnagram(X, Y)) {
            System.out.print("Es un Anagrama");
        }
        else {
            System.out.print("No es un Anagrama");
        }
    }

}
