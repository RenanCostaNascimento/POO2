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
public abstract class FabricaAbstrata {
    protected static final String classPath = "ifes.edu.br.poo2.padraofabricaabstrata.";
    
    public abstract Forma criarForma(String forma);
    public abstract Cor criarCor(String cor);
}
