package com.company;

public class Custos {
    private double totalPercurso;
    Percurso p = new Percurso();

    public double getTotalPercurso() {
        return totalPercurso;
    }

    public void setTotalPercurso(double totalPercurso) {
        this.totalPercurso = totalPercurso;
    }

    public Percurso getP() {
        return p;
    }

    public void setP(Percurso p) {
        this.p = p;
    }

    public void calcularViagem(Percurso p){
    totalPercurso = (p.getKmPercorrido()/10 * p.getValorCombustivel())+ p.getValorPedagio();
        System.out.println(totalPercurso);
    }

}
