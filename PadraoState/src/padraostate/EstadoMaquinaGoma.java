/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

/**
 *
 * @author 20121bsi0252
 */
public interface EstadoMaquinaGoma {
    
    public void puxarAlavanca();   
    
    public void inserirMoeda(int valorMoeda);
    
    public void ejetarMoeda();
    
    public void proximoEstado();
    
    public void ejetarGoma();
}


