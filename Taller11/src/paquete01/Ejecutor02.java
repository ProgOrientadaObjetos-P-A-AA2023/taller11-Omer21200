/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete0.Cuenta;
import paquete0.Menu;
import paquete0.MenuCarta;
import paquete0.MenuDia;
import paquete0.MenuEconomico;
import paquete0.MenuNinos;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {

    public static void main(String[] args) {

        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};

        // Lista de Menus
        ArrayList<Menu> listaMenu = new ArrayList<>();

        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        String nombrePlato = "";
        double vInicial = 0;

        double valHelado = 0;
        double valPastel = 0;

        double porcDescuento = 0;

        double valPostre = 0;
        double valBebidaDia = 0;

        double valGuarnicion = 0;
        double valBebidaCarta = 0;
        double porcentajeAd = 0;

        // Datos 001
        for (int i = 0; i < datos001.length; i++) {
            for (int j = 0; j < datos001[0].length; j++) {
                switch (j) {
                    case 0:
                        nombrePlato = datos001[i][j];
                        break;
                    case 1:
                        vInicial = Double.parseDouble(datos001[i][j]);
                        break;
                    case 2:
                        valHelado = Double.parseDouble(datos001[i][j]);
                        break;
                    case 3:
                        valPastel = Double.parseDouble(datos001[i][j]);
                        break;
                }
            }
            MenuNinos menuNinios
                    = new MenuNinos(valHelado, valPastel,
                            nombrePlato, vInicial);
            listaMenu.add(menuNinios);
        }

        // Datos 002
        for (int i = 0; i < datos002.length; i++) {
            for (int j = 0; j < datos002[0].length; j++) {
                switch (j) {
                    case 0:
                        nombrePlato = datos002[i][j];
                        break;
                    case 1:
                        vInicial = Double.parseDouble(datos002[i][j]);
                        break;
                    case 2:
                        porcDescuento = Double.parseDouble(datos002[i][j]);
                        break;
                }
            }
            MenuEconomico menuEconomico
                    = new MenuEconomico(porcDescuento, nombrePlato,
                            vInicial);
            listaMenu.add(menuEconomico);
        }

        // Datos 003
        for (int i = 0; i < datos003.length; i++) {
            for (int j = 0; j < datos003[0].length; j++) {
                switch (j) {
                    case 0:
                        nombrePlato = datos003[i][j];
                        break;
                    case 1:
                        vInicial = Double.parseDouble(datos003[i][j]);
                        break;
                    case 2:
                        valPostre = Double.parseDouble(datos003[i][j]);
                        break;
                    case 3:
                        valBebidaDia = Double.parseDouble(datos003[i][j]);
                        break;
                }
            }
            MenuDia menuDia
                    = new MenuDia(valPostre, valBebidaDia,
                            nombrePlato, vInicial);
            listaMenu.add(menuDia);
        }

        // Datos004
        for (int i = 0; i < datos004.length; i++) {
            for (int j = 0; j < datos004[0].length; j++) {
                switch (j) {
                    case 0:
                        nombrePlato = datos004[i][j];
                        break;
                    case 1:
                        vInicial = Double.parseDouble(datos004[i][j]);
                        break;
                    case 2:
                        valGuarnicion = Double.parseDouble(datos004[i][j]);
                        break;
                    case 3:
                        valBebidaCarta = Double.parseDouble(datos004[i][j]);
                        break;
                    case 4:
                        porcentajeAd = Double.parseDouble(datos004[i][j]);
                        break;
                }
            }
            MenuCarta menuCarta
                    = new MenuCarta(valGuarnicion, valBebidaCarta,
                            porcentajeAd, nombrePlato,
                            vInicial);
            listaMenu.add(menuCarta);
        }

        // Fin de solución
        for (int i = 0; i < listaMenu.size(); i++) {
            listaMenu.get(i).calcularValorMenu();
        }

        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", listaMenu, 10);
        miCuenta.calcularValorSubtotal();
        miCuenta.calcularValorTotal();
        System.out.println(miCuenta);

    }
}
