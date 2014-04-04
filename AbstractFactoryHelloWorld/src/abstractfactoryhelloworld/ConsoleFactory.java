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
public class ConsoleFactory extends AbstractPrinterFactory {

    public Printer createPrinter() {
        return new Console();
    }
    
}
