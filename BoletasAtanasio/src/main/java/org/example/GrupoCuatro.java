package org.example;

import java.util.Scanner;

public class GrupoCuatro extends Entradas{

    Scanner sc = new Scanner(System.in);

    @Override
    public void comprar() {

        double valorNeto;
        int boletasCompradas;
        double valorBoleta = 150000;
        double valorTotal;
        int opcionDia;
        double descuento;
        int limiteCompra = 0;

        while (limiteCompra == 0) {
            System.out.println("Digite el dia de la compra:\n 1: martes \n 2: Miercoles \n 3: Jueves \n 4: Viernes");
            opcionDia = sc.nextInt();

            switch (opcionDia) {

                case 1:


                    System.out.println("Boletas a comprar");
                    boletasCompradas = sc.nextInt();

                    if (boletasCompradas <= 3) {
                        valorNeto = (valorBoleta);
                        valorTotal = boletasCompradas * valorNeto;

                        descuento = valorTotal * 0.05;

                        valorTotal = valorTotal - descuento;

                        System.out.println("El valor total de la compra es: " + valorTotal);

                        limiteCompra = 2;
                    } else
                        System.out.println("Solo puedes comprar 5 boleta");
                    break;

                case 2:

                    System.out.println("Boletas a comprar");
                    boletasCompradas = sc.nextInt();

                    if (boletasCompradas <= 3) {

                        valorNeto = (valorBoleta);
                        valorTotal = boletasCompradas * valorNeto;

                        descuento = valorTotal * 0.02;

                        valorTotal = valorTotal - descuento;

                        System.out.println("El valor total de la compra es: " + valorTotal);

                        limiteCompra = 2;
                    } else
                        System.out.println("Solo puedes comprar 5 boleta");

                    break;

                case 3:


                    System.out.println("Boletas a comprar");
                    boletasCompradas = sc.nextInt();

                    if (boletasCompradas <= 3) {

                        valorNeto = (valorBoleta);
                        valorTotal = boletasCompradas * valorNeto;

                        descuento = valorTotal * 0.015;

                        valorTotal = valorTotal - descuento;

                        System.out.println("El valor total de la compra es: " + valorTotal);

                        limiteCompra = 2;
                    } else
                        System.out.println("Solo puedes comprar 5 boleta");
                    break;

                case 4:


                    System.out.println("Boletas a comprar");
                    boletasCompradas = sc.nextInt();

                    if (boletasCompradas <= 3) {
                        valorNeto = (valorBoleta);
                        valorTotal = boletasCompradas * valorNeto;

                        descuento = valorTotal * 0.01;

                        valorTotal = valorTotal - descuento;

                        System.out.println("El valor total de la compra es: " + valorTotal);

                        limiteCompra = 2;
                    } else
                        System.out.println("Solo puedes comprar 5 boleta");

                    break;

            }
        }
    }
}

