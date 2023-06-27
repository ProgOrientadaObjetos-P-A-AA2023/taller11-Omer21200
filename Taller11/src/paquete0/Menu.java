/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete0;

/**
 *
 * @author luisa
 */
public abstract class Menu {
     protected String nombreP;
    protected double valorI;
    protected double valorM;

    public Menu(String nomPlat, double valInM) {
        nombreP = nomPlat;
        valorI = valInM;
    }

    

    public void establecerNombrePlato(String nomPlat) {
        nombreP = nomPlat;
    }

    
    public void establecerValorInicialMenu(double valInM) {
        valorI = valInM;
    }
    
    public abstract void calcularValorMenu();
    
    
    public double obtenerValorInicialMenu() {
        return valorI;
    }
    
    public String obtenerNombrePlato() {
        return nombreP;
    }
    
    public double obtenerValorMenu() {
        return valorM;
    }
}
