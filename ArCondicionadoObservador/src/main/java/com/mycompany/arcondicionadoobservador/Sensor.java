/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arcondicionadoobservador;

import java.util.Observer;

/**
 *
 * @author 20121bsi0252
 */
public interface Sensor {
    public void mudarEstado(int valor);
    public void notificar();
    public void adicionarObservador(Observer observador);
    public void removerObservador(Observer observador);
}
