package br.com.joaocarloslima.store.model;

public class Computador {
    private PlacaMae placaMae;
    private Cpu cpu;
    private Ram ram;
    private Fonte fonte;

    public Computador() {}

    // getters e setters
    public PlacaMae getPlacaMae() { return placaMae; }
    public void setPlacaMae(PlacaMae placaMae) { this.placaMae = placaMae; }

    public Cpu getCpu() { return cpu; }
    public void setCpu(Cpu cpu) { this.cpu = cpu; }

    public Ram getRam() { return ram; }
    public void setRam(Ram ram) { this.ram = ram; }

    public Fonte getFonte() { return fonte; }
    public void setFonte(Fonte fonte) { this.fonte = fonte; }

    /**
     * Retorna o status do computador seguindo as regras:
     * - Incompleto se faltar qualquer componente
     * - Incompatibilidade CPU x Placa Mãe
     * - Incompatibilidade RAM x Placa Mãe
     * - Fonte insuficiente (soma dos consumos > potencia da fonte)
     * - Completo e funcionando caso tudo ok
     */
    public String status() {
        if (cpu == null || placaMae == null || ram == null || fonte == null) {
            return "Computador incompleto";
        }

        if (!placaMae.compativel(cpu)) {
            return "Incompatibilidade entre CPU e Placa Mãe";
        }

        if (!placaMae.compativel(ram)) {
            return "Incompatibilidade entre RAM e Placa Mãe";
        }

        int consumoTotal = cpu.getConsumo() + placaMae.getConsumo() + ram.getConsumo();
        if ( consumoTotal > fonte.getPotencia()) {
            return "Fonte insuficiente para o sistema";
        }

        return "Computador completo e funcionando";
    }

    public double precoTotal() {
        double total = 0;
        if (cpu != null) total += cpu.getPreco();
        if (placaMae != null) total += placaMae.getPreco();
        if (ram != null) total += ram.getPreco();
        if (fonte != null) total += fonte.getPreco();
        return total;
    }
}
