/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

/**
 *
 * @author 20121bsi0252
 */
public class EstadoSemGoma extends EstadoMaquinaGomaAbstrata{
    private MaquinaGoma maquinaGoma;
    
    public EstadoSemGoma(MaquinaGoma maquinaGoma){
        this.maquinaGoma = maquinaGoma;
    }    
    
    @Override
    public void puxarAlavanca() {
        System.out.println("Acabaram as gomas!");
    }

    @Override
    public void inserirMoeda(int valorMoeda) {
        System.out.println("Acabaram as gomas!");
        ejetarMoeda();
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Aqui está sua moeda de volta.");
    }

    @Override
    public void proximoEstado() {}

    @Override
    public void ejetarGoma() {
        System.out.println("Acabaram as gomas!");
    }

    @Override
    public String toString() {
        return "Sem goma.";
    }
    
}
