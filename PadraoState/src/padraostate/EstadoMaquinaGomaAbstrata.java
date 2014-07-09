/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

/**
 *
 * @author 20121bsi0252
 */
public abstract class EstadoMaquinaGomaAbstrata implements EstadoMaquinaGoma{
    
    protected abstract void ejetarMoeda();
    
    protected abstract void proximoEstado();
    
    protected abstract void ejetarGoma();
    
    @Override
    public abstract String toString();
    
}
