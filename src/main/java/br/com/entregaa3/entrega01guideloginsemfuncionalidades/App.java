package br.com.entregaa3.entrega01guideloginsemfuncionalidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 823135401
 */
import java.io.FileInputStream;
import java.io.File;
import java.util.Properties;
public class App {

    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("conf.properties")));
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimeiraTela(properties).setVisible(true);
            }
        });
    }
}

