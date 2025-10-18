package com.example;
public class Jogo {

    private final Monte monte;      
    public final Jogador jogador;   
    public final Computador computador; 

    public Jogo() {
        this.monte = new Monte();   
        this.monte.embaralhar();    
        this.jogador = new Jogador();
        this.computador = new Computador();
    }

    public Carta distribuirCarta(Jogador p) {
        if (p.isParou()) return null;  // se parou, não distribui
        Carta c = monte.virar();       // pega do topo
        if (c == null) return null;    
        p.receberCarta(c);             
        return c;
    }

    /**
     * acabou — verifica se partida terminou:
     * - se qualquer um ultrapassou 21 -> acabou
     * - se ambos pararam (jogador parou explicitamente e computador segundo sua estratégia)
     */
    public boolean acabou() {
        if (jogador.getPontos() > 21 || computador.getPontos() > 21) return true;
        if (jogador.isParou() && computador.deveParar()) return true;
        return false;
    }

    public String resultado() {
        int pontosJogador = jogador.getPontos();
int pontosComputador = computador.getPontos();

// Verifica se ambos estouraram (mais de 21 pontos)
if (pontosJogador > 21 && pontosComputador > 21) {
    return "Empate (ambos estouraram)";
}

// Verifica se algum jogador estourou
if (pontosJogador > 21) {
    return "Você perdeu (estourou)";
}
if (pontosComputador > 21) {
    return "Você ganhou (computador estourou)";
}

// Comparação de pontos para determinar o vencedor
if (pontosJogador > pontosComputador) {
    return "Você ganhou";
} else if (pontosJogador < pontosComputador) {
    return "Você perdeu";
} else {
    return "Empate";
}
    }
}
