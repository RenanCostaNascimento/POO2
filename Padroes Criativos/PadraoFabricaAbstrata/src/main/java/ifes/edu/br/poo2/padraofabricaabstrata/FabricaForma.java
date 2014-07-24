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
public class FabricaForma extends FabricaAbstrata {

    @Override
    public Forma criarForma(String forma) {
        if (forma.equalsIgnoreCase("retangulo")) {
            return new Retangulo();
        } else {
            if (forma.equalsIgnoreCase("circulo")) {
                return new Circulo();
            } else {
                return new Triangulo();
            }
        }
    }

    @Override
    public Cor criarCor(String cor) {
        return null;
    }

}
