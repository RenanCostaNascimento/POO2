/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractfactoryhelloworld;

/**
 *
 * @author Renan
 */
public class Console implements Printer{

    public void print(String texto) {
        System.out.println(texto);
    }
    
}
