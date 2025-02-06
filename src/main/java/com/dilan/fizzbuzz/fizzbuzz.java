package com.dilan.fizzbuzz;

public class fizzbuzz {
    public static void realizarlo(int x){
        int cantFuzz;
        int cantBuzz;
        int cantFizzbuzz;
        cantFuzz = 0;
        cantBuzz = 0;
        cantFizzbuzz = 0;
        for(double i = 1; i <= x; i++){
            if(i%3 == 0 && i%5 != 0) {
                System.out.println("fuzz");
                cantFuzz++;
            }else if(i%3 != 0 && i%5 == 0){
                System.out.println("buzz");
                cantBuzz++;
            }else if((i%3 == 0 & i%5 == 0)){
                System.out.println("fizzbuzz");
                cantFizzbuzz++;
            }
            else System.out.println(i);
        }
        System.out.println("Cantidad de veces que hubo fuzz: "+cantFuzz);
        System.out.println("Cantidad de veces que hubo buzz: "+cantBuzz);
        System.out.println("Cantidad de veces que hubo fuzzbuzz: "+cantFizzbuzz);
    }
}
