/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

/**
 *
 * @author 20121bsi0252
 */
public class MaquinaGoma {
    private int saldoMoedas;
    private int quantidadeGomas;
    
    private EstadoMaquinaGoma estadoAtual;
    private EstadoMaquinaGoma estadoSemMoeda;
    private EstadoMaquinaGoma estadoComMoeda;
    private EstadoMaquinaGoma estadoGomaVendida;
    private EstadoMaquinaGoma estadoSemGoma;
    
    public MaquinaGoma(){
        estadoSemMoeda = new EstadoSemMoeda(this);
        estadoComMoeda = new EstadoComMoeda(this);
        estadoGomaVendida = new EstadoGomaVendida(this);
        estadoSemGoma = new EstadoSemGoma(this);
        quantidadeGomas = 2;
    }
    
    public void setEstadoAtual(EstadoMaquinaGoma estadoAtual) {
        this.estadoAtual = estadoAtual;
    }
    
    public int getSaldoMoedas() {
        return saldoMoedas;
    }

    public void setSaldoMoedas(int saldoMoedas) {
        this.saldoMoedas = saldoMoedas;
    }

    public int getQuantidadeGomas() {
        return quantidadeGomas;
    }

    public void setQuantidadeGomas(int quantidadeGomas) {
        this.quantidadeGomas = quantidadeGomas;
    }

    public EstadoMaquinaGoma getEstadoAtual() {
        return estadoAtual;
    }

    public EstadoMaquinaGoma getEstadoSemMoeda() {
        return estadoSemMoeda;
    }

    public EstadoMaquinaGoma getEstadoComMoeda() {
        return estadoComMoeda;
    }

    public EstadoMaquinaGoma getEstadoGomaVendida() {
        return estadoGomaVendida;
    }

    public EstadoMaquinaGoma getEstadoSemGoma() {
        return estadoSemGoma;
    }
}
