package ifes.edu.br.leds.padraobuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Diretor diretor = new Diretor();
        BuilderAbstrato adulto = new BuilderRefeicaoAdulto();
        BuilderAbstrato crianca = new BuilderRefeicaoCrianca();
        System.out.println(diretor.criarRefeicao(adulto));
        System.out.println(diretor.criarRefeicao(crianca));
    }
}
