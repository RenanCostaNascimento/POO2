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
public abstract class DirectorContato {
    
    public abstract Contato build(BuilderContato builderContato);
    
}
