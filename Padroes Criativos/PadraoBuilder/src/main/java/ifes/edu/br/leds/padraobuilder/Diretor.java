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
public class Diretor {
    public Refeicao criarRefeicao(BuilderAbstrato builderAbstrato){
        builderAbstrato.criarLanche();
        builderAbstrato.criarBebida();
        builderAbstrato.criarSobremesa();
        return builderAbstrato.getRefeicao();
    }
}
