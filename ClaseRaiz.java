/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofittempprovincias;

import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 *
 * @author FP Mañana A
 */
@Root(name="consulta_provinciero", strict =false)
public class ClaseRaiz {
    @ElementList
    private List<Provinciero> provinciero;
    
    public List<Provinciero> getPrediccion() {
        return provinciero;
    }

    public void setPrediccion(List<Provinciero> prediccion) {
        this.provinciero = prediccion;
    }

    @Override
    public String toString() {
        return "ClaseRaiz{" + "prediccion=" + provinciero + '}';
    }
    
}