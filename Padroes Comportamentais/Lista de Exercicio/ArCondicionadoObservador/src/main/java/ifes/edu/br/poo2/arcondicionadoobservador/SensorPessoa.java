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
public class SensorPessoa extends SensorAbstrato {

    private int quantidadePessoa;

    public void setQuantidadePessoa(int quantidadePessoa) {
        this.quantidadePessoa = quantidadePessoa;
        notificarObservadores();
    }

}
