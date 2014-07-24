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
public class FabricaCor {

    public Cor criarCor(String cor) {
        if (cor.equalsIgnoreCase("vermelho")) {
            return new Vermelho();
        } else {
            if (cor.equalsIgnoreCase("azul")) {
                return new Azul();
            } else {
                return new Verde();
            }
        }
    }

}
