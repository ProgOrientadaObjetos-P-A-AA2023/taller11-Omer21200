/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete0;

import java.util.List;

/**
 *
 * @author luisa
 */
public class Cuenta {
    private String nombreCliente;
    private List<Menu> menu;
    private double valorTotal;
    private double valorSubtotal;
    private double valorIva;

    public Cuenta(String nombreClie, List<Menu> men, double valIv) {
        nombreCliente = nombreClie;
        menu = men;
        valorIva = valIv;
    }

    

    public void establecerNombreCliente(String nombreClie ) {
        nombreCliente = nombreClie;
    }
    
    public void establecerMenus(List<Menu> men) {
        menu = men;
    }
    
     public void calcularValorTotal() {
        double valTot = (valorSubtotal * valorIva)/100;
        valorTotal = valorSubtotal + valTot;
    }
    
     public void calcularValorSubtotal() {
        double suma = 0;
        for (int i = 0; i < menu.size(); i++) {
            suma += menu.get(i).obtenerValorMenu();
        }

        valorSubtotal = suma;
    }
     
     public void establecerValorIva(double v) {
        valorIva = v;
    }
     
    public String obtenerNombreCliente() {
        return nombreCliente;
    }
    
    public List<Menu> obtenerMenus() {
        return menu;
    }


    public double obtenerValorTotal() {
        return valorTotal;
    }

    public double obtenerValorSubtotal() {
        return valorSubtotal;
    }

    public double obtenerValorIva() {
        return valorIva;
    }

    @Override
    public String toString() {
        String cadena = String.format("Factura\n"
                + "Cliente: %s", 
                nombreCliente);
        for (int i = 0; i < menu.size(); i++) {
           cadena  = String.format("%s%s",cadena,menu.get(i));
        }
        cadena = String.format("%sSubtotal: $%.2f\n"
                + "IVA: %.2f porciento\n"
                + "Total a Pagar: $%.2f\n",
                cadena,
                valorSubtotal,
                valorIva,
                valorTotal);

        return cadena;
    }

}
