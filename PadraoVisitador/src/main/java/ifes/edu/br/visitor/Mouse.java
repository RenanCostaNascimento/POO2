/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.br.visitor;

/**
 *
 * @author 20121BSI0252
 */
public class Mouse implements Visitavel{

    public void aceitarVisitador(Visitador visitador) {
        visitador.visitar(this);
    }
    
}
