package net.maromo;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ComputadorTeste {

    public static void main(String[] args) {
    Computador marca1 = new Computador();
    Scanner sc = new Scanner(System.in);
        marca1.marca = "HP";

        System.out.println("Qual é a cor");
        marca1.cor = sc.nextLine();

        System.out.println("Qual é o modelo");
        marca1.modelo = sc.nextLine();

        System.out.println("Qual é numero de série");
        marca1.numeroSerie = Long.parseLong(sc.nextLine());

        System.out.println("Qual é o preço");
        marca1.preco = Double.parseDouble(sc.nextLine());

        marca1.imprimir();
        marca1.calcularValor();
        marca1.imprimir();

        Computador marca2 = new Computador();
        marca2.marca = "IBM";

        System.out.println("Qual é a cor");
        marca2.cor = sc.nextLine();

        System.out.println("Qual é o modelo");
        marca2.modelo = sc.nextLine();

        System.out.println("Qual é numero de série");
        marca2.numeroSerie = Long.parseLong(sc.nextLine());

        System.out.println("Qual é o preço");
        marca2.preco = Double.parseDouble(sc.nextLine());
        marca2.imprimir();
        marca2.calcularValor();
        marca2.imprimir();
        int recebe = marca2.alterarValor(10);
        if (recebe == 1){
            System.out.println("Valor alterado");
        }else{
            System.out.println("Valor não alterado");
        }
        marca2.imprimir();
    }
}
