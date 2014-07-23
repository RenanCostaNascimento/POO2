/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ifes.edu.sr.main;

import br.ifes.edu.sr.padrao.BuilderContato;
import br.ifes.edu.sr.padrao.BuilderContatoCompleto;
import br.ifes.edu.sr.padrao.BuilderContatoInternet;
import br.ifes.edu.sr.cdp.ContatoCompleto;
import br.ifes.edu.sr.cdp.ContatoInternet;
import br.ifes.edu.sr.padrao.DirectorContato;
import br.ifes.edu.sr.padrao.DirectorContatoCompleto;
import br.ifes.edu.sr.padrao.DirectorContatoInternet;

/**
 *
 * @author Renan
 */
public class Client {
    
    public static void main(String args[]){
        
        ContatoCompleto contato = new ContatoCompleto();
        BuilderContato builder = new BuilderContatoCompleto(contato);
        DirectorContato director = new DirectorContatoCompleto();
        director.build(builder);
        
        System.out.println(contato.toString());
        
        ContatoInternet contatoInternet = new ContatoInternet();
        builder = new BuilderContatoInternet(contatoInternet);
        director = new DirectorContatoInternet();
        director.build(builder);
        
        System.out.println(contatoInternet.toString());
        
    }
    
}
