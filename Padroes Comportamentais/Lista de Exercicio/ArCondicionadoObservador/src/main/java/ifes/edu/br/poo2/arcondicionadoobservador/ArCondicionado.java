/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.br.poo2.arcondicionadoobservador;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author 20121BSI0252
 */
@Getter
@Setter
public class ArCondicionado implements Observador {

    private static final int TEMPERATURA_IDEAL = 25;
    private double mediaTemperaturaInterna;
    private double mediaTemperaturaExterna;
    private int temperaturaConfigurada;
    private List<SensorAbstrato> sensoresPessoa;
    private List<SensorAbstrato> sensoresTemperatura;

    public ArCondicionado() {
        sensoresPessoa = new ArrayList<SensorAbstrato>();
        sensoresTemperatura = new ArrayList<SensorAbstrato>();
        mediaTemperaturaInterna = 0;
        mediaTemperaturaExterna = 0;
        temperaturaConfigurada = TEMPERATURA_IDEAL;
    }
    
    /**
     * Esse método está errado, mas o conceito do Observador está correto.
     */
    public void ajustarTemperatura() {
        double diferencaTemperaturaExterna = TEMPERATURA_IDEAL - mediaTemperaturaExterna;
        temperaturaConfigurada += (int) ((diferencaTemperaturaExterna + mediaTemperaturaInterna) / 2);
        System.out.println("Temperatura ajustada para: " + temperaturaConfigurada);
    }

    public void atualizar() {
        double somaPessoas = 0, somaTemperaturas = 0;

        for (SensorAbstrato sensorPessoa : sensoresPessoa) {
            SensorPessoa sensor = (SensorPessoa) sensorPessoa;
            somaPessoas += sensor.getQuantidadePessoa();
        }
        mediaTemperaturaInterna = somaPessoas / sensoresPessoa.size();

        for (SensorAbstrato sensorTemperatura : sensoresTemperatura) {
            SensorTemperatura sensor = (SensorTemperatura) sensorTemperatura;
            somaTemperaturas += sensor.getTemperatura();
        }
        mediaTemperaturaExterna = somaTemperaturas / sensoresTemperatura.size();

        ajustarTemperatura();
    }

    public void adicionarSensorTemperatura(Observado sensor) {
        sensoresTemperatura.add((SensorAbstrato) sensor);
    }

    public void adicionarSensorPessoa(Observado sensor) {
        sensoresPessoa.add((SensorAbstrato) sensor);
    }

}
