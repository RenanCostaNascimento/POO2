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
public class Refeicao {
    private Lanche lanche;
    private Bebida bebida;
    private Sobremesa sobremesa;
    
    @Override
    public String toString(){
        return lanche.toString() + bebida.toString() + sobremesa.toString();
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Sobremesa getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(Sobremesa sobremesa) {
        this.sobremesa = sobremesa;
    }
    
    
}
