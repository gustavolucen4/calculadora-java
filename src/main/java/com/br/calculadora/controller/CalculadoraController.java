/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.calculadora.controller;

import com.br.calculadora.conversor.Conversor;

/**
 *
 * @author gusta
 */
public class CalculadoraController {
    private double total = 0;
    private final Conversor conversor = new Conversor();


    public void calcular(String fracao1, String fracao2 ,String operador){  

        double conjunto1 = conversor.stringToDouble(conversor.removeLastChar(fracao1));
        double conjunto2 = conversor.stringToDouble(fracao2);

        switch(operador){
        case"+":
            this.total = conjunto1 + conjunto2;
            break;
        case"-":
            this.total = conjunto1 - conjunto2;
            break;
        case"*":
            this.total = conjunto1 * conjunto2;
            break;
        case"/":
            this.total = conjunto1 / conjunto2;
            break;
        }
    }

    public double getResultado(){
        return this.total;
    }
}
