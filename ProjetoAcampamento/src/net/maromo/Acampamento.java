package net.maromo;

public class Acampamento {
    public String nome;
    public char equipe;
    public int idade;

    public void imprimir(){
        System.out.println("nome da pessoa = " + nome);
        System.out.println("equipe = " + equipe);
        System.out.println("idade = " + idade);
    }

    public void separarGrupo(){
        if(idade <= 5){
            equipe = '0';
        }else{
            if(idade <=10){
                equipe = 'A';
            }else{
                if(idade<=20){
                    equipe = 'B';
                }else{
                    equipe = 'C';
                }
            }
        }
    }
}
