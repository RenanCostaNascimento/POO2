/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

/**
 *
 * @author 20121bsi0252
 */
public class EstadoGomaVendida extends EstadoMaquinaGomaAbstrata{
    private MaquinaGoma maquinaGoma;
    
    public EstadoGomaVendida(MaquinaGoma maquinaGoma){
        this.maquinaGoma = maquinaGoma;
    }    

    @Override
    public void puxarAlavanca(){
        ejetarGoma();
    }

    @Override
    public void inserirMoeda(int valorMoeda){
        System.out.println("Pegue a sua goma primeiro!");
    }

    @Override
    public void ejetarMoeda() {}

    @Override
    public void proximoEstado() {
        if(maquinaGoma.getQuantidadeGomas() > 0){
            maquinaGoma.setEstadoAtual(maquinaGoma.getEstadoSemMoeda());
        }else{
            maquinaGoma.setEstadoAtual(maquinaGoma.getEstadoSemGoma());
        }
    }

    @Override
    public void ejetarGoma(){
        System.out.println("Aqui está sua goma!");
        maquinaGoma.setQuantidadeGomas(maquinaGoma.getQuantidadeGomas()-1);
        maquinaGoma.setSaldoMoedas(0);
        proximoEstado();
    }
    
    public String toString(){
        return "GomaVendida";
    }
    
}
