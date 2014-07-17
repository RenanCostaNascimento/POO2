package ifes.edu.br.visitor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Interacao interacao = new Interacao();
        interacao.visitar(new Mouse());
        interacao.visitar(new Teclado());
    }
}
