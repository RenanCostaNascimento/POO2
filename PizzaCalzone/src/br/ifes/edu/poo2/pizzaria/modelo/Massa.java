/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ifes.edu.poo2.pizzaria.modelo;

/**
 *
 * @author Renan
 */
public class Massa {
    
    private String ingredientePrincipal;
    private Queijo queijo;
    private Tomate tomate;
    private TipoMassa tipoMassa;

    public String getIngredientePrincipal() {
        return ingredientePrincipal;
    }

    public void setIngredientePrincipal(String ingredientePrincipal) {
        this.ingredientePrincipal = ingredientePrincipal;
    }

    public Queijo getQueijo() {
        return queijo;
    }

    public void setQueijo(Queijo queijo) {
        this.queijo = queijo;
    }

    public Tomate getTomate() {
        return tomate;
    }

    public void setTomate(Tomate tomate) {
        this.tomate = tomate;
    }
    
    public TipoMassa getTipoMassa() {
        return tipoMassa;
    }

    public void setTipoMassa(TipoMassa tipoMassa) {
        this.tipoMassa = tipoMassa;
    }
    
    public String toString(){
        return tipoMassa.toString() + " de " + ingredientePrincipal + " - " + ingredientePrincipal + ", " + queijo.toString() + ", " + tomate.toString() + ".";
    }
}
