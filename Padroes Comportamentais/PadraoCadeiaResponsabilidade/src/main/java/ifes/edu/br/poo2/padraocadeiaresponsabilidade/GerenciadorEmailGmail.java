/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.br.poo2.padraocadeiaresponsabilidade;

/**
 *
 * @author Renan
 */
public class GerenciadorEmailGmail extends GerenciadorEmailAbstrato{

    @Override
    protected boolean aceitarEmail(String email) {
        return email.endsWith("@gmail.com");
    }

    @Override
    protected void moverEmail() {
        System.out.println("Movendo email para pasta do Gmail.");
    }
    
}
