package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *baralho
 * - cria as 52 cartas
 * - embaralha
 * - virar() retorna/removes a carta do topo
 */
public class Monte {

    private final List<Carta> cartas; //lista

    public Monte() {
        this.cartas = new ArrayList<>();
        criarBaralho();
    }

    // Cria as 52 cartas (A,2..10,J,Q,K) para cada naipe
    private void criarBaralho() {
        List<String> ranks = List.of("A","2","3","4","5","6","7","8","9","10","J","Q","K");
        for (Naipe n : Naipe.values()) {
            for (String r : ranks) {
                cartas.add(new Carta(r, n));
            }
        }
    }

    // Embaralha as cartas
    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    // Vira (remove) a carta do topo (index 0). Retorna null se vazio.
    public Carta virar() {
        if (cartas.isEmpty()) return null;
        return cartas.remove(0); //retira uma carta do baralho e a devolve para quem chamou o método.
    }

    // Tamanho restante do monte
    public int tamanho() {
        return cartas.size();
    }
}
