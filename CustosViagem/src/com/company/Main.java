package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Percurso percurso = new Percurso();
        Custos custos = new Custos();
        int op=0;
        do {
            System.out.println(" Escolha uma opção: ");
            System.out.println(" 1.. Cadastrar percurso");
            System.out.println("2.. Listar percurso");
            System.out.println("3.. Calcular Viajem");
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    percurso.cadastrarPercurso();
                    break;
                case 2:
                    percurso.ListarPercurso();
                    break;
                case 3:
                    custos.calcularViagem(percurso);
                    break;

            }
        }
        while(op!=9);

    }
    }


