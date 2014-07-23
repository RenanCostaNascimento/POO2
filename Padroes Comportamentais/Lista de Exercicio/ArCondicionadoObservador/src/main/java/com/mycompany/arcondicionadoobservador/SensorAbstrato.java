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
public abstract class SensorAbstrato extends Observable implements Sensor{
    protected Observer arCondicionado;
}
