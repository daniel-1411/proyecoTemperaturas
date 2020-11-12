/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofittempprovincias;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author FP Mañana A
 */
public class ClasePrincipal extends Application implements PeticionXML.ComunicacionPedirClima, PeticionXML2.ComunicacionPedirClima{
    PeticionXML p;
    PeticionXML2 p2;
    static TableView tv;
    static VBox vbox=null;
   public static void main(String[] args) {
        launch(args);
        
    }
   
   
   
    @Override
    public void start(Stage stage) throws Exception {
        p=new PeticionXML(new ClasePrincipal());
        PeticionXML.pedirProvicias();
        p2=new PeticionXML2(new ClasePrincipal());
        PeticionXML2.pedirMunicipios();
        VBox v=new VBox(30);
        vbox=v;
        ChoiceBox combo_p=new ChoiceBox();
        ArrayList<Provinciero> lista_nombre = new ArrayList();
        Provinciero provincias1=new Provinciero();
        for (Provinciero x : lista_nombre) {
            String n=x.getNombre();
            lista_nombre.add(n);
        }
        /*for (Provinciero x : provincias1) {
            String n=x.getNombre();
            lista_nombre.add(n);
        }*/
        v.getChildren().addAll();
        Scene escena=new Scene(v,500,400);
        stage.setScene(escena);
        stage.show();
    }
    
    
    public static void imprimirDatos(ClaseRaiz r)
    {
        System.out.println("DATOS: "+r);
    }

    @Override
    public void mostrarDatos(ClaseRaiz r) {
        System.out.println("DATOS: "+r);
    }

    @Override
    public void mostrarDatos(ClaseRaiz2 r) {
        System.out.println("DATOS MUNICIPIOS: "+r);
    }
}
