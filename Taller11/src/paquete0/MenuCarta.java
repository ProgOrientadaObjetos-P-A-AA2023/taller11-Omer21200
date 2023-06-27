/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete0;

/**
 *
 * @author luisa
 */
public class MenuCarta extends Menu{
     private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeAdd;
    
    public MenuCarta(double valorG, double valorB, double porA,
            String nomPlat, double valInM) {
        super(nomPlat, valInM);
        valorGuarnicion = valorG;
        valorBebida = valorB;
        porcentajeAdd = porA;
    }

    public void establecerValorGuarnicion(double valorG) {
        valorGuarnicion = valorG;
    }
    
     public void establecerValorBebida(double valorB) {
        valorBebida = valorB;
    }
    
     public void establecerPorcentajeAdd(double porA) {
        porcentajeAdd = porA;
    }
    
    public double obtenerValorGuarnicion() {
        return valorGuarnicion;
    }
    
        @Override
     public void calcularValorMenu() {
        double aux = (valorI * porcentajeAdd)/100;
        valorM = valorI + valorBebida + valorGuarnicion + aux;
    }
     
    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    public double obtenerPorcentajeAdd() {
        return porcentajeAdd;
    }
    
    @Override
    public String toString() {
        String Cadena = String.format("\nMenu a la Carta:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial del menu: $%.2f\n"
                + "\tValor porcion de guarnicion: $%.2f\n"
                + "\tValor bebida: $%.2f\n"
                + "\tPorcentaje adicional: %.2f porciento.\n\n",
                nombreP,
                valorI,
                valorGuarnicion,
                valorBebida,
                porcentajeAdd,
                valorM);
        return Cadena;
    }
}
