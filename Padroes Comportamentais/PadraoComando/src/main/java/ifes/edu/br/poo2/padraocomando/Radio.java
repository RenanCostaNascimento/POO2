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
public class Radio {
    private boolean ligado;
    
    public Radio(){
        ligado = false;
    }
    
    public void desligar(){
        if(ligado){
            ligado = false;
            System.out.println("Desligando o rádio...");
        }
    }
    
    public void ligar(){
        if(!ligado){
            ligado = true;
            System.out.println("Ligando o rádio...");
        }
    }
}
