package com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private final List<Carta> cartas; 
    private int pontos;               
    private boolean parou;            

    public Jogador() {
        this.cartas = new ArrayList<>();
        this.pontos = 0;
        this.parou = false;
    }

  
    public void receberCarta(Carta c) {
        if (c == null || parou) return; 
        cartas.add(c);                  
        pontos += c.getPontos();        
    }

    // retorna cópia da lista de cartas para não expor lista interna
    public List<Carta> getCartas() {
        return new ArrayList<>(cartas);
    }

    // retorna pontos atuais
    public int getPontos() {
        return pontos;
    }

    // marca jogador como "parou"
    public void parar() {
        this.parou = true;
    }

    // verifica se parou
    public boolean isParou() {
        return parou;
    }

    // reinicia o jogador para um novo jogo
    public void reiniciar() {
        cartas.clear();
        pontos = 0;
        parou = false;
    }
}
