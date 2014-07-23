/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ifes.edu.sr.padrao;

import br.ifes.edu.sr.cdp.Contato;
import br.ifes.edu.sr.cdp.ContatoCompleto;

/**
 *
 * @author Renan
 */
public class BuilderContatoCompleto extends BuilderContato{
    private ContatoCompleto contatoCompleto;
    
    public BuilderContatoCompleto(ContatoCompleto contato){
        this.contatoCompleto = contato;
    }
    
    @Override
    public void armazenarNome(String nome){
        this.contatoCompleto.setNome(nome);
    }
    
    @Override
    public void armazenarTelefone(String telefone){
        this.contatoCompleto.setTelefone(telefone);
    }
    
    @Override
    public void armazenarEndereco(String endereco){
        this.contatoCompleto.setEndereco(endereco);
    }
    
    @Override
    public void armazenarEmail(String email){
        this.contatoCompleto.setEmail(email);
    }

    @Override
    public Contato getContato() {
        return this.contatoCompleto;
    }
}
