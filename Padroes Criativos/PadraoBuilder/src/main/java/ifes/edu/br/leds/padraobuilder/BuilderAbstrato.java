/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.br.leds.padraobuilder;

/**
 *
 * @author 20121BSI0252
 */
public abstract class BuilderAbstrato {
    protected Refeicao refeicao;
    
    public BuilderAbstrato(){
        refeicao = new Refeicao();
    }
        
    public abstract void criarLanche();
    public abstract void criarBebida();
    public abstract void criarSobremesa();
    
    public Refeicao getRefeicao(){
        return refeicao;
    }

}
