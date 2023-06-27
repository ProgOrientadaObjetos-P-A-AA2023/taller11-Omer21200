
package paquete0;

public class MenuDia extends Menu{
    
    private double valorP;
    private double valorB;
    
    public MenuDia(double valP,double valB,String nomPlat, double valInM) {
        super(nomPlat, valInM);
        valorP = valP;
        valorB = valB;
    }

    public void establecerValorPostre(double valP) {
        valorP= valP;
    }
    
     public void establecerValorBebida(double valB) {
        valorB = valB;
    }
     
     public double obtenerValorPostre() {
        return valorP;
    }

    public double obtenerValorBebida() {
        return valorB;
    }

    @Override
    public void calcularValorMenu() {
        valorM = valorI + valorB + valorP;
    }

    @Override
    public String toString() {
        String Cadena = String.format("Menu del Dia:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial del menu: $%.2f\n"
                + "\tValor del postre: $%.2f\n"
                + "\tValor bebida: $%.2f\n"
                + "\tValor del Menu: $%.2f\n\n",
                nombreP,
                valorI,
                valorP,
                valorB,
                valorM);
        return Cadena;
    }
}
