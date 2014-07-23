/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.br.poo2.arcondicionadoobservador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20121BSI0252
 */
public abstract class SensorAbstrato implements Observado{
    
    private List<Observador> arCondicionado;
    
    public SensorAbstrato(){
        arCondicionado = new ArrayList<ArCondicionado>();
    }
    
    public void adicionarObservador(Observador observador){
        this.arCondicionado.add(observador);
    }
}
