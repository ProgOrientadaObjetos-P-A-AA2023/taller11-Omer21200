/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete0;

/**
 *
 * @author luisa
 */
public class MenuEconomico extends Menu{
     private double porcentajeDes;

    public MenuEconomico(double porcenDes,String nomPlat, double valInM) {
        super(nomPlat, valInM);
        porcentajeDes = porcenDes;
    }
    public void establecerPorcentajeDesc(double porcenDes) {
        porcentajeDes = porcenDes;
    }
    
     public double obtenerPorcentajeDesc() {
        return porcentajeDes;
    }
    @Override
    public void calcularValorMenu() {
       double porcentaje = (valorI * porcentajeDes)/100;
       valorM = valorI - porcentaje;
    }

    @Override
    public String toString() {
                String Cadena = String.format("\nMenu Economico:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial  menu: $%.2f\n"
                + "\tPorcentaje descuento: %.2f porciento.\n"
                + "\tValor  Menu: $%.2f\n\n",
                nombreP,
                valorI,
                porcentajeDes,
                valorM);
        return Cadena;
    }

     
}
