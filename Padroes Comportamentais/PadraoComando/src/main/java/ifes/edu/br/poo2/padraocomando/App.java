package ifes.edu.br.poo2.padraocomando;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Radio radio = new Radio();
        ComandoLigar comandoLigar = new ComandoLigar(radio);
        ComandoDesligar comandoDesligar = new ComandoDesligar(radio);
        ReconhecedorVoz reconhecedorVoz = new ReconhecedorVoz(comandoLigar, comandoDesligar);
        
        reconhecedorVoz.ligar();
        reconhecedorVoz.desligar();
    }
}
