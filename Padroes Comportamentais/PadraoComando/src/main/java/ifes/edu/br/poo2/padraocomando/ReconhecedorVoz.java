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
public class ReconhecedorVoz {
    private Comando comandoLigar, comandoDesligar;
    
    public ReconhecedorVoz(Comando comandoLigar, Comando comandoDesligar){
        this.comandoLigar = comandoLigar;
        this.comandoDesligar = comandoDesligar;
    }
    
    public void ligar(){
        comandoLigar.executar();
    }
    
    public void desligar(){
        comandoDesligar.executar();
    }
}
