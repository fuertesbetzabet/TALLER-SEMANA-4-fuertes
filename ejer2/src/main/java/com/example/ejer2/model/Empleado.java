/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ejer2.model;

/**
 *
 * @author LAB_P03
 */
public class Empleado {
     private double sueldoBase;
    private int horasExtra;
    private double sueldoTotal;

    // Getters y Setters
    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void calcularSueldoTotal() {
        double tarifaPorHora = sueldoBase / 160;
        this.sueldoTotal = sueldoBase + (horasExtra * tarifaPorHora);
    }
}
