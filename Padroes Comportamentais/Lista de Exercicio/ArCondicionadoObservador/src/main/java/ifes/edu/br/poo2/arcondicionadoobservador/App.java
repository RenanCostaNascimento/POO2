package ifes.edu.br.poo2.arcondicionadoobservador;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ArCondicionado arCondicionado = new ArCondicionado();

        SensorPessoa sensorPessoa1 = new SensorPessoa();
        sensorPessoa1.adicionarObservador(arCondicionado);

        SensorPessoa sensorPessoa2 = new SensorPessoa();
        sensorPessoa2.adicionarObservador(arCondicionado);

        SensorTemperatura sensorTemperatura1 = new SensorTemperatura();
        sensorTemperatura1.adicionarObservador(arCondicionado);

        SensorTemperatura sensorTemperatura2 = new SensorTemperatura();
        sensorTemperatura2.adicionarObservador(arCondicionado);

        arCondicionado.adicionarSensorPessoa(sensorPessoa1);
        arCondicionado.adicionarSensorPessoa(sensorPessoa2);
        arCondicionado.adicionarSensorTemperatura(sensorTemperatura1);
        arCondicionado.adicionarSensorTemperatura(sensorTemperatura2);

        sensorPessoa1.setQuantidadePessoa(3);
        sensorPessoa1.setQuantidadePessoa(6);
        sensorTemperatura1.setTemperatura(29.0);
        sensorTemperatura2.setTemperatura(22.0);
    }
}
