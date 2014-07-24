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
public class Main {
    public static void main(String args[]){
        FabricaAbstrata fabrica = ProdutorFabrica.criarFabrica("cor");
        
        Cor cor = fabrica.criarCor("vermelho");
        cor.pintar();
        
        cor = fabrica.criarCor("azul");
        cor.pintar();
        
        cor = fabrica.criarCor("verde");
        cor.pintar();
        
        fabrica = ProdutorFabrica.criarFabrica("forma");
        
        Forma forma = fabrica.criarForma("retangulo");
        forma.desenhar();
        
        forma = fabrica.criarForma("circulo");
        forma.desenhar();
        
        forma = fabrica.criarForma("triangulo");
        forma.desenhar();
    }
}
