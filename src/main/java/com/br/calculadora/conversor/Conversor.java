/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.calculadora.conversor;

import javax.swing.JLabel;

/**
 *
 * @author gusta
 */
public class Conversor {
    
    public double stringToDouble(String str){
        return Double.parseDouble(str);
    }

    public String doubleToString(double num){
        return Double.toString(num);
    }

    public String removeLastChar(String valor){
        return valor.substring(0, valor.length()-1);
    }
}
