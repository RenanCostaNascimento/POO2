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
public class Main {
    public static void main(String args[]){
        
        GerenciadorEmail gerenciadorEmailGmail = new GerenciadorEmailGmail();
        gerenciadorEmailGmail.setGerenciadorEmail(new GerenciadorEmailOutlook());
        
        System.out.println("Novo email de renan@gmail.com");
        gerenciadorEmailGmail.gerenciarEmail("renan@gmail.com");
        System.out.println("Novo email de renan@outlook.com");
        gerenciadorEmailGmail.gerenciarEmail("renan@outlook.com");
        System.out.println("Novo email de renan@uol.com");
        gerenciadorEmailGmail.gerenciarEmail("renan@uol.com");
        
    }
}
