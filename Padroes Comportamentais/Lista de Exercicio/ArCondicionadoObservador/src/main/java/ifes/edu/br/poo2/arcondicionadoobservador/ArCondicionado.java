/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.br.poo2.arcondicionadoobservador;

import java.util.List;

/**
 *
 * @author 20121BSI0252
 */
public class ArCondicionado implements Observador{
    private double mediaTemperaturaInterna;
    private double mediaTemperaturaExterna;
    private double temperaturaConfigurada;
    private List<SensorAbstrato> sensoresPessoa;
    private List<SensorAbstrato> sensoresTemperatura;
    
    public void ajustarTemperatura(){
        
    }

    public void atualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
