/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.br.poo2.arcondicionadoobservador;

import lombok.Getter;

/**
 *
 * @author 20121BSI0252
 */
@Getter
public class SensorTemperatura extends SensorAbstrato {

    private double temperatura;

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notificarObservadores();
    }

    
}
