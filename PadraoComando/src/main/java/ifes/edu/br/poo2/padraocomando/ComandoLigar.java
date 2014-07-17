/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.br.poo2.padraocomando;

/**
 *
 * @author 20121BSI0252
 */
public class ComandoLigar implements Comando{
    
    Radio radio;
    
    public ComandoLigar(Radio radio){
        this.radio = radio;
    }

    public void executar() {
        radio.ligar();
    }
    
}
