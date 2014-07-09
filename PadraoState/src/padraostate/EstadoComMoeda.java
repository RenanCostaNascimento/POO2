/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

/**
 *
 * @author 20121bsi0252
 */
public class EstadoComMoeda extends EstadoMaquinaGomaAbstrata{
    private MaquinaGoma maquinaGoma;
    
    public EstadoComMoeda(MaquinaGoma maquinaGoma){
        this.maquinaGoma = maquinaGoma;
    }    
        
    @Override
    public void puxarAlavanca() {
        if(maquinaGoma.getSaldoMoedas() == 1){
            proximoEstado();
        }else{
            ejetarMoeda();
        }
    }

    @Override
    public void inserirMoeda(int valorMoeda){
        System.out.println("Essa máquina só aceita uma moeda por vez.");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("É preciso inserir uma moeda de um real. Aqui está a sua de volta.");
        maquinaGoma.setSaldoMoedas(0);
        proximoEstado();
    }

    @Override
    public void proximoEstado() {
        if(maquinaGoma.getSaldoMoedas() == 0){
            maquinaGoma.setEstadoAtual(maquinaGoma.getEstadoSemMoeda());
        }else{
            maquinaGoma.setEstadoAtual(maquinaGoma.getEstadoGomaVendida());
        }
    }

    @Override
    public void ejetarGoma(){
        System.out.println("Se você quer uma goma, puxe a alavanca!");
    }
    
    @Override
    public String toString(){
        return "Com moeda.";
    }
    
}
