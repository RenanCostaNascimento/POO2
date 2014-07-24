/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.br.poo2.padraofabricaabstrata;

/**
 *
 * @author Renan
 */
public class ProdutorFabrica {
    public static FabricaAbstrata criarFabrica(String fabrica){
        if(fabrica.equalsIgnoreCase("forma")){
            return new FabricaForma();
        }else{
            return new FabricaCor();
        }
    }
}
