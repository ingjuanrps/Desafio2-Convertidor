import javax.swing.JOptionPane;

public class ConvertirMonedas {

    public void ConvertirPesosDolares(double valor) {
        double monedaDolar = valor * .053;
        monedaDolar = (double) Math.round(monedaDolar);
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares", "Peso a Dolar", 1);
    }

    public void ConvertirPesosEuros(double valor) {
        double monedaEuro = valor * .050;
        monedaEuro = (double) Math.round(monedaEuro *100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros", "Peso a Euro", 1);
    }

    public void ConvertirPesosLibras(double valor) {
        double monedaLibra = valor * .043;
        monedaLibra = (double) Math.round(monedaLibra *100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras", "Pesos a Libra", 1);
    }

    public void ConvertirPesosYen(double valor) {
        double monedaYen = valor * 6.97;
        monedaYen = (double) Math.round(monedaYen *100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yenes", "Peso a Yen", 1);
    }

    public void ConvertirPesosWon(double valor) {
        double monedaWon = valor * 69.2;
        monedaWon = (double) Math.round(monedaWon *100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won Coreano", "Peso a Won Coreano", 1);
    }

    public void ConvertirDolarPesos(double valor) {
        double monedaPesosD = valor * 18.91;
        monedaPesosD = (double) Math.round(monedaPesosD *100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosD + " Pesos", "Dolar a Peso", 1);
    }

    public void ConvertirEuroPeso(double valor) {
        double monedaPesosE = valor * 20.23;
        monedaPesosE = (double) Math.round(monedaPesosE *100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosE + " Pesos", "Euro a Peso", 1);
    }

    public void ConvertirLibrasPeso(double valor) {
        double monedaPesosL = valor * 23.04;
        monedaPesosL = (double) Math.round(monedaPesosL *100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosL + " Pesos", "Libra a Peso", 1);
    }

    public void ConvertirYenPesos(double valor) {
        double monedaPesosY = valor * .14;
        monedaPesosY = (double) Math.round(monedaPesosY *100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosY + "Pesos", "Yen a Peso", 1);
    }

    public void ConvertirWonPesos(double valor) {
        double monedaPesosW = valor * .014;
        monedaPesosW = (double) Math.round(monedaPesosW *100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPesosW + "Won Coreano a Peso", null, 1);
    }

    
    
}
