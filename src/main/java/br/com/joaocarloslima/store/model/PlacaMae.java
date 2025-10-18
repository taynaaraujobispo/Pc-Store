package br.com.joaocarloslima.store.model;

public class PlacaMae extends Componente {
    private Socket socket;
    private TipoMemoria tipoMemoria;

    public PlacaMae() {}

    public PlacaMae(Long id, String nome, int consumo, double preco, Socket socket, TipoMemoria tipoMemoria) {
        super(id, nome, consumo, preco);
        this.socket = socket;
        this.tipoMemoria = tipoMemoria;
    }

    public Socket getSocket() { return socket; }
    public void setSocket(Socket socket) { this.socket = socket; }

    public TipoMemoria getTipoMemoria() { return tipoMemoria; }
    public void setTipoMemoria(TipoMemoria tipoMemoria) { this.tipoMemoria = tipoMemoria; }

    // verifica se CPU é compatível (mesmo socket)
    public boolean compativel(Cpu cpu) {
        if (cpu == null) return false;
        return this.socket == cpu.getSocket();
    }

    // verifica se RAM é compatível (mesmo tipo de memória)
    public boolean compativel(Ram ram) {
        if (ram == null) return false;
        return this.tipoMemoria == ram.getTipo();
    }
}
