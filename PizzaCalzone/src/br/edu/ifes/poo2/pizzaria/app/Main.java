/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.poo2.pizzaria.app;

import br.edu.ifes.poo2.projeto.FabricaMassa;
import br.edu.ifes.poo2.projeto.FabricaMassaAbstrata;
import br.ifes.edu.poo2.pizzaria.modelo.Massa;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Renan
 */
public class Main {
    
    public static void main(String []args){
        
        FabricaMassaAbstrata fabricaAbstrataMassa = new FabricaMassa();
        Calendar calendar = new GregorianCalendar();
        Massa massa = new Massa();
        boolean pizzariaAberta = true;
        
        if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            pizzariaAberta = false;
        }else{
            if(calendar.get(Calendar.DAY_OF_WEEK) == calendar.get(Calendar.DAY_OF_WEEK) || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY || 
                calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY){
                massa.setIngredientePrincipal("Presunto");
            }else{
                massa.setIngredientePrincipal("Calabresa");
            }
        }
        
        massa.setTipoMassa(fabricaAbstrataMassa.adicionarTipoMassa("pizza"));   
        massa.setQueijo(fabricaAbstrataMassa.adicionarQueijo());
        massa.setTomate(fabricaAbstrataMassa.adicionarTomate());
        
        if(pizzariaAberta)
            System.out.println(massa.toString());
        else
            System.out.println("Pizzaria fechada");
    }
    
}
