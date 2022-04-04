/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.calculadora.app;

import com.br.visao.VisaoCalc;

/**
 *
 * @author gusta
 */
public class App {
    
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisaoCalc().setVisible(true);
            }
        });
    }
}
