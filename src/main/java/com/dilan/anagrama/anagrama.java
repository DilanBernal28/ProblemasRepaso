package com.dilan.anagrama;


import java.util.Arrays;

public class anagrama {

    public static boolean encontrarlo(String palabra1, String palabra2){
        palabra1 = ordenamiento(palabra1);
        palabra2 = ordenamiento(palabra2);

        if (palabra1 == palabra2) {
            return false;
        }
        System.out.println(palabra1 + palabra2);
        return palabra1.compareToIgnoreCase(palabra2) == 0;
    }

    public static String ordenamiento(String palabraDesordenada){
        char[] palabraOrdenada = palabraDesordenada.toCharArray();
        Arrays.sort(palabraOrdenada);
        return new String(palabraOrdenada);
    }

}
