package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String nombre;
        String apellidos;
        String tipoDeCliente;
        Integer cantidadArticulosComprados;
        double precioCompra;
        double precioTotalDeLaCompra;



        Scanner leer = new Scanner(System.in);

        System.out.println("***********");
        System.out.println("Bienvenido a MODA EXPRESS");
        System.out.println("***********");

        System.out.print("Ingrese por favor su nombre:");
        nombre=leer.nextLine();

        System.out.print("Ingrese por favor su apellido: ");
        apellidos=leer.nextLine();

        System.out.print(" Usted es un cliente VIP o regular: ");
        tipoDeCliente=leer.nextLine().toLowerCase();
        if (tipoDeCliente.equals("vip")) {
            System.out.print("ingrese la cantidad de articulos comprados: ");
            cantidadArticulosComprados= leer.nextInt();
            System.out.println("la cantidad de articulos dijitada fue"+cantidadArticulosComprados);

            if(cantidadArticulosComprados>=1 && cantidadArticulosComprados<=3){
                double valorDescuento=0.10;
                System.out.println("valor de compra");
                precioCompra=leer.nextDouble();
                System.out.println("el valor de su descuento es: " +(precioCompra*valorDescuento));
                System.out.println("Su compra total es: "+(precioCompra-valorDescuento));


            }else if(cantidadArticulosComprados>3 && cantidadArticulosComprados<=5){
                double valorDescuento=0.15;
                System.out.println("ingrese valor de la compra");
                precioCompra= leer.nextDouble();
                System.out.println("el valor de su descuento es" +(precioCompra*valorDescuento));
                System.out.println("Su compra total es: "+(precioCompra-valorDescuento));

            }else if(cantidadArticulosComprados>5){
                double valorDescuento=0.20;
                System.out.println("ingrese valor de la compra");
                precioCompra= leer.nextDouble();
                System.out.println("el valor de su descuento es" +(precioCompra*valorDescuento));
                System.out.println("Su compra total es: "+(precioCompra-valorDescuento));

            }else{
                System.out.println("opcion invalida");

            }

        }else{//regular
            System.out.println("para ti que eres cliente regular tenemos unos buenos descuentos");
            System.out.print("ingrese la cantidad de articulos comprados: ");
            cantidadArticulosComprados= leer.nextInt();
            System.out.println("la cantidad de articulos dijitada fue"+cantidadArticulosComprados);

            if(cantidadArticulosComprados >= 1 || cantidadArticulosComprados <= 3){
                double valorDescuento = 0.5;
                System.out.println("ingrese valor de la compra");
                precioCompra = leer.nextDouble();
                System.out.println("el valor de su descuento es de: " +(precioCompra*valorDescuento));
                System.out.println("Su compra total es: "+(precioCompra-valorDescuento));


            }else if(cantidadArticulosComprados >= 4 || cantidadArticulosComprados <= 5){
                double valorDescuento = 0.10;
                System.out.println("ingrese valor de la compra");
                precioCompra = leer.nextDouble();
                System.out.println("el valor de su descuento es" +(precioCompra*valorDescuento));
                System.out.println("Su compra total es: "+(precioCompra-valorDescuento));

            }else if(cantidadArticulosComprados<6){
                double valorDescueento=0.15;
                System.out.println("ingrese valor de la compra");
                precioCompra= leer.nextDouble();
                System.out.println("el valor de su descuento es" +(precioCompra*valorDescueento));
                System.out.println("Su compra total es: "+(precioCompra-valorDescueento));

            }else{
                System.out.println("opcion invalida");

            }

        }








    }
}