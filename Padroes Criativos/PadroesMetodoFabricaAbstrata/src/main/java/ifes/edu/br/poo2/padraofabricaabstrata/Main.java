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
        FabricaCor fabricaCor = ProdutorFabrica.criarFabricaCor();
        
        Cor cor = fabricaCor.criarCor("vermelho");
        cor.pintar();
        
        cor = fabricaCor.criarCor("azul");
        cor.pintar();
        
        cor = fabricaCor.criarCor("verde");
        cor.pintar();
        
        FabricaForma fabricaForma = ProdutorFabrica.criarFabricaForma();
        
        Forma forma = fabricaForma.criarForma("retangulo");
        forma.desenhar();
        
        forma = fabricaForma.criarForma("circulo");
        forma.desenhar();
        
        forma = fabricaForma.criarForma("triangulo");
        forma.desenhar();
    }
}
