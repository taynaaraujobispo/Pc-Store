package com.example;

/**
 * Estratégia cautelosa: o computador para quando tem 16 pontos ou mais.
 */
public class EstrategiaCautelosa implements EstrategiaDeParada {
    @Override
    public boolean deveParar(Jogador computador) {
        return computador.getPontos() >= 16;
    }
}
