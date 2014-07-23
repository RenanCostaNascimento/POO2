/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.br.poo2.arcondicionadoobservador;

/**
 *
 * @author 20121BSI0252
 */
public interface Observado {
    public void notificarObservadores();
    public void adicionarObservador(Observador observador);
    public void removerObservador(Observador observador);
}
