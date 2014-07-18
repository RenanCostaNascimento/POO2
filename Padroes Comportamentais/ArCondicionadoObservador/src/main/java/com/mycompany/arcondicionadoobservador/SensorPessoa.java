/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arcondicionadoobservador;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author 20121bsi0252
 */
public class SensorPessoa extends SensorAbstrato{
    
    private int quantidadePessoa;
     
    public void mudarEstado(int quandidadePessoa) {
        this.quantidadePessoa = quandidadePessoa;
        notificar();
    }
    
    public void notificar() {
        arCondicionado.update(this, quantidadePessoa);
    }

    public void adicionarObservador(Observer observador) {
        this.arCondicionado = observador;
    }

    public void removerObservador(Observer observador) {
        this.arCondicionado = null;
    }    
}
