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
public class ComandoDesligar implements Comando{

    Radio radio;
    
    public ComandoDesligar (Radio radio){
        this.radio = radio;
    }
    
    public void executar() {
        radio.desligar();
    }
    
}
