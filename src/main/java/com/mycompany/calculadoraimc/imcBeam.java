/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraimc;

import java.text.DecimalFormat;

/**
 *
 * @author Lucas
 */
public class imcBeam {

    private float peso;
    private float altura;

    public imcBeam() {
    }

    public imcBeam(String peso, String altura) {
        setPeso(peso);
        setAltura(altura);
    }

    public void status() {

        System.out.println("Peso: " + this.peso);
        System.out.println("altura: " + this.altura);

    }

    public float getAltura() {
        return this.altura;

    }

    public void setAltura(float altura) {
        this.altura = altura;

    }

    public void setAltura(String altura) {
        this.altura = (altura.matches("[0-9.]+") == false ? 0f : Float.parseFloat(altura));

    }

    public float getPeso() {
        return this.peso;

    }

    public void setPeso(float peso) {
        this.peso = peso;

    }

    public void setPeso(String peso) {
        this.peso = (peso.matches("[0-9.]+") == false ? 0f : Float.parseFloat(peso));

    }

    public String getResult() {
        Float imc = peso / (altura * altura);

        if (imc.isNaN()) {
            return "Erro não foi inserido valor";

        }

        StringBuilder result = new StringBuilder("IMC= " + new DecimalFormat("#.## ").format(imc));

        if (imc < 18) {
            result.append("Abaixo do peso");
        } else if (imc >= 18 && imc < 25) {
            result.append("Peso ideal");

        } else if (imc < 30) {
            result.append("acima do peso");
        } else if (imc < 35) {
            result.append("Obesidade Grau 1");

        } else if (imc < 40) {
            result.append("Obesidade Grau 2");

        } else {
            result.append("Obesidade morbida");
        }
        return result.toString();
    }
}