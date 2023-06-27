/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import java.util.List;
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
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereList<Menu> lista = new ArrayList<>();

        List<Menu> listaMenu = new ArrayList<>();

        MenuNinos ninos =  new MenuNinos(1, 1.5, "Niños 01",2);
        ninos.calcularValorMenu();
        listaMenu.add(ninos);

        MenuNinos menuNinios02 = new MenuNinos(1, 1.5, "Niños 02",3);
        menuNinios02.calcularValorMenu();
        listaMenu.add(menuNinios02);

        MenuEconomico econ = new MenuEconomico(25, "Econo 001", 4);
        econ.calcularValorMenu();
        listaMenu.add(econ);

        MenuDia dia = new MenuDia(1, 1, "Dia 001", 5);
        dia.calcularValorMenu();
        listaMenu.add(dia);

        MenuCarta carta =new MenuCarta(1.5, 2, 10, "Carta001",
                        6);
        carta.calcularValorMenu();
        listaMenu.add(carta);

        Cuenta cuenta = new Cuenta("René Elizalde", listaMenu, 10);
        cuenta.calcularValorSubtotal();
        cuenta.calcularValorTotal();

        System.out.println(cuenta);
    }
    
    
}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/