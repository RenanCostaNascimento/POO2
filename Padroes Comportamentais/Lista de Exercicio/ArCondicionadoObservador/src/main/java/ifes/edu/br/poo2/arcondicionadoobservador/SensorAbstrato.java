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
public abstract class SensorAbstrato implements Observado {

    private List<Observador> aresCondicionados;

    public SensorAbstrato() {
        aresCondicionados = new ArrayList<Observador>();
    }

    public void adicionarObservador(Observador arCondicionado) {
        this.aresCondicionados.add(arCondicionado);
    }

    public void notificarObservadores() {
        for (Observador arCondicionado : aresCondicionados) {
            arCondicionado.atualizar();
        }
    }
}
