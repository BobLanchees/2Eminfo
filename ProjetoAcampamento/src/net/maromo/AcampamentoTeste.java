package net.maromo;

import java.util.Scanner;

public class AcampamentoTeste {

    public static void main(String[] args) {
        Acampamento membro = new Acampamento();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Nome da pessoa: ");
        membro.nome = sc.nextLine();
        System.out.println("Idade da pessoa: ");
        membro.idade = Integer.parseInt(sc.nextLine());
        membro.separarGrupo();
        membro.imprimir();
    }
}
