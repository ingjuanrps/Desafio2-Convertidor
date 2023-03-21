import javax.swing.JOptionPane;

public class ConvertidorTemperatura {
    
    public void ConvertirCelsiusFahrenheit(double valor) {
        double temperaturaCaF = (valor * 1.8)+32;
        temperaturaCaF = (double) Math.round(temperaturaCaF);
        JOptionPane.showMessageDialog(null,
        "Convertir "+valor+" °C a Fahrenheit (°F) "+"\n Tienes " + temperaturaCaF + " °F grados Fahrenhiet.",
        "Celsius a Fahrenheit", 1);
    }

    public void ConvertirCelsiusKelvin(double valor) {
        double temperaturaCaK = (valor + 273.15);
        temperaturaCaK = (double) Math.round(temperaturaCaK);
        JOptionPane.showMessageDialog(null,
        "Convertir "+valor+" °C a Kelvin (K) "+"\n Tienes " + temperaturaCaK + " K grados Kelvin.",
        "Celsius a Kelvin", 1);
    }

    public void ConvertirFahrenheitCelsius(double valor) {
        double temperaturaFaC = (valor - 32)*.55555;
        temperaturaFaC = (double) Math.round(temperaturaFaC);
        JOptionPane.showMessageDialog(null,
        "Convertir "+valor+" °F a Celsius (°C) "+"\n Tienes " + temperaturaFaC + " °C grados Celsius.",
        "Fahrenheit a Celsius", 1);
    }

    public void ConvertirFahrenheitKelvin(double valor) {
        double temperaturaFaK = ((valor - 32)*.55555)+273.15;
        temperaturaFaK = (double) Math.round(temperaturaFaK);
        JOptionPane.showMessageDialog(null,
        "Convertir "+valor+" °F a Kelvin (K) "+"\n Tienes " + temperaturaFaK + " K grados Kelvin.",
        "Faharenheit a Kelvin", 1);
    }

    public void ConvertirKelvinCelsisu(double valor) {
        double temperaturaKaC = (valor - 273.15);
        temperaturaKaC = (double) Math.round(temperaturaKaC);
        JOptionPane.showMessageDialog(null,
        "Convertir "+valor+" K a Celsius (°C) "+"\n Tienes " + temperaturaKaC + " °C grados Celsius.",
        "Kelvin a Celsius", 1);
    }

    public void ConvertirKelvinFahrenheit(double valor) {
        double temperaturaKaF = ((valor -273.15)*1.8)+32;
        temperaturaKaF = (double) Math.round(temperaturaKaF);
        JOptionPane.showMessageDialog(null,
        "Convertir "+valor+" K a Fahrenheit (°F) "+"\n Tienes " + temperaturaKaF + " °F grados Fahrenheit.",
        "Kelvin a Fahrenheit", 1);
    }
}
