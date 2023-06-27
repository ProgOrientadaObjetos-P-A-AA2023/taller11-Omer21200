/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete0;

/**
 *
 * @author luisa
 */
public class MenuNinios extends Menu {

    private double valorH;
    private double valorP;

    public MenuNinios(double valH, double valP, String nomPlat, double valInM) {
        super(nomPlat, valInM);
        valorH = valH;
        valorP = valP;
    }

    public void establecerValorHelado(double valH) {
        valorH = valH;
    }

    public void establecerValorPastel(double valP) {
        valorP = valP;
    }

    public double obtenerValorPastel() {
        return valorP;
    }

    public double obtenerValorHelado() {
        return valorH;
    }

    @Override
    public void calcularValorMenu() {
        valorM = valorI + valorH + valorP;
    }

    @Override
    public String toString() {
        String Cadena = String.format("\nMenu de Niños:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial menu: $%.2f\n"
                + "\tValor porcion helado: $%.2f\n"
                + "\tValor porcion pastel: $%.2f\n"
                + "\tValor Menu: $%.2f\n\n",
                nombreP,
                valorI,
                valorH,
                valorP,
                valorM);
        return Cadena;
    }

}
