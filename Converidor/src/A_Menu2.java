import javax.swing.*;


public class A_Menu2 extends JFrame {
    public static void main (String [] args) {


        ConvertirMonedas tipo = new ConvertirMonedas();
        ConvertidorTemperatura grados = new ConvertidorTemperatura();
        ConvertidorKilometros varios = new ConvertidorKilometros();
        
        
        
        

        boolean flag = true;

        while(flag) {
                                                           // componente padre, mensaje, titulo, clase estaticaa, icono, array o arreglo, inicializacion del array
            String opciones = (JOptionPane.showInputDialog(null,"Selecione una opción",
            "Menu",JOptionPane.QUESTION_MESSAGE,
            null, new Object[] {"Selecione una opción","Convertidor de Moneda", "Convertidor de Temperatura","Convertidor de Longitud"},
            "Seleccion")).toString();

            

            switch(opciones) {

                case "Convertidor de Moneda":

                    String opcion = (JOptionPane.showInputDialog(null,"Elige la moneda a la que deeas convertir tu dinero",
                    "Monedas",JOptionPane.PLAIN_MESSAGE,null,
                    new Object[] {"Seleciona una Opción","De Pesos a Dolar", "De Pesos a Euro","De Pesos a Libras","De Pesos a Yen", "De Pesos a Won Coreano",
                    "De Dolares a Pesos","De Euros a Pesos","De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"},
                    "Selecion")).toString();

                    switch(opcion){

                        case "De Pesos a Dolar":
                            String input = JOptionPane.showInputDialog(null, " Ingrese la cantidad de dinero que deeses convertir: ");
                            if (ValidarNumero(input)) {
                                double Minput = Double.parseDouble(input);
                                tipo.ConvertirPesosDolares(Minput);
                            }else {
                                JOptionPane.showMessageDialog(null, "Valor invalido");
                            }
                        break;

                        case "De Pesos a Euro":
                            String Euro = JOptionPane.showInputDialog(null, " Ingrese la cantidad de dinero que deeses convertir: ");
                            if (ValidarNumero(Euro)) {
                                double Minput = Double.parseDouble(Euro);
                                tipo.ConvertirPesosEuros(Minput);
                            }else {
                                JOptionPane.showMessageDialog(null, "Valor invalido");
                            }
                        break;

                        case "De Pesos a Libras":
                            String Libra = JOptionPane.showInputDialog(null, " Ingrese la cantidad de dinero que deeses convertir: ");
                            if (ValidarNumero(Libra)) {
                                double Minput = Double.parseDouble(Libra);
                                tipo.ConvertirPesosLibras(Minput);
                            }else {
                                JOptionPane.showMessageDialog(null, "Valor invalido");
                            }
                        break;

                        case "De Pesos a Yen":
                            String Yen = JOptionPane.showInputDialog(null, " Ingrese la cantidad de dinero que deeses convertir: ");
                            if (ValidarNumero(Yen)) {
                                double Minput = Double.parseDouble(Yen);
                                tipo.ConvertirPesosYen(Minput);
                            }else {
                                JOptionPane.showMessageDialog(null, "Valor invalido");
                            }
                        break;

                        case "De Pesos a Won Coreano":
                            String Won = JOptionPane.showInputDialog(null, " Ingrese la cantidad de dinero que deeses convertir: ");
                            if (ValidarNumero(Won)) {
                                double Minput = Double.parseDouble(Won);
                                tipo.ConvertirPesosWon(Minput);
                            }else {
                                JOptionPane.showMessageDialog(null, "Valor invalido");
                            }
                        break;

                        case "De Dolares a Pesos":
                            String PesosD = JOptionPane.showInputDialog(null, " Ingrese la cantidad de dinero que deeses convertir: ");
                            if (ValidarNumero(PesosD)) {
                                double Minput = Double.parseDouble(PesosD);
                                tipo.ConvertirDolarPesos(Minput);
                            }else {
                                JOptionPane.showMessageDialog(null, "Valor invalido");
                            }
                        break;

                        case "De Euro a Pesos":
                            String PesosE = JOptionPane.showInputDialog(null, " Ingrese la cantidad de dinero que deeses convertir: ");
                            if (ValidarNumero(PesosE)) {
                                double Minput = Double.parseDouble(PesosE);
                                tipo.ConvertirEuroPeso(Minput);
                            }else {
                                JOptionPane.showMessageDialog(null, "Valor invalido");
                            }
                        break;

                        case "De Libras a Pesos":
                            String PesosL = JOptionPane.showInputDialog(null, " Ingrese la cantidad de dinero que deeses convertir: ");
                            if (ValidarNumero(PesosL)) {
                                double Minput = Double.parseDouble(PesosL);
                                tipo.ConvertirLibrasPeso(Minput);
                            }else {
                                JOptionPane.showMessageDialog(null, "Valor invalido");
                            }
                        break;

                        case "De Yen a Pesos":
                            String PesosY = JOptionPane.showInputDialog(null, " Ingrese la cantidad de dinero que deeses convertir: ");
                            if (ValidarNumero(PesosY)) {
                                double Minput = Double.parseDouble(PesosY);
                                tipo.ConvertirYenPesos(Minput);
                            }else {
                                JOptionPane.showMessageDialog(null, "Valor invalido");
                            }
                        break;

                        case "De Won Coreano a Pesos":
                        String PesosW = JOptionPane.showInputDialog(null, " Ingrese la cantidad de dinero que deeses convertir: ");
                        if (ValidarNumero(PesosW)) {
                            double Minput = Double.parseDouble(PesosW);
                            tipo.ConvertirWonPesos(Minput);
                        }else {
                            JOptionPane.showMessageDialog(null, "Valor invalido");
                        }
                        break;
                    
                     
                    }
                     int respuesta = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion");
                        if (JOptionPane.OK_OPTION == respuesta) {
                        System.out.println("Selecciona opción Afirmativa");
                        }else {
                        flag = false;
                        JOptionPane.showMessageDialog(null, "Programa Terminado");
                        }
                break;    
                

                case "Convertidor de Temperatura":
                    String temp = (JOptionPane.showInputDialog(null,"Elige los grados de Temperatura que desees trasformar: ",
                    "Temperaturas",JOptionPane.PLAIN_MESSAGE,null,
                    new Object[] {"Seleciona una Opción","De Celsius (°C) a Fahrenhit (°F)", "De Celsius (°C) a Kelvin (K)","De Fahrenhit (°F) a Celsius (°C)","De Fahrenhit (°F) a Kelvin (K)",
                    "De Kelvin (K) a Celsius (°C)","De Kelvin (K) a Fahrenhit (°F)"},"Selecion")).toString();

                    switch(temp){
                        
                        case "De Celsius (°C) a Fahrenhit (°F)":
                            String celsuiusF = JOptionPane.showInputDialog(null, " Ingrese la cantidad de grados Celsius (°C) que deeses convertir: ");
                            if (ValidarNumero(celsuiusF)) {
                                double Minput = Double.parseDouble(celsuiusF);
                                grados.ConvertirCelsiusFahrenheit(Minput);
                            }else {
                                JOptionPane.showMessageDialog(null, "Valor invalido");
                            }
                        break;

                        case "De Celsius (°C) a Kelvin (K)":
                            String celsuiusK = JOptionPane.showInputDialog(null, " Ingrese la cantidad de grados Celsius (°C) que deeses convertir: ");
                            if (ValidarNumero(celsuiusK)) {
                                double Minput = Double.parseDouble(celsuiusK);
                                grados.ConvertirCelsiusFahrenheit(Minput);
                            }else {
                                JOptionPane.showMessageDialog(null, "Valor invalido");
                            }
                        break;

                        case "De Fahrenhit (°F) a Celsius (°C)":
                            String fahrenheitC = JOptionPane.showInputDialog(null, " Ingrese la cantidad de grados Celsius (°C) que deeses convertir: ");
                            if (ValidarNumero(fahrenheitC)) {
                                double Minput = Double.parseDouble(fahrenheitC);
                                grados.ConvertirCelsiusFahrenheit(Minput);
                            }else {
                                JOptionPane.showMessageDialog(null, "Valor invalido");
                            }
                        break;

                        case "De Fahrenhit (°F) a Kelvin (K)":
                            String fahrenheitK = JOptionPane.showInputDialog(null, " Ingrese la cantidad de grados Celsius (°C) que deeses convertir: ");
                            if (ValidarNumero(fahrenheitK)) {
                                double Minput = Double.parseDouble(fahrenheitK);
                                grados.ConvertirCelsiusFahrenheit(Minput);
                            }else {
                                JOptionPane.showMessageDialog(null, "Valor invalido");
                            }
                        break;

                        case "De Kelvin (K) a Celsius (°C)":
                            String kevinC = JOptionPane.showInputDialog(null, " Ingrese la cantidad de grados Celsius (°C) que deeses convertir: ");
                            if (ValidarNumero(kevinC)) {
                                double Minput = Double.parseDouble(kevinC);
                                grados.ConvertirCelsiusFahrenheit(Minput);
                            }else {
                                JOptionPane.showMessageDialog(null, "Valor invalido");
                            }
                        break;

                        case "De Kelvin (K) a Fahrenhit (°F)":
                            String kevinF = JOptionPane.showInputDialog(null, " Ingrese la cantidad de grados Celsius (°C) que deeses convertir: ");
                            if (ValidarNumero(kevinF)) {
                                double Minput = Double.parseDouble(kevinF);
                                grados.ConvertirCelsiusFahrenheit(Minput);
                            }else {
                                JOptionPane.showMessageDialog(null, "Valor invalido");
                            }
                    break;

                }
                int respuestaDos = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion");
                    if (JOptionPane.OK_OPTION == respuestaDos) {
                        System.out.println("Selecciona opción Afirmativa");
                    }else {
                        flag = false;
                        JOptionPane.showMessageDialog(null, "Programa Terminado");
                    }

                break;

                case "Convertidor de Longitud":
                    String longitud = (JOptionPane.showInputDialog(null,"Elige la longitud que desees trasformar: ",
                    "Temperaturas",JOptionPane.PLAIN_MESSAGE,null,
                    new Object[] {"Seleciona una Opción","De Kilometros a Varios ", "De Hectometros a Varios ","De Decametro a Varios ","De Metros a Varios ",
                    "De Decimetros a Varios ","De Centimetros a Varios ","De Milimetros a Varios ","De Pulgada a Varios ","De Yarda a Varios ",
                    "De Pies a Varios ","De Milla a Varios "},"Selecion")).toString();

                    switch(longitud){
                        
                        case "De Kilometros a Varios ":
                            String KiloM = JOptionPane.showInputDialog(null, " Ingrese la cantidad de Kilometros (km) que deeses convertir: ");
                            if (ValidarNumero(KiloM)) {
                                double Minput = Double.parseDouble(KiloM);
                                varios.ConvertirKilometroAVarios(Minput);
                            }else {
                                JOptionPane.showMessageDialog(null, "Valor invalido");
                            }
                        break;
                        case "De Hectometros a Varios ":
                            String hecto = JOptionPane.showInputDialog(null, " Ingrese la cantidad de Hectometros (hm) que deeses convertir: ");
                            if (ValidarNumero(hecto)) {
                                double Minput = Double.parseDouble(hecto);
                                varios.ConvertirHetoAVarios(Minput);
                            }else {
                                JOptionPane.showMessageDialog(null, "Valor invalido");
                            }
                        break;
                        case "De Decametro a Varios ":
                        String deca = JOptionPane.showInputDialog(null, " Ingrese la cantidad de Decametros (dam) que deeses convertir: ");
                        if (ValidarNumero(deca)) {
                            double Minput = Double.parseDouble(deca);
                            varios.ConvertirDecaAVarios(Minput);
                        }else {
                            JOptionPane.showMessageDialog(null, "Valor invalido");
                        }
                        break;
                        case "De Metros a Varios ":
                        String metro = JOptionPane.showInputDialog(null, " Ingrese la cantidad de Metros (m) que deeses convertir: ");
                        if (ValidarNumero(metro)) {
                            double Minput = Double.parseDouble(metro);
                            varios.ConvertirMetroAVarios(Minput);
                        }else {
                            JOptionPane.showMessageDialog(null, "Valor invalido");
                        }
                        break;
                        case "De Decimetros a Varios ":
                        String deci = JOptionPane.showInputDialog(null, " Ingrese la cantidad de Decimetros (dm) que deeses convertir: ");
                        if (ValidarNumero(deci)) {
                            double Minput = Double.parseDouble(deci);
                            varios.ConvertirDecimetroAVArios(Minput);
                        }else {
                            JOptionPane.showMessageDialog(null, "Valor invalido");
                        }
                        break;
                        case "De Centimetros a Varios ":
                        String centi = JOptionPane.showInputDialog(null, " Ingrese la cantidad de Centimetros (cm) que deeses convertir: ");
                        if (ValidarNumero(centi)) {
                            double Minput = Double.parseDouble(centi);
                            varios.ConvertirCentiAVarios(Minput);
                        }else {
                            JOptionPane.showMessageDialog(null, "Valor invalido");
                        }
                        break;
                        case "De Milimetros a Varios ":
                        String mili = JOptionPane.showInputDialog(null, " Ingrese la cantidad de Centimetros (cm) que deeses convertir: ");
                        if (ValidarNumero(mili)) {
                            double Minput = Double.parseDouble(mili);
                            varios.ConvertirMiliAvarios(Minput);
                        }else {
                            JOptionPane.showMessageDialog(null, "Valor invalido");
                        }
                        break;
                        case "De Pulgada a Varios ":
                        String pulga = JOptionPane.showInputDialog(null, " Ingrese la cantidad de Centimetros (cm) que deeses convertir: ");
                        if (ValidarNumero(pulga)) {
                            double Minput = Double.parseDouble(pulga);
                            varios.ConvertirPulgAVarios(Minput);
                        }else {
                            JOptionPane.showMessageDialog(null, "Valor invalido");
                        }
                        break;
                        case "De Yarda a Varios ":
                        String yarda = JOptionPane.showInputDialog(null, " Ingrese la cantidad de Centimetros (cm) que deeses convertir: ");
                        if (ValidarNumero(yarda)) {
                            double Minput = Double.parseDouble(yarda);
                            varios.ConvertirYardasAVarios(Minput);
                        }else {
                            JOptionPane.showMessageDialog(null, "Valor invalido");
                        }
                        break;
                        case "De Pies a Varios ":
                        String pies = JOptionPane.showInputDialog(null, " Ingrese la cantidad de Centimetros (cm) que deeses convertir: ");
                        if (ValidarNumero(pies)) {
                            double Minput = Double.parseDouble(pies);
                            varios.ConvertirPiesAVarios(Minput);
                        }else {
                            JOptionPane.showMessageDialog(null, "Valor invalido");
                        }
                        break;
                        case "De Milla a Varios ":
                        String milla = JOptionPane.showInputDialog(null, " Ingrese la cantidad de Centimetros (cm) que deeses convertir: ");
                        if (ValidarNumero(milla)) {
                            double Minput = Double.parseDouble(milla);
                            varios.ConvertirMillaAVarios(Minput);
                        }else {
                            JOptionPane.showMessageDialog(null, "Valor invalido");
                        }
                        break;

                        
                        
                        
                        
                    }

                    int respuesta2 = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion");
                        if (JOptionPane.OK_OPTION == respuesta2) {
                        System.out.println("Selecciona opción Afirmativa");
                        }else {
                        flag = false;
                        JOptionPane.showMessageDialog(null, "Programa Terminado");
                        }
                break;
        
            }

        }

    }

    public static boolean ValidarNumero(String input) {
        try{
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

