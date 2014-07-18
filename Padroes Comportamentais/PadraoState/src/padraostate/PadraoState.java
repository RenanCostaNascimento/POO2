/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostate;

import java.util.Scanner;

/**
 *
 * @author 20121bsi0252
 */
public class PadraoState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MaquinaGoma maquinaGoma = new MaquinaGoma();
        maquinaGoma.setEstadoAtual(maquinaGoma.getEstadoSemMoeda());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estado atual da maquina: " + maquinaGoma.getEstadoAtual().toString());
        System.out.println("O que vai fazer?\n"
                + "1 - inserir moeda\n"
                + "2 - puxar alavanda");
        int opcao = scanner.nextInt();
        while (opcao != 0) {

            if (opcao == 1) {
                System.out.println("Qual valor?");
                int valor = scanner.nextInt();
                maquinaGoma.getEstadoAtual().inserirMoeda(valor);
            } else {
                maquinaGoma.getEstadoAtual().puxarAlavanca();
            }
            System.out.println("Estado atual da maquina: " + maquinaGoma.getEstadoAtual().toString());
            System.out.println("O que vai fazer?\n"
                    + "1 - inserir moeda\n"
                    + "2 - puxar alavanda");
            opcao = scanner.nextInt();
        }

    }
}
