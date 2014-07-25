/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.br.poo2.padraosingleton;

/**
 *
 * @author Renan
 */
public class Main {
    public static void main(String args[]){
        ObjetoSingleton objeto = ObjetoSingleton.getInstancia();
        System.out.println(objeto.toString());
    }
}
