package br.com.joaocarloslima.store.model;

public class Cpu extends Componente {
    private Socket socket;

    public Cpu() {}

    public Cpu(Long id, String nome, int consumo, double preco, Socket socket) {
        super(id, nome, consumo, preco); //herda de componente
        this.socket = socket;
    }

    public Socket getSocket() { return socket; }
    public void setSocket(Socket socket) { this.socket = socket; }
}
