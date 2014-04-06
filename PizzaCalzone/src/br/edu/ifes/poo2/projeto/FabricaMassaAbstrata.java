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
public abstract class FabricaMassaAbstrata {
    public abstract TipoMassa adicionarTipoMassa(String massa);
    public abstract String adicionarIngredientePrincipal(String ingrediente);
    public abstract Queijo adicionarQueijo();
    public abstract Tomate adicionarTomate();
}
