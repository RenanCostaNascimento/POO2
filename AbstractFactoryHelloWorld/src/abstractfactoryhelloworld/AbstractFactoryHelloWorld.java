/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractfactoryhelloworld;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Random;

/**
 *
 * @author Renan
 */
public class AbstractFactoryHelloWorld {

    public static void main(String[] args) {
        
        AbstractPrinterFactory factory = null;
        Random random = new Random();
        
        int numero = random.nextInt(2);
        
        if(numero == 0){
            factory = new ConsoleFactory();
        } else{
            factory = new FileFactory();
        }
        
        Printer printer = factory.createPrinter();
        printer.print("Hello World!");
    }
    
}
