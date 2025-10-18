package com.example;
public class Carta {

    private final String rank; // "A", "2", ..., "10", "J", "Q", "K"
    private final Naipe naipe;

    public Carta(String rank, Naipe naipe) {
        this.rank = rank;
        this.naipe = naipe;
    }

    public int getPontos() {
        if ("A".equals(rank)) return 1;
        if ("J".equals(rank) || "Q".equals(rank) || "K".equals(rank)) return 10;
        try {
            return Integer.parseInt(rank); 
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public String getRank() {
        return rank;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public String imagePath() {
        final String base = "/com/example/classic-cards/";

        String rankForImage;
        switch (rank) {
            case "A": rankForImage = "Ace"; break;
            case "J": rankForImage = "Jack"; break;
            case "Q": rankForImage = "Queen"; break;
            case "K": rankForImage = "King"; break;
            default: rankForImage = rank; 
        }

        return base + rankForImage + naipe.getNome() + ".png";
    }

    @Override
    public String toString() {
        return rank + " of " + naipe.getNome();
    }
}
