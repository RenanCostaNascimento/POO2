/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.projeto;

import br.ifes.edu.poo2.pizzaria.modelo.Queijo;
import br.ifes.edu.poo2.pizzaria.modelo.TipoMassa;
import br.ifes.edu.poo2.pizzaria.modelo.Tomate;

/**
 *
 * @author Renan
 */
public class FabricaMassa extends FabricaMassaAbstrata{

    public TipoMassa adicionarTipoMassa(String massa) {
        if(massa == "pizza")
            return TipoMassa.PIZZA;
        else
            return TipoMassa.CALZONE;
    }

    public String adicionarIngredientePrincipal(String ingrediente) {
        return new String(ingrediente);
    }

    @Override
    public Queijo adicionarQueijo() {
        return new Queijo();
    }

    @Override
    public Tomate adicionarTomate() {
        return new Tomate();
    }    
}
