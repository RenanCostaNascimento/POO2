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
public class BuilderRefeicaoAdulto extends BuilderAbstrato{

    @Override
    public void criarLanche() {
        refeicao.setLanche(new LancheAdulto());
    }

    @Override
    public void criarBebida() {
        refeicao.setBebida(new BebidaAdulto());
    }

    @Override
    public void criarSobremesa() {
        refeicao.setSobremesa(new SobremesaAdulto());
    }   
    
}
