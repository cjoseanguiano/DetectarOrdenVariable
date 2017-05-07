package com.devix.company;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        Main main = new Main();
            System.out.println("Debe ingresar 3 variables");
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
            main.DetectaOrden(a, b, c);


    }

    void DetectaOrden(int a, int b, int c) {
        if (a < b && b < c) {
            System.out.println("Las variables estan en orden CRECIENTE ");
        } else if (a > b && b > c) {
            System.out.println("Las variables estan en orden DECRECIENTE ");
        } else {
            System.out.println("Las variables estan en DESORDEN");
        }
    }


}
