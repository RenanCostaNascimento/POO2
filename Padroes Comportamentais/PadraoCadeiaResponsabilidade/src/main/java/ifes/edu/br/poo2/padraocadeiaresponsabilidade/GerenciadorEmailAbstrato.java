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
public abstract class GerenciadorEmailAbstrato implements GerenciadorEmail {

    GerenciadorEmail proximoGerenciador;

    @Override
    public void setGerenciadorEmail(GerenciadorEmail gerenciadorEmail) {
        proximoGerenciador = gerenciadorEmail;
    }

    @Override
    public void gerenciarEmail(String email) {
        if (aceitarEmail(email)) {
            moverEmail();
        } else {
            if (proximoGerenciador != null) {
                proximoGerenciador.gerenciarEmail(email);
            } else {
                System.out.println("O email permanecera na caixa de entrada principal.");
            }
        }
    }
    protected abstract boolean aceitarEmail(String email);

    protected abstract void moverEmail();

}
