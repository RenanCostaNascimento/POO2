/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ifes.edu.sr.padrao;

import br.ifes.edu.sr.cdp.Contato;

/**
 *
 * @author Renan
 */
public class DirectorContatoCompleto extends DirectorContato{
    
    @Override
    public Contato build(BuilderContato builderContato){
        
        builderContato.armazenarNome("Nome");
        builderContato.armazenarTelefone("Telefone");
        builderContato.armazenarEndereco("Endereco");
        builderContato.armazenarEmail("Email");
        
        return builderContato.getContato();
    }
    
}
