/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

/**
 *
 * @author 20121bsi0252
 */
public class EstadoSemMoeda extends EstadoMaquinaGomaAbstrata {

    private MaquinaGoma maquinaGoma;
    private static final String SEM_GOMA = "A máquina está sem gomas, aqui está sua moeda de volta";
    private static final String MOEDA_ERRADA = "A máquina está sem gomas, aqui está sua moeda de volta";

    public EstadoSemMoeda(MaquinaGoma maquinaGoma) {
        this.maquinaGoma = maquinaGoma;
    }

    @Override
    public void puxarAlavanca() {
        System.out.println("Você precisa inserir uma moeda de 1 real para comprar uma goma.");
    }

    @Override
    public void inserirMoeda(int valorMoeda) {
        maquinaGoma.setSaldoMoedas(valorMoeda);
        proximoEstado();
    }

    @Override
    public void ejetarMoeda(){
        System.out.println("A máquina não tem moeda!");
    }

    @Override
    public void proximoEstado() {
        maquinaGoma.setEstadoAtual(maquinaGoma.getEstadoComMoeda());
    }

    @Override
    public void ejetarGoma(){
        System.out.println("Se você quer uma goma, me dê uma moeda!");
    }

    @Override
    public String toString() {
        return "Sem moeda";
    }
}
