package com.example;
public enum Naipe {
    CLUBS("Clubs"),        
    DIAMONDS("Diamonds"),  
    HEARTS("Hearts"),      
    SPADES("Spades");     

    private final String nome; 

    // Construtor do enum, armazena o nome.
    Naipe(String nome) {
        this.nome = nome;
    }

    // Retorna o nome do naipe 
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
