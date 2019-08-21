package com.company;

import java.util.Scanner;

public class Percurso {
    Scanner sc = new Scanner(System.in);
 private double kmPercorrido;
 private double ValorCombustivel;
 private double ValorPedagio;

 public void cadastrarPercurso(){
     System.out.println("Qual o tanto de km percorridos?");
     this.kmPercorrido = Double.parseDouble(sc.nextLine());
     System.out.println("qual o valor do combustivel?");
     this.ValorCombustivel = Double.parseDouble(sc.nextLine());
     System.out.println("qual o valor do pedagio");
     this.ValorPedagio = Double.parseDouble(sc.nextLine());
 }
 public void ListarPercurso(){
     System.out.println("kmPercorrido = " + this.kmPercorrido);
     System.out.println("ValorCombustivel = " + this.ValorCombustivel);
     System.out.println("ValorPedagio = " + this.ValorPedagio);
 }

    public double getKmPercorrido() {
        return kmPercorrido;
    }

    public void setKmPercorrido(double kmPercorrido) {
        this.kmPercorrido = kmPercorrido;
    }

    public double getValorCombustivel() {
        return ValorCombustivel;
    }

    public void setValorCombustivel(double valorCombustivel) {
        ValorCombustivel = valorCombustivel;
    }

    public double getValorPedagio() {
        return ValorPedagio;
    }

    public void setValorPedagio(double valorPedagio) {
        ValorPedagio = valorPedagio;
    }
}
