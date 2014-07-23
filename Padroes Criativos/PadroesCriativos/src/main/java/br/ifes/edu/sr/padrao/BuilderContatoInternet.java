/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ifes.edu.sr.padrao;

import br.ifes.edu.sr.cdp.Contato;
import br.ifes.edu.sr.cdp.ContatoInternet;

/**
 *
 * @author Renan
 */
public class BuilderContatoInternet extends BuilderContato{

    private ContatoInternet contatoInternet;
    
    public BuilderContatoInternet(ContatoInternet contato){
        this.contatoInternet = contato;
    }
    
    @Override
    public void armazenarEmail(String email){
        this.contatoInternet.setEmail(email);
    }    
    
    @Override
    public void armazenarNome(String nome){
        this.contatoInternet.setNome(nome);
    }    

    @Override
    public Contato getContato() {
        return this.contatoInternet;
    }
    
}
