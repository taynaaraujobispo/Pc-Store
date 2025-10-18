package com.example;

import java.util.Random;
public class Computador extends Jogador {

    private EstrategiaDeParada estrategia;

    public Computador() {
        super();
        escolherEstrategiaAleatoria();
    }

    private void escolherEstrategiaAleatoria() {
        Random r = new Random();
        if (r.nextBoolean()) estrategia = new EstrategiaCautelosa();
        else estrategia = new EstrategiaAgressiva();
    }

    public void setEstrategia(EstrategiaDeParada e) {
        this.estrategia = e;
    }
    
    public boolean deveParar() {
        return estrategia.deveParar(this);
    }
}

