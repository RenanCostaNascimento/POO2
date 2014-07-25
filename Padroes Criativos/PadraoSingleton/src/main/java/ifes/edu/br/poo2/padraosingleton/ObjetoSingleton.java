/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.br.poo2.padraosingleton;

/**
 *
 * @author Renan
 */
public class ObjetoSingleton {

    private static ObjetoSingleton instanciaUnica;
    
    private ObjetoSingleton() { }
    
    public static ObjetoSingleton getInstancia(){
        if(instanciaUnica == null){
            instanciaUnica = new ObjetoSingleton();
        }
        return instanciaUnica;
    }
    
    @Override
    public String toString(){
        return "Instancia única!";
    }
}
